package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProfile extends js.Object {
  var ChildMenuPopover: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var ListItemProfile: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var ProfileBody: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var ProfileImg: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var ProfileImgContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var ProfileLabelsContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var ProfileSubtitle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var ProfileTitle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object ListItemProfile {
  @scala.inline
  def apply(): ListItemProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProfile]
  }
  @scala.inline
  implicit class ListItemProfileOps[Self <: ListItemProfile] (val x: Self) extends AnyVal {
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
    def setChildMenuPopover(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ChildMenuPopover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildMenuPopover: Self = this.set("ChildMenuPopover", js.undefined)
    @scala.inline
    def setListItemProfile(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ListItemProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemProfile: Self = this.set("ListItemProfile", js.undefined)
    @scala.inline
    def setProfileBody(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ProfileBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileBody: Self = this.set("ProfileBody", js.undefined)
    @scala.inline
    def setProfileImg(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ProfileImg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileImg: Self = this.set("ProfileImg", js.undefined)
    @scala.inline
    def setProfileImgContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ProfileImgContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileImgContainer: Self = this.set("ProfileImgContainer", js.undefined)
    @scala.inline
    def setProfileLabelsContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ProfileLabelsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileLabelsContainer: Self = this.set("ProfileLabelsContainer", js.undefined)
    @scala.inline
    def setProfileSubtitle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ProfileSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileSubtitle: Self = this.set("ProfileSubtitle", js.undefined)
    @scala.inline
    def setProfileTitle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ProfileTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileTitle: Self = this.set("ProfileTitle", js.undefined)
  }
  
}

