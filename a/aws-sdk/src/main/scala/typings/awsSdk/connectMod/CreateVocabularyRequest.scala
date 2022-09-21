package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVocabularyRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If a create request is received more than once with same client token, subsequent requests return the previous response without creating a vocabulary again.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.connectMod.ClientToken] = js.undefined
  
  /**
    * The content of the custom vocabulary in plain-text format with a table of values. Each row in the table represents a word or a phrase, described with Phrase, IPA, SoundsLike, and DisplayAs fields. Separate the fields with TAB characters. The size limit is 50KB. For more information, see Create a custom vocabulary using a table.
    */
  var Content: VocabularyContent
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see What is Amazon Transcribe? 
    */
  var LanguageCode: VocabularyLanguageCode
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A unique name of the custom vocabulary.
    */
  var VocabularyName: typings.awsSdk.connectMod.VocabularyName
}
object CreateVocabularyRequest {
  
  inline def apply(
    Content: VocabularyContent,
    InstanceId: InstanceId,
    LanguageCode: VocabularyLanguageCode,
    VocabularyName: VocabularyName
  ): CreateVocabularyRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyRequest]
  }
  
  extension [Self <: CreateVocabularyRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setContent(value: VocabularyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: VocabularyLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
