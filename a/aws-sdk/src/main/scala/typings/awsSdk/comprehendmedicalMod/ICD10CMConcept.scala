package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICD10CMConcept extends StObject {
  
  /**
    * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The long description of the ICD-10-CM code in the ontology.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM concept.
    */
  var Score: js.UndefOr[Float] = js.native
}
object ICD10CMConcept {
  
  @scala.inline
  def apply(): ICD10CMConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMConcept]
  }
  
  @scala.inline
  implicit class ICD10CMConceptMutableBuilder[Self <: ICD10CMConcept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
