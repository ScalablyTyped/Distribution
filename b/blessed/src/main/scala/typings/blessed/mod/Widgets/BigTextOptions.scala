package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigTextOptions extends BoxOptions {
  /**
    * foreground character. (default: ' ')
    */
  var fch: js.UndefOr[String] = js.native
  /**
    * bdf->json font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var font: js.UndefOr[String] = js.native
  /**
    * bdf->json bold font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var fontBold: js.UndefOr[String] = js.native
}

object BigTextOptions {
  @scala.inline
  def apply(): BigTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigTextOptions]
  }
  @scala.inline
  implicit class BigTextOptionsOps[Self <: BigTextOptions] (val x: Self) extends AnyVal {
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
    def setFch(value: String): Self = this.set("fch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFch: Self = this.set("fch", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontBold(value: String): Self = this.set("fontBold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontBold: Self = this.set("fontBold", js.undefined)
  }
  
}

