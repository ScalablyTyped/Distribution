package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartOptions extends StObject {
  
  var plugins: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
    */
  var reverseData: js.UndefOr[Boolean] = js.native
}
object IChartOptions {
  
  @scala.inline
  def apply(): IChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartOptions]
  }
  
  @scala.inline
  implicit class IChartOptionsMutableBuilder[Self <: IChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
  }
}
