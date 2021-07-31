package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterUserOptions extends StObject {
  
  /**
    * ARN for the master user (if IAM is enabled).
    */
  var MasterUserARN: js.UndefOr[ARN] = js.undefined
  
  /**
    * The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserName: js.UndefOr[Username] = js.undefined
  
  /**
    * The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserPassword: js.UndefOr[Password] = js.undefined
}
object MasterUserOptions {
  
  @scala.inline
  def apply(): MasterUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterUserOptions]
  }
  
  @scala.inline
  implicit class MasterUserOptionsMutableBuilder[Self <: MasterUserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterUserARN(value: ARN): Self = StObject.set(x, "MasterUserARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserARNUndefined: Self = StObject.set(x, "MasterUserARN", js.undefined)
    
    @scala.inline
    def setMasterUserName(value: Username): Self = StObject.set(x, "MasterUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserNameUndefined: Self = StObject.set(x, "MasterUserName", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: Password): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
  }
}
