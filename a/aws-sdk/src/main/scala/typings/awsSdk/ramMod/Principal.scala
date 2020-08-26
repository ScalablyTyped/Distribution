package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Principal extends js.Object {
  /**
    * The time when the principal was associated with the resource share.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether the principal belongs to the same AWS organization as the AWS account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the principal.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
}

object Principal {
  @scala.inline
  def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  @scala.inline
  implicit class PrincipalOps[Self <: Principal] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: DateTime): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setResourceShareArn(value: String): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareArn: Self = this.set("resourceShareArn", js.undefined)
  }
  
}

