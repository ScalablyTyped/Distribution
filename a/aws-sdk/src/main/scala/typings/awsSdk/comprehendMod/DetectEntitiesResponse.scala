package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectEntitiesResponse extends StObject {
  
  /**
    * A collection of entities identified in the input text. For each entity, the response provides the entity text, entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the detection.  If your request uses a custom entity recognition model, Amazon Comprehend detects the entities that the model is trained to recognize. Otherwise, it detects the default entity types. For a list of default entity types, see how-entities.
    */
  var Entities: js.UndefOr[ListOfEntities] = js.native
}
object DetectEntitiesResponse {
  
  @scala.inline
  def apply(): DetectEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectEntitiesResponse]
  }
  
  @scala.inline
  implicit class DetectEntitiesResponseMutableBuilder[Self <: DetectEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: ListOfEntities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
  }
}
