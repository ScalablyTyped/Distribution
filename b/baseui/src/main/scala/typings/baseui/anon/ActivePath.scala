package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivePath extends js.Object {
  var ActivePath: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var Svg: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var TrackPath: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object ActivePath {
  @scala.inline
  def apply(): ActivePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivePath]
  }
  @scala.inline
  implicit class ActivePathOps[Self <: ActivePath] (val x: Self) extends AnyVal {
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
    def setActivePath(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ActivePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivePath: Self = this.set("ActivePath", js.undefined)
    @scala.inline
    def setSvg(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("Svg", js.undefined)
    @scala.inline
    def setTrackPath(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TrackPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackPath: Self = this.set("TrackPath", js.undefined)
  }
  
}

