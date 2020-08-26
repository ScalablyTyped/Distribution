package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasPathType extends js.Object {
  /**
    * The API versions.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The path of an alias.
    */
  var path: js.UndefOr[String] = js.native
}

object AliasPathType {
  @scala.inline
  def apply(): AliasPathType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasPathType]
  }
  @scala.inline
  implicit class AliasPathTypeOps[Self <: AliasPathType] (val x: Self) extends AnyVal {
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
    def setApiVersionsVarargs(value: String*): Self = this.set("apiVersions", js.Array(value :_*))
    @scala.inline
    def setApiVersions(value: js.Array[String]): Self = this.set("apiVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersions: Self = this.set("apiVersions", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

