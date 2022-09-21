package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.blueimpLoadImage.mod.CanvasTrueOptions
  - typings.blueimpLoadImage.mod.CanvasFalseOptions
*/
trait CanvasOptions extends StObject
object CanvasOptions {
  
  inline def CanvasFalseOptions(): typings.blueimpLoadImage.mod.CanvasFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.blueimpLoadImage.mod.CanvasFalseOptions]
  }
  
  inline def CanvasTrueOptions(): typings.blueimpLoadImage.mod.CanvasTrueOptions = {
    val __obj = js.Dynamic.literal(canvas = true)
    __obj.asInstanceOf[typings.blueimpLoadImage.mod.CanvasTrueOptions]
  }
}
