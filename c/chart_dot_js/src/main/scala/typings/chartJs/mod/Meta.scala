package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends js.Object {
  
  @JSName("$filler")
  var $filler: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var controller: StringDictionary[js.Any] = js.native
  
  var data: js.Array[MetaData] = js.native
  
  var dataset: js.UndefOr[ChartDataSets] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var total: js.UndefOr[String] = js.native
  
  var `type`: ChartType = js.native
  
  var xAxisID: js.UndefOr[String] = js.native
  
  var yAxisID: js.UndefOr[String] = js.native
}
object Meta {
  
  @scala.inline
  def apply(controller: StringDictionary[js.Any], data: js.Array[MetaData], `type`: ChartType): Meta = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    
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
    def setController(value: StringDictionary[js.Any]): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: MetaData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[MetaData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChartType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$filler(value: StringDictionary[js.Any]): Self = this.set("$filler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$filler: Self = this.set("$filler", js.undefined)
    
    @scala.inline
    def setDataset(value: ChartDataSets): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    
    @scala.inline
    def setXAxisID(value: String): Self = this.set("xAxisID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisID: Self = this.set("xAxisID", js.undefined)
    
    @scala.inline
    def setYAxisID(value: String): Self = this.set("yAxisID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisID: Self = this.set("yAxisID", js.undefined)
  }
}
