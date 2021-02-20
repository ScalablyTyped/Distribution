package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveDirectoryBackupAttributes extends StObject {
  
  /**
    * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.native
}
object ActiveDirectoryBackupAttributes {
  
  @scala.inline
  def apply(): ActiveDirectoryBackupAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
  }
  
  @scala.inline
  implicit class ActiveDirectoryBackupAttributesMutableBuilder[Self <: ActiveDirectoryBackupAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDirectoryId(value: DirectoryId): Self = StObject.set(x, "ActiveDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDirectoryIdUndefined: Self = StObject.set(x, "ActiveDirectoryId", js.undefined)
    
    @scala.inline
    def setDomainName(value: ActiveDirectoryFullyQualifiedName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
