package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectPHIResponse extends StObject {
  
  /**
    *  The collection of PHI entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Amazon Comprehend Medical has in its detection. 
    */
  var Entities: EntityList = js.native
  
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: String = js.native
  
  /**
    *  If the result of the previous request to DetectPHI was truncated, include the PaginationToken to fetch the next page of PHI entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.native
}
object DetectPHIResponse {
  
  @scala.inline
  def apply(Entities: EntityList, ModelVersion: String): DetectPHIResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectPHIResponse]
  }
  
  @scala.inline
  implicit class DetectPHIResponseMutableBuilder[Self <: DetectPHIResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: EntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
    
    @scala.inline
    def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationToken(value: String): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
