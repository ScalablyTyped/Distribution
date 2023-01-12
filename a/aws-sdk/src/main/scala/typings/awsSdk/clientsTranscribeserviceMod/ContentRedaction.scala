package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentRedaction extends StObject {
  
  /**
    * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can include as many types as you'd like, or you can select ALL.
    */
  var PiiEntityTypes: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.PiiEntityTypes] = js.undefined
  
  /**
    * Specify if you want only a redacted transcript, or if you want a redacted and an unredacted transcript. When you choose redacted Amazon Transcribe creates only a redacted transcript. When you choose redacted_and_unredacted Amazon Transcribe creates a redacted and an unredacted transcript (as two separate files).
    */
  var RedactionOutput: typings.awsSdk.clientsTranscribeserviceMod.RedactionOutput
  
  /**
    * Specify the category of information you want to redact; PII (personally identifiable information) is the only valid value. You can use PiiEntityTypes to choose which types of PII you want to redact.
    */
  var RedactionType: typings.awsSdk.clientsTranscribeserviceMod.RedactionType
}
object ContentRedaction {
  
  inline def apply(RedactionOutput: RedactionOutput, RedactionType: RedactionType): ContentRedaction = {
    val __obj = js.Dynamic.literal(RedactionOutput = RedactionOutput.asInstanceOf[js.Any], RedactionType = RedactionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRedaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentRedaction] (val x: Self) extends AnyVal {
    
    inline def setPiiEntityTypes(value: PiiEntityTypes): Self = StObject.set(x, "PiiEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setPiiEntityTypesUndefined: Self = StObject.set(x, "PiiEntityTypes", js.undefined)
    
    inline def setPiiEntityTypesVarargs(value: PiiEntityType*): Self = StObject.set(x, "PiiEntityTypes", js.Array(value*))
    
    inline def setRedactionOutput(value: RedactionOutput): Self = StObject.set(x, "RedactionOutput", value.asInstanceOf[js.Any])
    
    inline def setRedactionType(value: RedactionType): Self = StObject.set(x, "RedactionType", value.asInstanceOf[js.Any])
  }
}
