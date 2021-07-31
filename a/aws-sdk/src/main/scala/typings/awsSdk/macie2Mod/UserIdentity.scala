package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentity extends StObject {
  
  /**
    * If the action was performed with temporary security credentials that were obtained using the AssumeRole operation of the AWS Security Token Service (AWS STS) API, the identifiers, session context, and other details about the identity.
    */
  var assumedRole: js.UndefOr[AssumedRole] = js.undefined
  
  /**
    * If the action was performed using the credentials for another AWS account, the details of that account.
    */
  var awsAccount: js.UndefOr[AwsAccount] = js.undefined
  
  /**
    * If the action was performed by an AWS account that belongs to an AWS service, the name of the service.
    */
  var awsService: js.UndefOr[AwsService] = js.undefined
  
  /**
    * If the action was performed with temporary security credentials that were obtained using the GetFederationToken operation of the AWS Security Token Service (AWS STS) API, the identifiers, session context, and other details about the identity.
    */
  var federatedUser: js.UndefOr[FederatedUser] = js.undefined
  
  /**
    * If the action was performed using the credentials for an AWS Identity and Access Management (IAM) user, the name and other details about the user.
    */
  var iamUser: js.UndefOr[IamUser] = js.undefined
  
  /**
    * If the action was performed using the credentials for your AWS account, the details of your account.
    */
  var root: js.UndefOr[UserIdentityRoot] = js.undefined
  
  /**
    * The type of entity that performed the action.
    */
  var `type`: js.UndefOr[UserIdentityType] = js.undefined
}
object UserIdentity {
  
  @scala.inline
  def apply(): UserIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentity]
  }
  
  @scala.inline
  implicit class UserIdentityMutableBuilder[Self <: UserIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssumedRole(value: AssumedRole): Self = StObject.set(x, "assumedRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumedRoleUndefined: Self = StObject.set(x, "assumedRole", js.undefined)
    
    @scala.inline
    def setAwsAccount(value: AwsAccount): Self = StObject.set(x, "awsAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountUndefined: Self = StObject.set(x, "awsAccount", js.undefined)
    
    @scala.inline
    def setAwsService(value: AwsService): Self = StObject.set(x, "awsService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsServiceUndefined: Self = StObject.set(x, "awsService", js.undefined)
    
    @scala.inline
    def setFederatedUser(value: FederatedUser): Self = StObject.set(x, "federatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedUserUndefined: Self = StObject.set(x, "federatedUser", js.undefined)
    
    @scala.inline
    def setIamUser(value: IamUser): Self = StObject.set(x, "iamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserUndefined: Self = StObject.set(x, "iamUser", js.undefined)
    
    @scala.inline
    def setRoot(value: UserIdentityRoot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setType(value: UserIdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
