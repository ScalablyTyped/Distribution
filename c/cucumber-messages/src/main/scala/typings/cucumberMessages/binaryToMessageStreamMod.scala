package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.protobufjs.mod.Reader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryToMessageStreamMod {
  
  @JSImport("cucumber-messages/dist/src/BinaryToMessageStream", JSImport.Default)
  @js.native
  open class default[T] protected () extends BinaryToMessageStream[T] {
    def this(decodeDelimited: js.Function1[/* reader */ Reader | js.typedarray.Uint8Array, T]) = this()
  }
  
  @js.native
  trait BinaryToMessageStream[T] extends Transform {
    
    def _transform(chunk: Any, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ val decodeDelimited: Any = js.native
  }
}
