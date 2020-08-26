package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentDescriptionsMessage extends js.Object {
  /**
    *  Returns an EnvironmentDescription list. 
    */
  var Environments: js.UndefOr[EnvironmentDescriptionsList] = js.native
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object EnvironmentDescriptionsMessage {
  @scala.inline
  def apply(): EnvironmentDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDescriptionsMessage]
  }
  @scala.inline
  implicit class EnvironmentDescriptionsMessageOps[Self <: EnvironmentDescriptionsMessage] (val x: Self) extends AnyVal {
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
    def setEnvironmentsVarargs(value: EnvironmentDescription*): Self = this.set("Environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: EnvironmentDescriptionsList): Self = this.set("Environments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironments: Self = this.set("Environments", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

