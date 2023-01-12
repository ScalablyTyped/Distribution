package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTerminologyRequest extends StObject {
  
  /**
    * The description of the custom terminology being imported.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTranslateMod.Description] = js.undefined
  
  /**
    * The encryption key for the custom terminology being imported.
    */
  var EncryptionKey: js.UndefOr[typings.awsSdk.clientsTranslateMod.EncryptionKey] = js.undefined
  
  /**
    * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
    */
  var MergeStrategy: typings.awsSdk.clientsTranslateMod.MergeStrategy
  
  /**
    * The name of the custom terminology being imported.
    */
  var Name: ResourceName
  
  /**
    * Tags to be associated with this resource. A tag is a key-value pair that adds metadata to a resource. Each tag key for the resource must be unique. For more information, see  Tagging your resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The terminology data for the custom terminology being imported.
    */
  var TerminologyData: typings.awsSdk.clientsTranslateMod.TerminologyData
}
object ImportTerminologyRequest {
  
  inline def apply(MergeStrategy: MergeStrategy, Name: ResourceName, TerminologyData: TerminologyData): ImportTerminologyRequest = {
    val __obj = js.Dynamic.literal(MergeStrategy = MergeStrategy.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TerminologyData = TerminologyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTerminologyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTerminologyRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "MergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTerminologyData(value: TerminologyData): Self = StObject.set(x, "TerminologyData", value.asInstanceOf[js.Any])
  }
}
