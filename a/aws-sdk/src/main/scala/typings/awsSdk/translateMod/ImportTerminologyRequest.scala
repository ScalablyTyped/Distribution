package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportTerminologyRequest extends StObject {
  
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
  implicit class ImportTerminologyRequestMutableBuilder[Self <: ImportTerminologyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    @scala.inline
    def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "MergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyData(value: TerminologyData): Self = StObject.set(x, "TerminologyData", value.asInstanceOf[js.Any])
  }
}
