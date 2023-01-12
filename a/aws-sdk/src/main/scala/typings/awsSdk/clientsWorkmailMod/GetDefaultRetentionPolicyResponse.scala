package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultRetentionPolicyResponse extends StObject {
  
  /**
    * The retention policy description.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The retention policy folder configurations.
    */
  var FolderConfigurations: js.UndefOr[typings.awsSdk.clientsWorkmailMod.FolderConfigurations] = js.undefined
  
  /**
    * The retention policy ID.
    */
  var Id: js.UndefOr[ShortString] = js.undefined
  
  /**
    * The retention policy name.
    */
  var Name: js.UndefOr[ShortString] = js.undefined
}
object GetDefaultRetentionPolicyResponse {
  
  inline def apply(): GetDefaultRetentionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultRetentionPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDefaultRetentionPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFolderConfigurations(value: FolderConfigurations): Self = StObject.set(x, "FolderConfigurations", value.asInstanceOf[js.Any])
    
    inline def setFolderConfigurationsUndefined: Self = StObject.set(x, "FolderConfigurations", js.undefined)
    
    inline def setFolderConfigurationsVarargs(value: FolderConfiguration*): Self = StObject.set(x, "FolderConfigurations", js.Array(value*))
    
    inline def setId(value: ShortString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ShortString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
