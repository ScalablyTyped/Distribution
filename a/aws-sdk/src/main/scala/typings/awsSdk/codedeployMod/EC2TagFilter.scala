package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2TagFilter extends js.Object {
  /**
    * The tag filter key.
    */
  var Key: js.UndefOr[typings.awsSdk.codedeployMod.Key] = js.native
  /**
    * The tag filter type:    KEY_ONLY: Key only.    VALUE_ONLY: Value only.    KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[EC2TagFilterType] = js.native
  /**
    * The tag filter value.
    */
  var Value: js.UndefOr[typings.awsSdk.codedeployMod.Value] = js.native
}

object EC2TagFilter {
  @scala.inline
  def apply(): EC2TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2TagFilter]
  }
  @scala.inline
  implicit class EC2TagFilterOps[Self <: EC2TagFilter] (val x: Self) extends AnyVal {
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
    def setType(value: EC2TagFilterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setValue(value: Value): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

