package typings.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceMap extends js.Object {
  /**
    * The source map of the file, if needed
    */
  var sourceMap: js.UndefOr[String] = js.undefined
  /**
    * The contents of the file, should be css
    */
  var styles: String
}

object AnonSourceMap {
  @scala.inline
  def apply(styles: String, sourceMap: String = null): AnonSourceMap = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceMap]
  }
}

