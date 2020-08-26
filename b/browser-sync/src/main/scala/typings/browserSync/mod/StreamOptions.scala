package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamOptions extends js.Object {
  var `match`: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ _
    ])
  ] = js.native
  var once: js.UndefOr[Boolean] = js.native
}

object StreamOptions {
  @scala.inline
  def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  @scala.inline
  implicit class StreamOptionsOps[Self <: StreamOptions] (val x: Self) extends AnyVal {
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
    def setMatchVarargs(value: js.Any*): Self = this.set("match", js.Array(value :_*))
    @scala.inline
    def setMatch(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ _
        ])
    ): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
  }
  
}

