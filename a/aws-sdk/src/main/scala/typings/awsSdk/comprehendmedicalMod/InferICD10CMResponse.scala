package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferICD10CMResponse extends StObject {
  
  /**
    * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: ICD10CMEntityList
  
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If the result of the previous request to InferICD10CM was truncated, include the PaginationToken to fetch the next page of medical condition entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.undefined
}
object InferICD10CMResponse {
  
  inline def apply(Entities: ICD10CMEntityList): InferICD10CMResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferICD10CMResponse]
  }
  
  extension [Self <: InferICD10CMResponse](x: Self) {
    
    inline def setEntities(value: ICD10CMEntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: ICD10CMEntity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setPaginationToken(value: String): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
