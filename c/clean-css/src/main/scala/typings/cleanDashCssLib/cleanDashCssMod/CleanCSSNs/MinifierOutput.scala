package typings
package cleanDashCssLib.cleanDashCssMod.CleanCSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface exposed when a new CleanCSS object is created
  */
@js.native
trait MinifierOutput extends Minifier {
  def minify(sources: Sources): Output = js.native
  def minify(sources: Sources, callback: js.Function2[/* error */ js.Any, /* output */ Output, scala.Unit]): Output = js.native
  def minify(sources: Sources, sourceMap: java.lang.String): Output = js.native
  def minify(
    sources: Sources,
    sourceMap: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* output */ Output, scala.Unit]
  ): Output = js.native
}

