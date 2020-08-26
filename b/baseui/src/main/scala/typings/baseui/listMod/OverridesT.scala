package typings.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverridesT extends js.Object {
  var ArtworkContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any
  ] = js.native
  var Content: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any
  ] = js.native
  var EndEnhancerContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
}

object OverridesT {
  @scala.inline
  def apply(): OverridesT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverridesT]
  }
  @scala.inline
  implicit class OverridesTOps[Self <: OverridesT] (val x: Self) extends AnyVal {
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
    def setArtworkContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any
    ): Self = this.set("ArtworkContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtworkContainer: Self = this.set("ArtworkContainer", js.undefined)
    @scala.inline
    def setContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any
    ): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setEndEnhancerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("EndEnhancerContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndEnhancerContainer: Self = this.set("EndEnhancerContainer", js.undefined)
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
  }
  
}

