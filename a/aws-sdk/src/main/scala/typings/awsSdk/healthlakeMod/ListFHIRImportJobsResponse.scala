package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFHIRImportJobsResponse extends StObject {
  
  /**
    *  The properties of a listed FHIR import jobs, including the ID, ARN, name, and the status of the job. 
    */
  var ImportJobPropertiesList: typings.awsSdk.healthlakeMod.ImportJobPropertiesList
  
  /**
    *  A pagination token used to identify the next page of results to return for a ListFHIRImportJobs query. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.healthlakeMod.NextToken] = js.undefined
}
object ListFHIRImportJobsResponse {
  
  inline def apply(ImportJobPropertiesList: ImportJobPropertiesList): ListFHIRImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobPropertiesList = ImportJobPropertiesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFHIRImportJobsResponse]
  }
  
  extension [Self <: ListFHIRImportJobsResponse](x: Self) {
    
    inline def setImportJobPropertiesList(value: ImportJobPropertiesList): Self = StObject.set(x, "ImportJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setImportJobPropertiesListVarargs(value: ImportJobProperties*): Self = StObject.set(x, "ImportJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
