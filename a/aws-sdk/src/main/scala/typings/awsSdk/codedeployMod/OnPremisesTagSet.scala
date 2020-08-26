package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPremisesTagSet extends js.Object {
  /**
    * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.native
}

object OnPremisesTagSet {
  @scala.inline
  def apply(): OnPremisesTagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesTagSet]
  }
  @scala.inline
  implicit class OnPremisesTagSetOps[Self <: OnPremisesTagSet] (val x: Self) extends AnyVal {
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
    def setOnPremisesTagSetListVarargs(value: TagFilterList*): Self = this.set("onPremisesTagSetList", js.Array(value :_*))
    @scala.inline
    def setOnPremisesTagSetList(value: OnPremisesTagSetList): Self = this.set("onPremisesTagSetList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesTagSetList: Self = this.set("onPremisesTagSetList", js.undefined)
  }
  
}

