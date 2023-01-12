package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Setting 'aspectRatio' automatically enables 'crop', so setting 'crop' to
// 'false' in that case is not valid
trait CropTrueOptions
  extends StObject
     with CropOptions {
  
  var aspectRatio: js.UndefOr[AspectRatio] = js.undefined
  
  var crop: js.UndefOr[`true`] = js.undefined
}
object CropTrueOptions {
  
  inline def apply(): CropTrueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropTrueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CropTrueOptions] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: AspectRatio): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setCrop(value: `true`): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
  }
}
