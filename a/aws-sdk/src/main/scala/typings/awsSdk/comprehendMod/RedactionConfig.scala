package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedactionConfig extends StObject {
  
  /**
    * A character that replaces each character in the redacted PII entity.
    */
  var MaskCharacter: js.UndefOr[typings.awsSdk.comprehendMod.MaskCharacter] = js.undefined
  
  /**
    * Specifies whether the PII entity is redacted with the mask character or the entity type.
    */
  var MaskMode: js.UndefOr[PiiEntitiesDetectionMaskMode] = js.undefined
  
  /**
    * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
    */
  var PiiEntityTypes: js.UndefOr[ListOfPiiEntityTypes] = js.undefined
}
object RedactionConfig {
  
  inline def apply(): RedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedactionConfig]
  }
  
  extension [Self <: RedactionConfig](x: Self) {
    
    inline def setMaskCharacter(value: MaskCharacter): Self = StObject.set(x, "MaskCharacter", value.asInstanceOf[js.Any])
    
    inline def setMaskCharacterUndefined: Self = StObject.set(x, "MaskCharacter", js.undefined)
    
    inline def setMaskMode(value: PiiEntitiesDetectionMaskMode): Self = StObject.set(x, "MaskMode", value.asInstanceOf[js.Any])
    
    inline def setMaskModeUndefined: Self = StObject.set(x, "MaskMode", js.undefined)
    
    inline def setPiiEntityTypes(value: ListOfPiiEntityTypes): Self = StObject.set(x, "PiiEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setPiiEntityTypesUndefined: Self = StObject.set(x, "PiiEntityTypes", js.undefined)
    
    inline def setPiiEntityTypesVarargs(value: PiiEntityType*): Self = StObject.set(x, "PiiEntityTypes", js.Array(value :_*))
  }
}
