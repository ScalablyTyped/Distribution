package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyManagedPrefixListResult extends js.Object {
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.native
}

object ModifyManagedPrefixListResult {
  @scala.inline
  def apply(): ModifyManagedPrefixListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyManagedPrefixListResult]
  }
  @scala.inline
  implicit class ModifyManagedPrefixListResultOps[Self <: ModifyManagedPrefixListResult] (val x: Self) extends AnyVal {
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
    def setPrefixList(value: ManagedPrefixList): Self = this.set("PrefixList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixList: Self = this.set("PrefixList", js.undefined)
  }
  
}

