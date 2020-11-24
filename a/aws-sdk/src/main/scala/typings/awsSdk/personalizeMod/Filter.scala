package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /**
    * The time at which the filter was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The ARN of the dataset group to which the filter belongs.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * If the filter failed, the reason for its failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The ARN of the filter.
    */
  var filterArn: js.UndefOr[Arn] = js.native
  
  /**
    * Specifies the type of item interactions to filter out of recommendation results. The filter expression must follow the following format:  EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")  Where "EVENT_TYPE" is the type of event to filter out. For more information, see Using Filters with Amazon Personalize.
    */
  var filterExpression: js.UndefOr[FilterExpression] = js.native
  
  /**
    * The time at which the filter was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the filter.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The status of the filter.
    */
  var status: js.UndefOr[Status] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("datasetGroupArn", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setFilterArn(value: Arn): Self = this.set("filterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterArn: Self = this.set("filterArn", js.undefined)
    
    @scala.inline
    def setFilterExpression(value: FilterExpression): Self = this.set("filterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterExpression: Self = this.set("filterExpression", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
