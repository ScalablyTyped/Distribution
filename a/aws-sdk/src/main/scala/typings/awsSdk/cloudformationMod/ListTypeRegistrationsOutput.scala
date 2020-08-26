package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeRegistrationsOutput extends js.Object {
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    *  A list of type registration tokens. Use  DescribeTypeRegistration  to return detailed information about a type registration request.
    */
  var RegistrationTokenList: js.UndefOr[typings.awsSdk.cloudformationMod.RegistrationTokenList] = js.native
}

object ListTypeRegistrationsOutput {
  @scala.inline
  def apply(): ListTypeRegistrationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeRegistrationsOutput]
  }
  @scala.inline
  implicit class ListTypeRegistrationsOutputOps[Self <: ListTypeRegistrationsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRegistrationTokenListVarargs(value: RegistrationToken*): Self = this.set("RegistrationTokenList", js.Array(value :_*))
    @scala.inline
    def setRegistrationTokenList(value: RegistrationTokenList): Self = this.set("RegistrationTokenList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationTokenList: Self = this.set("RegistrationTokenList", js.undefined)
  }
  
}

