package typings.c3.anon

import typings.c3.c3Strings.`bottom-left`
import typings.c3.c3Strings.`bottom-right`
import typings.c3.c3Strings.`top-left`
import typings.c3.c3Strings.`top-right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor extends js.Object {
  /**
    * Decides the position of the legend.
    * Defaults to `"top-left"`.
    */
  var anchor: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.native
  /**
    * Defines the max step the legend has (e.g. If `step=2` and legend has 3 items, the legend has 2 columns).
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Set the horizontal position of the legend based on the anchor.
    * Defaults to `10`.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Set the vertical position of the legend based on the anchor.
    * Defaults to `0`.
    */
  var y: js.UndefOr[Double] = js.native
}

object Anchor {
  @scala.inline
  def apply(): Anchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
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
    def setAnchor(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

