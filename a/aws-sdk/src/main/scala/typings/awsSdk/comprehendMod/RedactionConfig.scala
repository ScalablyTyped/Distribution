package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedactionConfig extends StObject {
  
  /**
    * A character that replaces each character in the redacted PII entity.
    */
  var MaskCharacter: js.UndefOr[typings.awsSdk.comprehendMod.MaskCharacter] = js.native
  
  /**
    * Specifies whether the PII entity is redacted with the mask character or the entity type.
    */
  var MaskMode: js.UndefOr[PiiEntitiesDetectionMaskMode] = js.native
  
  /**
    * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
    */
  var PiiEntityTypes: js.UndefOr[ListOfPiiEntityTypes] = js.native
}
object RedactionConfig {
  
  @scala.inline
  def apply(): RedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedactionConfig]
  }
  
  @scala.inline
  implicit class RedactionConfigMutableBuilder[Self <: RedactionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskCharacter(value: MaskCharacter): Self = StObject.set(x, "MaskCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskCharacterUndefined: Self = StObject.set(x, "MaskCharacter", js.undefined)
    
    @scala.inline
    def setMaskMode(value: PiiEntitiesDetectionMaskMode): Self = StObject.set(x, "MaskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskModeUndefined: Self = StObject.set(x, "MaskMode", js.undefined)
    
    @scala.inline
    def setPiiEntityTypes(value: ListOfPiiEntityTypes): Self = StObject.set(x, "PiiEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiiEntityTypesUndefined: Self = StObject.set(x, "PiiEntityTypes", js.undefined)
    
    @scala.inline
    def setPiiEntityTypesVarargs(value: PiiEntityType*): Self = StObject.set(x, "PiiEntityTypes", js.Array(value :_*))
  }
}
