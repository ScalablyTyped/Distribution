package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyProperties extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the custom terminology. 
    */
  var Arn: js.UndefOr[TerminologyArn] = js.undefined
  
  /**
    * The time at which the custom terminology was created, based on the timestamp.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the custom terminology properties.
    */
  var Description: js.UndefOr[typings.awsSdk.translateMod.Description] = js.undefined
  
  /**
    * The directionality of your terminology resource indicates whether it has one source language (uni-directional) or multiple (multi-directional).   UNI  The terminology resource has one source language (the first column in a CSV file), and all of its other languages are target languages.  MULTI  Any language in the terminology resource can be the source language.  
    */
  var Directionality: js.UndefOr[typings.awsSdk.translateMod.Directionality] = js.undefined
  
  /**
    * The encryption key for the custom terminology.
    */
  var EncryptionKey: js.UndefOr[typings.awsSdk.translateMod.EncryptionKey] = js.undefined
  
  /**
    * The format of the custom terminology input file.
    */
  var Format: js.UndefOr[TerminologyDataFormat] = js.undefined
  
  /**
    * The time at which the custom terminology was last update, based on the timestamp.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Additional information from Amazon Translate about the terminology resource.
    */
  var Message: js.UndefOr[UnboundedLengthString] = js.undefined
  
  /**
    * The name of the custom terminology.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The size of the file used when importing a custom terminology.
    */
  var SizeBytes: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of terms in the input file that Amazon Translate skipped when you created or updated the terminology resource.
    */
  var SkippedTermCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The language code for the source text of the translation request for which the custom terminology is being used.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined
  
  /**
    * The language codes for the target languages available with the custom terminology resource. All possible target languages are returned in array.
    */
  var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined
  
  /**
    * The number of terms included in the custom terminology.
    */
  var TermCount: js.UndefOr[Integer] = js.undefined
}
object TerminologyProperties {
  
  inline def apply(): TerminologyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminologyProperties]
  }
  
  extension [Self <: TerminologyProperties](x: Self) {
    
    inline def setArn(value: TerminologyArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDirectionality(value: Directionality): Self = StObject.set(x, "Directionality", value.asInstanceOf[js.Any])
    
    inline def setDirectionalityUndefined: Self = StObject.set(x, "Directionality", js.undefined)
    
    inline def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    inline def setFormat(value: TerminologyDataFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setMessage(value: UnboundedLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSizeBytes(value: Integer): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "SizeBytes", js.undefined)
    
    inline def setSkippedTermCount(value: Integer): Self = StObject.set(x, "SkippedTermCount", value.asInstanceOf[js.Any])
    
    inline def setSkippedTermCountUndefined: Self = StObject.set(x, "SkippedTermCount", js.undefined)
    
    inline def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "SourceLanguageCode", js.undefined)
    
    inline def setTargetLanguageCodes(value: LanguageCodeStringList): Self = StObject.set(x, "TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodesUndefined: Self = StObject.set(x, "TargetLanguageCodes", js.undefined)
    
    inline def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = StObject.set(x, "TargetLanguageCodes", js.Array(value*))
    
    inline def setTermCount(value: Integer): Self = StObject.set(x, "TermCount", value.asInstanceOf[js.Any])
    
    inline def setTermCountUndefined: Self = StObject.set(x, "TermCount", js.undefined)
  }
}
