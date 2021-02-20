package typings.cometd

import typings.cometd.mod.Extension
import typings.cometd.mod.Listener
import typings.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryExtensionMod {
  
  @JSImport("cometd/BinaryExtension", JSImport.Default)
  @js.native
  class default () extends BinaryExtension
  
  @js.native
  trait BinaryExtension extends Extension {
    
    @JSName("incoming")
    def incoming_MBinaryExtension(message: Message): Unit = js.native
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    @JSName("outgoing")
    def outgoing_MBinaryExtension(message: Message): Unit = js.native
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
  }
}
