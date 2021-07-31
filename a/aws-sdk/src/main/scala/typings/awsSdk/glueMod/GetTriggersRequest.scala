package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTriggersRequest extends StObject {
  
  /**
    * The name of the job to retrieve triggers for. The trigger that can start this job is returned, and if there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The maximum size of the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetTriggersRequest {
  
  @scala.inline
  def apply(): GetTriggersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggersRequest]
  }
  
  @scala.inline
  implicit class GetTriggersRequestMutableBuilder[Self <: GetTriggersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependentJobName(value: NameString): Self = StObject.set(x, "DependentJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentJobNameUndefined: Self = StObject.set(x, "DependentJobName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
