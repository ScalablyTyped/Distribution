package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockConfiguration extends js.Object {
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled.
    */
  var ObjectLockEnabled: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockEnabled] = js.native
  /**
    * The Object Lock rule in place for the specified object.
    */
  var Rule: js.UndefOr[ObjectLockRule] = js.native
}

object ObjectLockConfiguration {
  @scala.inline
  def apply(): ObjectLockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockConfiguration]
  }
  @scala.inline
  implicit class ObjectLockConfigurationOps[Self <: ObjectLockConfiguration] (val x: Self) extends AnyVal {
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
    def setObjectLockEnabled(value: ObjectLockEnabled): Self = this.set("ObjectLockEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockEnabled: Self = this.set("ObjectLockEnabled", js.undefined)
    @scala.inline
    def setRule(value: ObjectLockRule): Self = this.set("Rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("Rule", js.undefined)
  }
  
}

