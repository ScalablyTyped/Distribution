package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMap extends js.Object {
  /**
    * The source map of the file, if needed
    */
  var sourceMap: js.UndefOr[String] = js.native
  /**
    * The contents of the file, should be css
    */
  var styles: String = js.native
}

object SourceMap {
  @scala.inline
  def apply(styles: String): SourceMap = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMap]
  }
  @scala.inline
  implicit class SourceMapOps[Self <: SourceMap] (val x: Self) extends AnyVal {
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
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceMap(value: String): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
  
}

