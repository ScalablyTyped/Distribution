package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageToBinaryStreamMod {
  
  @JSImport("cucumber-messages/dist/src/MessageToBinaryStream", JSImport.Default)
  @js.native
  open class default[T] () extends MessageToBinaryStream[T]
  
  @js.native
  trait MessageToBinaryStream[T] extends Transform {
    
    def _transform(message: T, encoding: String, callback: TransformCallback): Unit = js.native
  }
}
