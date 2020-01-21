package typings.cleanCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface exposed when a new CleanCSS object is created
  */
@js.native
trait MinifierOutput extends Minifier {
  def minify(sources: Sources): Output = js.native
  def minify(sources: Sources, callback: js.Function2[/* error */ js.Any, /* output */ Output, Unit]): Output = js.native
  def minify(sources: Sources, sourceMap: String): Output = js.native
  def minify(
    sources: Sources,
    sourceMap: String,
    callback: js.Function2[/* error */ js.Any, /* output */ Output, Unit]
  ): Output = js.native
}

