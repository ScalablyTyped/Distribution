package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.catbox.mod.PolicyOptionVariants because Already inherited */ @js.native
trait DecoratedPolicyOptions[T] extends PolicyOptions[T] {
  /**
    * @default false
    */
  var getDecoratedValue: js.UndefOr[Boolean] = js.native
}

object DecoratedPolicyOptions {
  @scala.inline
  def apply[T](): DecoratedPolicyOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoratedPolicyOptions[T]]
  }
  @scala.inline
  implicit class DecoratedPolicyOptionsOps[Self <: DecoratedPolicyOptions[_], T] (val x: Self with DecoratedPolicyOptions[T]) extends AnyVal {
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
    def setGetDecoratedValue(value: Boolean): Self = this.set("getDecoratedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetDecoratedValue: Self = this.set("getDecoratedValue", js.undefined)
  }
  
}

