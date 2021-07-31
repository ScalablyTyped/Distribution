package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPHIDetectionJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job returned.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListPHIDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListPHIDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPHIDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListPHIDetectionJobsResponseMutableBuilder[Self <: ListPHIDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesList(value: ComprehendMedicalAsyncJobPropertiesList): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesListUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.undefined)
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesListVarargs(value: ComprehendMedicalAsyncJobProperties*): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
