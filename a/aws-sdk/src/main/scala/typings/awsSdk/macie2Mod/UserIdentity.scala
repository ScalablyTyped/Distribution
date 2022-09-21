package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentity extends StObject {
  
  /**
    * If the action was performed with temporary security credentials that were obtained using the AssumeRole operation of the Security Token Service (STS) API, the identifiers, session context, and other details about the identity.
    */
  var assumedRole: js.UndefOr[AssumedRole] = js.undefined
  
  /**
    * If the action was performed using the credentials for another Amazon Web Services account, the details of that account.
    */
  var awsAccount: js.UndefOr[AwsAccount] = js.undefined
  
  /**
    * If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the name of the service.
    */
  var awsService: js.UndefOr[AwsService] = js.undefined
  
  /**
    * If the action was performed with temporary security credentials that were obtained using the GetFederationToken operation of the Security Token Service (STS) API, the identifiers, session context, and other details about the identity.
    */
  var federatedUser: js.UndefOr[FederatedUser] = js.undefined
  
  /**
    * If the action was performed using the credentials for an Identity and Access Management (IAM) user, the name and other details about the user.
    */
  var iamUser: js.UndefOr[IamUser] = js.undefined
  
  /**
    * If the action was performed using the credentials for your Amazon Web Services account, the details of your account.
    */
  var root: js.UndefOr[UserIdentityRoot] = js.undefined
  
  /**
    * The type of entity that performed the action.
    */
  var `type`: js.UndefOr[UserIdentityType] = js.undefined
}
object UserIdentity {
  
  inline def apply(): UserIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentity]
  }
  
  extension [Self <: UserIdentity](x: Self) {
    
    inline def setAssumedRole(value: AssumedRole): Self = StObject.set(x, "assumedRole", value.asInstanceOf[js.Any])
    
    inline def setAssumedRoleUndefined: Self = StObject.set(x, "assumedRole", js.undefined)
    
    inline def setAwsAccount(value: AwsAccount): Self = StObject.set(x, "awsAccount", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountUndefined: Self = StObject.set(x, "awsAccount", js.undefined)
    
    inline def setAwsService(value: AwsService): Self = StObject.set(x, "awsService", value.asInstanceOf[js.Any])
    
    inline def setAwsServiceUndefined: Self = StObject.set(x, "awsService", js.undefined)
    
    inline def setFederatedUser(value: FederatedUser): Self = StObject.set(x, "federatedUser", value.asInstanceOf[js.Any])
    
    inline def setFederatedUserUndefined: Self = StObject.set(x, "federatedUser", js.undefined)
    
    inline def setIamUser(value: IamUser): Self = StObject.set(x, "iamUser", value.asInstanceOf[js.Any])
    
    inline def setIamUserUndefined: Self = StObject.set(x, "iamUser", js.undefined)
    
    inline def setRoot(value: UserIdentityRoot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setType(value: UserIdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
