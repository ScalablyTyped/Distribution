package typings.cometd

import typings.cometd.mod.CometD
import typings.cometd.mod.Extension
import typings.cometd.mod.Listener
import typings.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reloadExtensionMod {
  
  @JSImport("cometd/ReloadExtension", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ReloadExtension {
    
    /* CompleteClass */
    @JSName("incoming")
    override def incoming_MReloadExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("outgoing")
    override def outgoing_MReloadExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("registered")
    override def registered_MReloadExtension(name: String, cometd: CometD): Unit = js.native
    
    /* CompleteClass */
    @JSName("unregistered")
    override def unregistered_MReloadExtension(): Unit = js.native
  }
  
  trait ReloadExtension
    extends StObject
       with Extension {
    
    @JSName("incoming")
    def incoming_MReloadExtension(message: Message): Unit
    @JSName("incoming")
    var incoming_Original: Listener
    
    @JSName("outgoing")
    def outgoing_MReloadExtension(message: Message): Unit
    @JSName("outgoing")
    var outgoing_Original: Listener
    
    @JSName("registered")
    def registered_MReloadExtension(name: String, cometd: CometD): Unit
    
    @JSName("unregistered")
    def unregistered_MReloadExtension(): Unit
  }
  object ReloadExtension {
    
    inline def apply(
      incoming: /* message */ Message => Unit,
      outgoing: /* message */ Message => Unit,
      registered: (String, CometD) => Unit,
      unregistered: () => Unit
    ): ReloadExtension = {
      val __obj = js.Dynamic.literal(incoming = js.Any.fromFunction1(incoming), outgoing = js.Any.fromFunction1(outgoing), registered = js.Any.fromFunction2(registered), unregistered = js.Any.fromFunction0(unregistered))
      __obj.asInstanceOf[ReloadExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReloadExtension] (val x: Self) extends AnyVal {
      
      inline def setIncoming(value: /* message */ Message => Unit): Self = StObject.set(x, "incoming", js.Any.fromFunction1(value))
      
      inline def setOutgoing(value: /* message */ Message => Unit): Self = StObject.set(x, "outgoing", js.Any.fromFunction1(value))
      
      inline def setRegistered(value: (String, CometD) => Unit): Self = StObject.set(x, "registered", js.Any.fromFunction2(value))
      
      inline def setUnregistered(value: () => Unit): Self = StObject.set(x, "unregistered", js.Any.fromFunction0(value))
    }
  }
}
