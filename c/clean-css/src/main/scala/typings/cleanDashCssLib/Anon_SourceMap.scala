package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceMap extends js.Object {
  /**
    * The source map of the file, if needed
    */
  var sourceMap: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contents of the file, should be css
    */
  var styles: java.lang.String
}

object Anon_SourceMap {
  @scala.inline
  def apply(styles: java.lang.String, sourceMap: java.lang.String = null): Anon_SourceMap = {
    val __obj = js.Dynamic.literal(styles = styles)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[Anon_SourceMap]
  }
}

