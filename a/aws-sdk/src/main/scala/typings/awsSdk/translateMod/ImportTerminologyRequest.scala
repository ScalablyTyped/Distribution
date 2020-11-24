package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportTerminologyRequest extends js.Object {
  
  /**
    * The description of the custom terminology being imported.
    */
  var Description: js.UndefOr[typings.awsSdk.translateMod.Description] = js.native
  
  /**
    * The encryption key for the custom terminology being imported.
    */
  var EncryptionKey: js.UndefOr[typings.awsSdk.translateMod.EncryptionKey] = js.native
  
  /**
    * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
    */
  var MergeStrategy: typings.awsSdk.translateMod.MergeStrategy = js.native
  
  /**
    * The name of the custom terminology being imported.
    */
  var Name: ResourceName = js.native
  
  /**
    * The terminology data for the custom terminology being imported.
    */
  var TerminologyData: typings.awsSdk.translateMod.TerminologyData = js.native
}
object ImportTerminologyRequest {
  
  @scala.inline
  def apply(MergeStrategy: MergeStrategy, Name: ResourceName, TerminologyData: TerminologyData): ImportTerminologyRequest = {
    val __obj = js.Dynamic.literal(MergeStrategy = MergeStrategy.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TerminologyData = TerminologyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTerminologyRequest]
  }
  
  @scala.inline
  implicit class ImportTerminologyRequestOps[Self <: ImportTerminologyRequest] (val x: Self) extends AnyVal {
    
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
    def setMergeStrategy(value: MergeStrategy): Self = this.set("MergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyData(value: TerminologyData): Self = this.set("TerminologyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKey): Self = this.set("EncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("EncryptionKey", js.undefined)
  }
}
