package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages/dist/src/MessageToNdjsonStream", JSImport.Namespace)
@js.native
object messageToNdjsonStreamMod extends js.Object {
  
  @js.native
  trait MessageToNdjsonStream[T] extends Transform {
    
    def _transform(message: T, encoding: String, callback: TransformCallback): Unit = js.native
  }
  
  @js.native
  class default[T] () extends MessageToNdjsonStream[T]
}
