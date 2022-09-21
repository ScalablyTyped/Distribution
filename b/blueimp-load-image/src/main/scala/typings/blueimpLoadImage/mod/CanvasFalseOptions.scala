package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasFalseOptions
  extends StObject
     with CanvasOptions {
  
  var canvas: js.UndefOr[`false`] = js.undefined
}
object CanvasFalseOptions {
  
  inline def apply(): CanvasFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasFalseOptions]
  }
  
  extension [Self <: CanvasFalseOptions](x: Self) {
    
    inline def setCanvas(value: `false`): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
  }
}
