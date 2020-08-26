package typings.chromeApps.chrome.instanceID

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTokenParams extends js.Object {
  /**
    * The authorized entity that is used to obtain the token.
    */
  var authorizedEntity: String = js.native
  /**
    * The scope that is used to obtain the token.
    */
  var scope: String = js.native
}

object DeleteTokenParams {
  @scala.inline
  def apply(authorizedEntity: String, scope: String): DeleteTokenParams = {
    val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTokenParams]
  }
  @scala.inline
  implicit class DeleteTokenParamsOps[Self <: DeleteTokenParams] (val x: Self) extends AnyVal {
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
    def setAuthorizedEntity(value: String): Self = this.set("authorizedEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

