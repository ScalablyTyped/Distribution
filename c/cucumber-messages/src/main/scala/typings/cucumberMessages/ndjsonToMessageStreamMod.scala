package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ndjsonToMessageStreamMod {
  
  @JSImport("cucumber-messages/dist/src/NdjsonToMessageStream", JSImport.Default)
  @js.native
  open class default[T] protected () extends NdjsonToMessageStream[T] {
    def this(fromObject: js.Function1[/* object */ Any, T]) = this()
  }
  
  @js.native
  trait NdjsonToMessageStream[T] extends Transform {
    
    def _transform(chunk: String, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ val fromObject: Any = js.native
  }
}
