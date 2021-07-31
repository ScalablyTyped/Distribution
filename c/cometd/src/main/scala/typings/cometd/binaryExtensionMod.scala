package typings.cometd

import typings.cometd.mod.Extension
import typings.cometd.mod.Listener
import typings.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryExtensionMod {
  
  @JSImport("cometd/BinaryExtension", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with BinaryExtension {
    
    /* CompleteClass */
    @JSName("incoming")
    override def incoming_MBinaryExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("outgoing")
    override def outgoing_MBinaryExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
  }
  
  trait BinaryExtension
    extends StObject
       with Extension {
    
    @JSName("incoming")
    def incoming_MBinaryExtension(message: Message): Unit
    @JSName("incoming")
    var incoming_Original: Listener
    
    @JSName("outgoing")
    def outgoing_MBinaryExtension(message: Message): Unit
    @JSName("outgoing")
    var outgoing_Original: Listener
  }
  object BinaryExtension {
    
    @scala.inline
    def apply(incoming: /* message */ Message => Unit, outgoing: /* message */ Message => Unit): BinaryExtension = {
      val __obj = js.Dynamic.literal(incoming = js.Any.fromFunction1(incoming), outgoing = js.Any.fromFunction1(outgoing))
      __obj.asInstanceOf[BinaryExtension]
    }
    
    @scala.inline
    implicit class BinaryExtensionMutableBuilder[Self <: BinaryExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncoming(value: /* message */ Message => Unit): Self = StObject.set(x, "incoming", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutgoing(value: /* message */ Message => Unit): Self = StObject.set(x, "outgoing", js.Any.fromFunction1(value))
    }
  }
}
