package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFilterRequest extends StObject {
  
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
  implicit class CreateFilterRequestMutableBuilder[Self <: CreateFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExpression(value: FilterExpression): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
