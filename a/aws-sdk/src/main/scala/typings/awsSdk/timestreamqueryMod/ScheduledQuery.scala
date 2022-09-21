package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledQuery extends StObject {
  
  /**
    * The Amazon Resource Name.
    */
  var Arn: AmazonResourceName
  
  /**
    * The creation time of the scheduled query.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Configuration for scheduled query error reporting.
    */
  var ErrorReportConfiguration: js.UndefOr[typings.awsSdk.timestreamqueryMod.ErrorReportConfiguration] = js.undefined
  
  /**
    * Status of the last scheduled query run.
    */
  var LastRunStatus: js.UndefOr[ScheduledQueryRunStatus] = js.undefined
  
  /**
    * The name of the scheduled query.
    */
  var Name: ScheduledQueryName
  
  /**
    * The next time the scheduled query is to be run.
    */
  var NextInvocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the scheduled query was run.
    */
  var PreviousInvocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * State of scheduled query. 
    */
  var State: ScheduledQueryState
  
  /**
    * Target data source where final scheduled query result will be written.
    */
  var TargetDestination: js.UndefOr[typings.awsSdk.timestreamqueryMod.TargetDestination] = js.undefined
}
object ScheduledQuery {
  
  inline def apply(Arn: AmazonResourceName, Name: ScheduledQueryName, State: ScheduledQueryState): ScheduledQuery = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledQuery]
  }
  
  extension [Self <: ScheduledQuery](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setErrorReportConfiguration(value: ErrorReportConfiguration): Self = StObject.set(x, "ErrorReportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setErrorReportConfigurationUndefined: Self = StObject.set(x, "ErrorReportConfiguration", js.undefined)
    
    inline def setLastRunStatus(value: ScheduledQueryRunStatus): Self = StObject.set(x, "LastRunStatus", value.asInstanceOf[js.Any])
    
    inline def setLastRunStatusUndefined: Self = StObject.set(x, "LastRunStatus", js.undefined)
    
    inline def setName(value: ScheduledQueryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextInvocationTime(value: js.Date): Self = StObject.set(x, "NextInvocationTime", value.asInstanceOf[js.Any])
    
    inline def setNextInvocationTimeUndefined: Self = StObject.set(x, "NextInvocationTime", js.undefined)
    
    inline def setPreviousInvocationTime(value: js.Date): Self = StObject.set(x, "PreviousInvocationTime", value.asInstanceOf[js.Any])
    
    inline def setPreviousInvocationTimeUndefined: Self = StObject.set(x, "PreviousInvocationTime", js.undefined)
    
    inline def setState(value: ScheduledQueryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTargetDestination(value: TargetDestination): Self = StObject.set(x, "TargetDestination", value.asInstanceOf[js.Any])
    
    inline def setTargetDestinationUndefined: Self = StObject.set(x, "TargetDestination", js.undefined)
  }
}
