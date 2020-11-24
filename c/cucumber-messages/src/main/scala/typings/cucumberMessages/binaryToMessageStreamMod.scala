package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.protobufjs.mod.Reader
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages/dist/src/BinaryToMessageStream", JSImport.Namespace)
@js.native
object binaryToMessageStreamMod extends js.Object {
  
  @js.native
  trait BinaryToMessageStream[T] extends Transform {
    
    def _transform(chunk: js.Any, encoding: String, callback: TransformCallback): Unit = js.native
    
    var buffer: js.Any = js.native
    
    val decodeDelimited: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends BinaryToMessageStream[T] {
    def this(decodeDelimited: js.Function1[/* reader */ Reader | Uint8Array, T]) = this()
  }
}
