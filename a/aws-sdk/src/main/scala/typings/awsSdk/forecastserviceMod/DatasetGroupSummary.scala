package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetGroupSummary extends js.Object {
  
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.native
  
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current time of the ListDatasetGroups call.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
}
object DatasetGroupSummary {
  
  @scala.inline
  def apply(): DatasetGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetGroupSummary]
  }
  
  @scala.inline
  implicit class DatasetGroupSummaryOps[Self <: DatasetGroupSummary] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = this.set("DatasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("DatasetGroupArn", js.undefined)
    
    @scala.inline
    def setDatasetGroupName(value: Name): Self = this.set("DatasetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetGroupName: Self = this.set("DatasetGroupName", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
  }
}
