package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlarmModelsResponse extends StObject {
  
  /**
    * A list that summarizes each alarm model.
    */
  var alarmModelSummaries: js.UndefOr[AlarmModelSummaries] = js.undefined
  
  /**
    * The token that you can use to return the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAlarmModelsResponse {
  
  inline def apply(): ListAlarmModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlarmModelsResponse]
  }
  
  extension [Self <: ListAlarmModelsResponse](x: Self) {
    
    inline def setAlarmModelSummaries(value: AlarmModelSummaries): Self = StObject.set(x, "alarmModelSummaries", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelSummariesUndefined: Self = StObject.set(x, "alarmModelSummaries", js.undefined)
    
    inline def setAlarmModelSummariesVarargs(value: AlarmModelSummary*): Self = StObject.set(x, "alarmModelSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
