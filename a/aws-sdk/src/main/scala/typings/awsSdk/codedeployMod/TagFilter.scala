package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFilter extends js.Object {
  /**
    * The on-premises instance tag filter key.
    */
  var Key: js.UndefOr[typings.awsSdk.codedeployMod.Key] = js.native
  /**
    * The on-premises instance tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[TagFilterType] = js.native
  /**
    * The on-premises instance tag filter value.
    */
  var Value: js.UndefOr[typings.awsSdk.codedeployMod.Value] = js.native
}

object TagFilter {
  @scala.inline
  def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  @scala.inline
  implicit class TagFilterOps[Self <: TagFilter] (val x: Self) extends AnyVal {
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
    def setKey(value: Key): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setType(value: TagFilterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setValue(value: Value): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

