package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleAliasDescription extends StObject {
  
  /**
    * The UNIX timestamp of when the role alias was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The number of seconds for which the credential is valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  
  /**
    * The UNIX timestamp of when the role alias was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The role alias owner.
    */
  var owner: js.UndefOr[AwsAccountId] = js.native
  
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.native
  
  /**
    * The ARN of the role alias.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
  
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}
object RoleAliasDescription {
  
  @scala.inline
  def apply(): RoleAliasDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAliasDescription]
  }
  
  @scala.inline
  implicit class RoleAliasDescriptionMutableBuilder[Self <: RoleAliasDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setCredentialDurationSeconds(value: CredentialDurationSeconds): Self = StObject.set(x, "credentialDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialDurationSecondsUndefined: Self = StObject.set(x, "credentialDurationSeconds", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setOwner(value: AwsAccountId): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAliasArn(value: RoleAliasArn): Self = StObject.set(x, "roleAliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAliasArnUndefined: Self = StObject.set(x, "roleAliasArn", js.undefined)
    
    @scala.inline
    def setRoleAliasUndefined: Self = StObject.set(x, "roleAlias", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
