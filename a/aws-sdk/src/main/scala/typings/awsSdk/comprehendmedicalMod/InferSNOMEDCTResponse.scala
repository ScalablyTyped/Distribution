package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferSNOMEDCTResponse extends StObject {
  
  /**
    *  The number of characters in the input request documentation. 
    */
  var Characters: js.UndefOr[typings.awsSdk.comprehendmedicalMod.Characters] = js.undefined
  
  /**
    *  The collection of medical concept entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned. 
    */
  var Entities: SNOMEDCTEntityList
  
  /**
    *  The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents. 
    */
  var ModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    *  If the result of the request is truncated, the pagination token can be used to fetch the next page of entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The details of the SNOMED-CT revision, including the edition, language, and version date. 
    */
  var SNOMEDCTDetails: js.UndefOr[typings.awsSdk.comprehendmedicalMod.SNOMEDCTDetails] = js.undefined
}
object InferSNOMEDCTResponse {
  
  inline def apply(Entities: SNOMEDCTEntityList): InferSNOMEDCTResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferSNOMEDCTResponse]
  }
  
  extension [Self <: InferSNOMEDCTResponse](x: Self) {
    
    inline def setCharacters(value: Characters): Self = StObject.set(x, "Characters", value.asInstanceOf[js.Any])
    
    inline def setCharactersUndefined: Self = StObject.set(x, "Characters", js.undefined)
    
    inline def setEntities(value: SNOMEDCTEntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: SNOMEDCTEntity*): Self = StObject.set(x, "Entities", js.Array(value*))
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setPaginationToken(value: String): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setSNOMEDCTDetails(value: SNOMEDCTDetails): Self = StObject.set(x, "SNOMEDCTDetails", value.asInstanceOf[js.Any])
    
    inline def setSNOMEDCTDetailsUndefined: Self = StObject.set(x, "SNOMEDCTDetails", js.undefined)
  }
}
