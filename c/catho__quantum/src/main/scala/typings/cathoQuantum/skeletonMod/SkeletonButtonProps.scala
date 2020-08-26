package typings.cathoQuantum.skeletonMod

import typings.cathoQuantum.anon.`1`
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonButtonProps extends js.Object {
  var size: xsmall | small | medium | large = js.native
  var theme: `1` = js.native
}

object SkeletonButtonProps {
  @scala.inline
  def apply(size: xsmall | small | medium | large, theme: `1`): SkeletonButtonProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonButtonProps]
  }
  @scala.inline
  implicit class SkeletonButtonPropsOps[Self <: SkeletonButtonProps] (val x: Self) extends AnyVal {
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
    def setSize(value: xsmall | small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: `1`): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

