package typings.cucumberMessages

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageToNdjsonStreamMod {
  
  @JSImport("cucumber-messages/dist/src/MessageToNdjsonStream", JSImport.Default)
  @js.native
  class default[T] () extends MessageToNdjsonStream[T]
  
  @js.native
  trait MessageToNdjsonStream[T] extends Transform {
    
    def _transform(message: T, encoding: String, callback: TransformCallback): Unit = js.native
  }
}
