package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Setting 'orientation' automatically sets 'meta' to true
// so setting it to false is not valid in that case
trait MetaTrueOptions
  extends StObject
     with MetaOptions {
  
  var meta: js.UndefOr[`true`] = js.undefined
  
  var orientation: Orientation
}
object MetaTrueOptions {
  
  inline def apply(orientation: Orientation): MetaTrueOptions = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaTrueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaTrueOptions] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: `true`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
