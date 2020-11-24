package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFilterRequest extends js.Object {
  
  /**
    * The ARN of the dataset group that the filter will belong to.
    */
  var datasetGroupArn: Arn = js.native
  
  /**
    * The filter expression that designates the interaction types that the filter will filter out. A filter expression must follow the following format:  EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")  Where "EVENT_TYPE" is the type of event to filter out. To filter out all items with any interactions history, set "*" as the EVENT_TYPE. For more information, see Using Filters with Amazon Personalize.
    */
  var filterExpression: FilterExpression = js.native
  
  /**
    * The name of the filter to create.
    */
  var name: Name = js.native
}
object CreateFilterRequest {
  
  @scala.inline
  def apply(datasetGroupArn: Arn, filterExpression: FilterExpression, name: Name): CreateFilterRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], filterExpression = filterExpression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterRequest]
  }
  
  @scala.inline
  implicit class CreateFilterRequestOps[Self <: CreateFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExpression(value: FilterExpression): Self = this.set("filterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
