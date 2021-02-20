package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectPiiEntitiesResponse extends StObject {
  
  /**
    * A collection of PII entities identified in the input text. For each entity, the response provides the entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the detection.
    */
  var Entities: js.UndefOr[ListOfPiiEntities] = js.native
}
object DetectPiiEntitiesResponse {
  
  @scala.inline
  def apply(): DetectPiiEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectPiiEntitiesResponse]
  }
  
  @scala.inline
  implicit class DetectPiiEntitiesResponseMutableBuilder[Self <: DetectPiiEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: ListOfPiiEntities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: PiiEntity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
  }
}
