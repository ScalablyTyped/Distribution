package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GutterStyle extends js.Object {
  /**
    * This Boolean value controls whether to display a gutter space between sheet tiles. 
    */
  var Show: js.UndefOr[scala.Boolean] = js.native
}

object GutterStyle {
  @scala.inline
  def apply(): GutterStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GutterStyle]
  }
  @scala.inline
  implicit class GutterStyleOps[Self <: GutterStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShow(value: scala.Boolean): Self = this.set("Show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("Show", js.undefined)
  }
  
}

