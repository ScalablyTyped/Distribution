package typings.baseui.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarOverrides[T] extends js.Object {
  var Avatar: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var Initials: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
}

object AvatarOverrides {
  @scala.inline
  def apply[T](): AvatarOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarOverrides[T]]
  }
  @scala.inline
  implicit class AvatarOverridesOps[Self <: AvatarOverrides[_], T] (val x: Self with AvatarOverrides[T]) extends AnyVal {
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
    def setAvatar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("Avatar", js.undefined)
    @scala.inline
    def setInitials(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Initials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitials: Self = this.set("Initials", js.undefined)
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
  }
  
}

