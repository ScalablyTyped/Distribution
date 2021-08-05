package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The time at which the filter was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The ARN of the dataset group to which the filter belongs.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * If the filter failed, the reason for its failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The ARN of the filter.
    */
  var filterArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Specifies the type of item interactions to filter out of recommendation results. The filter expression must follow the following format:  EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")  Where "EVENT_TYPE" is the type of event to filter out. For more information, see Using Filters with Amazon Personalize.
    */
  var filterExpression: js.UndefOr[FilterExpression] = js.undefined
  
  /**
    * The time at which the filter was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the filter.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the filter.
    */
  var status: js.UndefOr[Status] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
    
    inline def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
    
    inline def setFilterExpression(value: FilterExpression): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "filterExpression", js.undefined)
    
    inline def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
