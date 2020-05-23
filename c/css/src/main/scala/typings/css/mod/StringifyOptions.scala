package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  /** Omit comments and extraneous whitespace. */
  var compress: js.UndefOr[Boolean] = js.undefined
  /** The string used to indent the output. Defaults to two spaces. */
  var indent: js.UndefOr[String] = js.undefined
  /** (enabled by default, specify false to disable)
    *  Reads any source maps referenced by the input files 
    * when generating the output source map. When enabled, 
    * file system access may be required for reading the referenced source maps. 
    */
  var inputSourcemaps: js.UndefOr[Boolean] = js.undefined
  /** Return a sourcemap along with the CSS output. 
    * Using the source option of css.parse is strongly recommended 
    * when creating a source map. Specify sourcemap: 'generator' 
    * to return the SourceMapGenerator object instead of serializing the source map. 
    */
  var sourcemap: js.UndefOr[String] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    inputSourcemaps: js.UndefOr[Boolean] = js.undefined,
    sourcemap: String = null
  ): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(inputSourcemaps)) __obj.updateDynamic("inputSourcemaps")(inputSourcemaps.get.asInstanceOf[js.Any])
    if (sourcemap != null) __obj.updateDynamic("sourcemap")(sourcemap.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
}

