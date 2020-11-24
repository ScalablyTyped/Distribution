package typings.chartmogulNode.mod.DataSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSources extends js.Object {
  
  var data_sources: js.Array[typings.chartmogulNode.mod.DataSource.DataSource] = js.native
}
object DataSources {
  
  @scala.inline
  def apply(data_sources: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]): DataSources = {
    val __obj = js.Dynamic.literal(data_sources = data_sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSources]
  }
  
  @scala.inline
  implicit class DataSourcesOps[Self <: DataSources] (val x: Self) extends AnyVal {
    
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
    def setData_sourcesVarargs(value: typings.chartmogulNode.mod.DataSource.DataSource*): Self = this.set("data_sources", js.Array(value :_*))
    
    @scala.inline
    def setData_sources(value: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]): Self = this.set("data_sources", value.asInstanceOf[js.Any])
  }
}
