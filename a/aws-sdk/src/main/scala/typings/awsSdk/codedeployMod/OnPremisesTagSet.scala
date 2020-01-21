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
  def apply(onPremisesTagSetList: OnPremisesTagSetList = null): OnPremisesTagSet = {
    val __obj = js.Dynamic.literal()
    if (onPremisesTagSetList != null) __obj.updateDynamic("onPremisesTagSetList")(onPremisesTagSetList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPremisesTagSet]
  }
}

