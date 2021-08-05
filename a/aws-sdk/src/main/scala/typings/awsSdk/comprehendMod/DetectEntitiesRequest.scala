package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectEntitiesRequest extends StObject {
  
  /**
    * The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide an endpoint if you want to detect entities by using your own custom model instead of the default model that is used by Amazon Comprehend. If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any language code that you provide in your request.
    */
  var EndpointArn: js.UndefOr[EntityRecognizerEndpointArn] = js.undefined
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language. If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend uses the language of your custom model, and it ignores any language code that you specify here.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.comprehendMod.LanguageCode] = js.undefined
  
  /**
    * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: CustomerInputString
}
object DetectEntitiesRequest {
  
  inline def apply(Text: CustomerInputString): DetectEntitiesRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectEntitiesRequest]
  }
  
  extension [Self <: DetectEntitiesRequest](x: Self) {
    
    inline def setEndpointArn(value: EntityRecognizerEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
