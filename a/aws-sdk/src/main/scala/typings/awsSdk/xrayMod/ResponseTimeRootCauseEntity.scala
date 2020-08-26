package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseTimeRootCauseEntity extends js.Object {
  /**
    * The types and messages of the exceptions.
    */
  var Coverage: js.UndefOr[NullableDouble] = js.native
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.native
}

object ResponseTimeRootCauseEntity {
  @scala.inline
  def apply(): ResponseTimeRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseTimeRootCauseEntity]
  }
  @scala.inline
  implicit class ResponseTimeRootCauseEntityOps[Self <: ResponseTimeRootCauseEntity] (val x: Self) extends AnyVal {
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
    def setCoverage(value: NullableDouble): Self = this.set("Coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("Coverage", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRemote(value: NullableBoolean): Self = this.set("Remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("Remote", js.undefined)
  }
  
}

