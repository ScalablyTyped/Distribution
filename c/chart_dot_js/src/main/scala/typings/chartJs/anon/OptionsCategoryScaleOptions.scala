package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.CategoryScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsCategoryScaleOptions extends StObject {
  
  var options: CategoryScaleOptions
}
object OptionsCategoryScaleOptions {
  
  inline def apply(options: CategoryScaleOptions): OptionsCategoryScaleOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCategoryScaleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsCategoryScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: CategoryScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
