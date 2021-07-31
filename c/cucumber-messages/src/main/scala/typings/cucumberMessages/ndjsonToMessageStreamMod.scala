package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ndjsonToMessageStreamMod {
  
  @JSImport("cucumber-messages/dist/src/NdjsonToMessageStream", JSImport.Default)
  @js.native
  class default[T] protected () extends NdjsonToMessageStream[T] {
    def this(fromObject: js.Function1[/* object */ js.Any, T]) = this()
  }
  
  @js.native
  trait NdjsonToMessageStream[T] extends Transform {
    
    def _transform(chunk: String, encoding: String, callback: TransformCallback): Unit = js.native
    
    var buffer: js.Any = js.native
    
    val fromObject: js.Any = js.native
  }
}
