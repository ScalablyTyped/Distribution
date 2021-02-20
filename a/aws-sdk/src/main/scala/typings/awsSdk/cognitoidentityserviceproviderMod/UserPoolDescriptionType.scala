package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolDescriptionType extends StObject {
  
  /**
    * The date the user pool description was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The ID in a user pool description.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.native
  
  /**
    * The AWS Lambda configuration information in a user pool description.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  
  /**
    * The date the user pool description was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The name in a user pool description.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.native
  
  /**
    * The user pool status in a user pool description.
    */
  var Status: js.UndefOr[StatusType] = js.native
}
object UserPoolDescriptionType {
  
  @scala.inline
  def apply(): UserPoolDescriptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolDescriptionType]
  }
  
  @scala.inline
  implicit class UserPoolDescriptionTypeMutableBuilder[Self <: UserPoolDescriptionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setId(value: UserPoolIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLambdaConfig(value: LambdaConfigType): Self = StObject.set(x, "LambdaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaConfigUndefined: Self = StObject.set(x, "LambdaConfig", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: UserPoolNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
