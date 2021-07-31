package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionVersionSummary extends StObject {
  
  /**
    * The date and time (in Unix time) that this version of a solution was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * If a solution version fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The date and time (in Unix time) that the solution version was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the solution version. A solution version can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object SolutionVersionSummary {
  
  @scala.inline
  def apply(): SolutionVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionVersionSummary]
  }
  
  @scala.inline
  implicit class SolutionVersionSummaryMutableBuilder[Self <: SolutionVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
