package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.LinearScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsLinearScaleOptions extends StObject {
  
  var options: LinearScaleOptions
}
object OptionsLinearScaleOptions {
  
  inline def apply(options: LinearScaleOptions): OptionsLinearScaleOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLinearScaleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsLinearScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: LinearScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
