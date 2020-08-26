package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockRule extends js.Object {
  /**
    * The default retention period that you want to apply to new objects placed in the specified bucket.
    */
  var DefaultRetention: js.UndefOr[typings.awsSdk.s3Mod.DefaultRetention] = js.native
}

object ObjectLockRule {
  @scala.inline
  def apply(): ObjectLockRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockRule]
  }
  @scala.inline
  implicit class ObjectLockRuleOps[Self <: ObjectLockRule] (val x: Self) extends AnyVal {
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
    def setDefaultRetention(value: DefaultRetention): Self = this.set("DefaultRetention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRetention: Self = this.set("DefaultRetention", js.undefined)
  }
  
}

