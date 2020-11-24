package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetGroupResponse extends js.Object {
  
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.native
  
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.native
  
  /**
    * The domain associated with the dataset group.
    */
  var Domain: js.UndefOr[typings.awsSdk.forecastserviceMod.Domain] = js.native
  
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current time of the DescribeDatasetGroup call.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The status of the dataset group. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply when you call the UpdateDatasetGroup operation.  The Status of the dataset group must be ACTIVE before you can use the dataset group to create a predictor. 
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
}
object DescribeDatasetGroupResponse {
  
  @scala.inline
  def apply(): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeDatasetGroupResponseOps[Self <: DescribeDatasetGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setDatasetArnsVarargs(value: Arn*): Self = this.set("DatasetArns", js.Array(value :_*))
    
    @scala.inline
    def setDatasetArns(value: ArnList): Self = this.set("DatasetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetArns: Self = this.set("DatasetArns", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = this.set("DatasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("DatasetGroupArn", js.undefined)
    
    @scala.inline
    def setDatasetGroupName(value: Name): Self = this.set("DatasetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetGroupName: Self = this.set("DatasetGroupName", js.undefined)
    
    @scala.inline
    def setDomain(value: Domain): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
