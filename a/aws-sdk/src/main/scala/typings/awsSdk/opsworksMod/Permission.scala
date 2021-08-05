package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  /**
    * Whether the user can use SSH.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the user can use sudo.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about IAM ARNs, see Using Identifiers.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  
  /**
    * The user's permission level, which must be the following:    deny     show     deploy     manage     iam_only    For more information on the permissions associated with these levels, see Managing User Permissions 
    */
  var Level: js.UndefOr[String] = js.undefined
  
  /**
    * A stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setAllowSsh(value: Boolean): Self = StObject.set(x, "AllowSsh", value.asInstanceOf[js.Any])
    
    inline def setAllowSshUndefined: Self = StObject.set(x, "AllowSsh", js.undefined)
    
    inline def setAllowSudo(value: Boolean): Self = StObject.set(x, "AllowSudo", value.asInstanceOf[js.Any])
    
    inline def setAllowSudoUndefined: Self = StObject.set(x, "AllowSudo", js.undefined)
    
    inline def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    inline def setIamUserArnUndefined: Self = StObject.set(x, "IamUserArn", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "Level", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
