package typings
package cleanDashCssLib.cleanDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CleanCSS extends js.Object {
  def minify(sources: java.lang.String): cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output = js.native
  def minify(
    sources: java.lang.String,
    callback: js.Function2[
      /* error */ js.Any, 
      /* minified */ cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output, 
      scala.Unit
    ]
  ): cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output = js.native
  def minify(sources: js.Array[java.lang.String]): cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output = js.native
  def minify(
    sources: js.Array[java.lang.String],
    callback: js.Function2[
      /* error */ js.Any, 
      /* minified */ cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output, 
      scala.Unit
    ]
  ): cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output = js.native
  def minify(sources: js.Object): cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output = js.native
  def minify(
    sources: js.Object,
    callback: js.Function2[
      /* error */ js.Any, 
      /* minified */ cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output, 
      scala.Unit
    ]
  ): cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Output = js.native
}

