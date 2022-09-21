package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CropFalseOptions
  extends StObject
     with CropOptions {
  
  var crop: js.UndefOr[`false`] = js.undefined
}
object CropFalseOptions {
  
  inline def apply(): CropFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropFalseOptions]
  }
  
  extension [Self <: CropFalseOptions](x: Self) {
    
    inline def setCrop(value: `false`): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
  }
}
