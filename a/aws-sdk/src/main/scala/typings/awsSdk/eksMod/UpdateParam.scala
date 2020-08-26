package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateParam extends js.Object {
  /**
    * The keys associated with an update request.
    */
  var `type`: js.UndefOr[UpdateParamType] = js.native
  /**
    * The value of the keys submitted as part of an update request.
    */
  var value: js.UndefOr[String] = js.native
}

object UpdateParam {
  @scala.inline
  def apply(): UpdateParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParam]
  }
  @scala.inline
  implicit class UpdateParamOps[Self <: UpdateParam] (val x: Self) extends AnyVal {
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
    def setType(value: UpdateParamType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

