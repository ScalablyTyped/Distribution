package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.protobufjs.mod.Reader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryToMessageStreamMod {
  
  @JSImport("cucumber-messages/dist/src/BinaryToMessageStream", JSImport.Default)
  @js.native
  class default[T] protected () extends BinaryToMessageStream[T] {
    def this(decodeDelimited: js.Function1[/* reader */ Reader | Uint8Array, T]) = this()
  }
  
  @js.native
  trait BinaryToMessageStream[T] extends Transform {
    
    def _transform(chunk: js.Any, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ var buffer: js.Any = js.native
    
    /* private */ val decodeDelimited: js.Any = js.native
  }
}
