package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ListItemProfile extends js.Object {
  var ListItemProfile: js.UndefOr[Override[_]] = js.undefined
  var ProfileBody: js.UndefOr[Override[_]] = js.undefined
  var ProfileImg: js.UndefOr[Override[_]] = js.undefined
  var ProfileImgContainer: js.UndefOr[Override[_]] = js.undefined
  var ProfileLabelsContainer: js.UndefOr[Override[_]] = js.undefined
  var ProfileSubtitle: js.UndefOr[Override[_]] = js.undefined
  var ProfileTitle: js.UndefOr[Override[_]] = js.undefined
}

object Anon_ListItemProfile {
  @scala.inline
  def apply(
    ListItemProfile: Override[_] = null,
    ProfileBody: Override[_] = null,
    ProfileImg: Override[_] = null,
    ProfileImgContainer: Override[_] = null,
    ProfileLabelsContainer: Override[_] = null,
    ProfileSubtitle: Override[_] = null,
    ProfileTitle: Override[_] = null
  ): Anon_ListItemProfile = {
    val __obj = js.Dynamic.literal()
    if (ListItemProfile != null) __obj.updateDynamic("ListItemProfile")(ListItemProfile.asInstanceOf[js.Any])
    if (ProfileBody != null) __obj.updateDynamic("ProfileBody")(ProfileBody.asInstanceOf[js.Any])
    if (ProfileImg != null) __obj.updateDynamic("ProfileImg")(ProfileImg.asInstanceOf[js.Any])
    if (ProfileImgContainer != null) __obj.updateDynamic("ProfileImgContainer")(ProfileImgContainer.asInstanceOf[js.Any])
    if (ProfileLabelsContainer != null) __obj.updateDynamic("ProfileLabelsContainer")(ProfileLabelsContainer.asInstanceOf[js.Any])
    if (ProfileSubtitle != null) __obj.updateDynamic("ProfileSubtitle")(ProfileSubtitle.asInstanceOf[js.Any])
    if (ProfileTitle != null) __obj.updateDynamic("ProfileTitle")(ProfileTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ListItemProfile]
  }
}

