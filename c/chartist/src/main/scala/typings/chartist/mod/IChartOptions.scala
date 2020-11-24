package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartOptions extends js.Object {
  
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
  implicit class IChartOptionsOps[Self <: IChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setReverseData(value: Boolean): Self = this.set("reverseData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseData: Self = this.set("reverseData", js.undefined)
  }
}
