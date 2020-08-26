package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolDescriptionType extends js.Object {
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
  implicit class UserPoolDescriptionTypeOps[Self <: UserPoolDescriptionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setId(value: UserPoolIdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setLambdaConfig(value: LambdaConfigType): Self = this.set("LambdaConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaConfig: Self = this.set("LambdaConfig", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setName(value: UserPoolNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStatus(value: StatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

