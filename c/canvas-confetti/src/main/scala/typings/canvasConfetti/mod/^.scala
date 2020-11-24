package typings.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvas-confetti", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): js.Promise[Null] | Null = js.native
  def apply(options: Options): js.Promise[Null] | Null = js.native
  
  /**
    * You can polyfill promises using any of the popular polyfills. You can also provide a promise implementation to `confetti` through this property.
    */
  var Promise: js.Any = js.native
}
