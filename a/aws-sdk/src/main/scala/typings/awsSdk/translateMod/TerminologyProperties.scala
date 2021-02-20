package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminologyProperties extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the custom terminology. 
    */
  var Arn: js.UndefOr[TerminologyArn] = js.native
  
  /**
    * The time at which the custom terminology was created, based on the timestamp.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the custom terminology properties.
    */
  var Description: js.UndefOr[typings.awsSdk.translateMod.Description] = js.native
  
  /**
    * The encryption key for the custom terminology.
    */
  var EncryptionKey: js.UndefOr[typings.awsSdk.translateMod.EncryptionKey] = js.native
  
  /**
    * The time at which the custom terminology was last update, based on the timestamp.
    */
  var LastUpdatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the custom terminology.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The size of the file used when importing a custom terminology.
    */
  var SizeBytes: js.UndefOr[Integer] = js.native
  
  /**
    * The language code for the source text of the translation request for which the custom terminology is being used.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.native
  
  /**
    * The language codes for the target languages available with the custom terminology file. All possible target languages are returned in array.
    */
  var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.native
  
  /**
    * The number of terms included in the custom terminology.
    */
  var TermCount: js.UndefOr[Integer] = js.native
}
object TerminologyProperties {
  
  @scala.inline
  def apply(): TerminologyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminologyProperties]
  }
  
  @scala.inline
  implicit class TerminologyPropertiesMutableBuilder[Self <: TerminologyProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: TerminologyArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Timestamp): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: Integer): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "SizeBytes", js.undefined)
    
    @scala.inline
    def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLanguageCodeUndefined: Self = StObject.set(x, "SourceLanguageCode", js.undefined)
    
    @scala.inline
    def setTargetLanguageCodes(value: LanguageCodeStringList): Self = StObject.set(x, "TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLanguageCodesUndefined: Self = StObject.set(x, "TargetLanguageCodes", js.undefined)
    
    @scala.inline
    def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = StObject.set(x, "TargetLanguageCodes", js.Array(value :_*))
    
    @scala.inline
    def setTermCount(value: Integer): Self = StObject.set(x, "TermCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermCountUndefined: Self = StObject.set(x, "TermCount", js.undefined)
  }
}
