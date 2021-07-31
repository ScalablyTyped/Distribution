package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseLogEventsResult extends StObject {
  
  /**
    * A token used for advancing to the previous page of results from your get relational database log events request.
    */
  var nextBackwardToken: js.UndefOr[String] = js.undefined
  
  /**
    * A token used for advancing to the next page of results from your get relational database log events request.
    */
  var nextForwardToken: js.UndefOr[String] = js.undefined
  
  /**
    * An object describing the result of your get relational database log events request.
    */
  var resourceLogEvents: js.UndefOr[LogEventList] = js.undefined
}
object GetRelationalDatabaseLogEventsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseLogEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseLogEventsResultMutableBuilder[Self <: GetRelationalDatabaseLogEventsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextBackwardToken(value: String): Self = StObject.set(x, "nextBackwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextBackwardTokenUndefined: Self = StObject.set(x, "nextBackwardToken", js.undefined)
    
    @scala.inline
    def setNextForwardToken(value: String): Self = StObject.set(x, "nextForwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextForwardTokenUndefined: Self = StObject.set(x, "nextForwardToken", js.undefined)
    
    @scala.inline
    def setResourceLogEvents(value: LogEventList): Self = StObject.set(x, "resourceLogEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLogEventsUndefined: Self = StObject.set(x, "resourceLogEvents", js.undefined)
    
    @scala.inline
    def setResourceLogEventsVarargs(value: LogEvent*): Self = StObject.set(x, "resourceLogEvents", js.Array(value :_*))
  }
}
