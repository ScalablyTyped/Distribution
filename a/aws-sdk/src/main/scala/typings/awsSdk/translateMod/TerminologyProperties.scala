package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminologyProperties extends js.Object {
  
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
  implicit class TerminologyPropertiesOps[Self <: TerminologyProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: TerminologyArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKey): Self = this.set("EncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("EncryptionKey", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Timestamp): Self = this.set("LastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("LastUpdatedAt", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: Integer): Self = this.set("SizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("SizeBytes", js.undefined)
    
    @scala.inline
    def setSourceLanguageCode(value: LanguageCodeString): Self = this.set("SourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLanguageCode: Self = this.set("SourceLanguageCode", js.undefined)
    
    @scala.inline
    def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = this.set("TargetLanguageCodes", js.Array(value :_*))
    
    @scala.inline
    def setTargetLanguageCodes(value: LanguageCodeStringList): Self = this.set("TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLanguageCodes: Self = this.set("TargetLanguageCodes", js.undefined)
    
    @scala.inline
    def setTermCount(value: Integer): Self = this.set("TermCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermCount: Self = this.set("TermCount", js.undefined)
  }
}
