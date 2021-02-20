package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectDirectoryRequest extends StObject {
  
  /**
    * A DirectoryConnectSettings object that contains additional information for the operation.
    */
  var ConnectSettings: DirectoryConnectSettings = js.native
  
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
  
  /**
    * The fully qualified name of the on-premises directory, such as corp.example.com.
    */
  var Name: DirectoryName = js.native
  
  /**
    * The password for the on-premises user account.
    */
  var Password: ConnectPassword = js.native
  
  /**
    * The NetBIOS name of the on-premises directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  
  /**
    * The size of the directory.
    */
  var Size: DirectorySize = js.native
  
  /**
    * The tags to be assigned to AD Connector.
    */
  var Tags: js.UndefOr[typings.awsSdk.directoryserviceMod.Tags] = js.native
}
object ConnectDirectoryRequest {
  
  @scala.inline
  def apply(
    ConnectSettings: DirectoryConnectSettings,
    Name: DirectoryName,
    Password: ConnectPassword,
    Size: DirectorySize
  ): ConnectDirectoryRequest = {
    val __obj = js.Dynamic.literal(ConnectSettings = ConnectSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectDirectoryRequest]
  }
  
  @scala.inline
  implicit class ConnectDirectoryRequestMutableBuilder[Self <: ConnectDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectSettings(value: DirectoryConnectSettings): Self = StObject.set(x, "ConnectSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: ConnectPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortName(value: DirectoryShortName): Self = StObject.set(x, "ShortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "ShortName", js.undefined)
    
    @scala.inline
    def setSize(value: DirectorySize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
