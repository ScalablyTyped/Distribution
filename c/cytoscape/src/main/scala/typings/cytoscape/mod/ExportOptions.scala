package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#core/export
  */
@js.native
trait ExportOptions extends js.Object {
  /**
    * The background colour of the image (transparent by default).
    */
  var bg: js.UndefOr[String] = js.native
  /**
    * Whether to export the current viewport view (false, default) or the entire graph (true).
    */
  var full: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the scale automatically in combination with maxWidth such that the resultant image is no taller than maxHeight.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Specifies the scale automatically in combination with maxHeight such that the resultant image is no wider than maxWidth.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * This value specifies a positive number that scales the size of the resultant image.
    */
  var scale: js.UndefOr[Double] = js.native
}

object ExportOptions {
  @scala.inline
  def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  @scala.inline
  implicit class ExportOptionsOps[Self <: ExportOptions] (val x: Self) extends AnyVal {
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
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

