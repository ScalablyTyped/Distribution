package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSummary extends js.Object {
  
  /**
    * The UNIX datetime that the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The unique identifier for the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  
  /**
    * The name of the data source.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  
  /**
    * The status of the data source. When the status is ATIVE the data source is ready to use.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  
  /**
    * The UNIX datetime that the data source was lasted updated. 
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}
object DataSourceSummary {
  
  @scala.inline
  def apply(): DataSourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSummary]
  }
  
  @scala.inline
  implicit class DataSourceSummaryOps[Self <: DataSourceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setId(value: DataSourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: DataSourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatus(value: DataSourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setType(value: DataSourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
}
