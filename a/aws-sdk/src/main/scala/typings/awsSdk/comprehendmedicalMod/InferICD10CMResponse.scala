package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InferICD10CMResponse extends StObject {
  
  /**
    * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: ICD10CMEntityList = js.native
  
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  
  /**
    * If the result of the previous request to InferICD10CM was truncated, include the PaginationToken to fetch the next page of medical condition entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.native
}
object InferICD10CMResponse {
  
  @scala.inline
  def apply(Entities: ICD10CMEntityList): InferICD10CMResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferICD10CMResponse]
  }
  
  @scala.inline
  implicit class InferICD10CMResponseMutableBuilder[Self <: InferICD10CMResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: ICD10CMEntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: ICD10CMEntity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
    
    @scala.inline
    def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    @scala.inline
    def setPaginationToken(value: String): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
