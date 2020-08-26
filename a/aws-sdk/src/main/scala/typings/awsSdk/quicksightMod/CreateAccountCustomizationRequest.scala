package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountCustomizationRequest extends js.Object {
  /**
    * The customizations you're adding to the QuickSight subscription for the AWS account. For example, you could add a default theme by setting AccountCustomization to the midnight theme (DefaultTheme="arn:aws:quicksight::aws:theme/MIDNIGHT") or to a custom theme (DefaultTheme="arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639").
    */
  var AccountCustomization: typings.awsSdk.quicksightMod.AccountCustomization = js.native
  /**
    * The ID for the AWS account that you want to customize QuickSight for.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace associated with the customization that you're creating.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.native
}

object CreateAccountCustomizationRequest {
  @scala.inline
  def apply(AccountCustomization: AccountCustomization, AwsAccountId: AwsAccountId): CreateAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AccountCustomization = AccountCustomization.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountCustomizationRequest]
  }
  @scala.inline
  implicit class CreateAccountCustomizationRequestOps[Self <: CreateAccountCustomizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountCustomization(value: AccountCustomization): Self = this.set("AccountCustomization", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
  }
  
}

