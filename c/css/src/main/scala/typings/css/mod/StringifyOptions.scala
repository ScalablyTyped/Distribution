package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyOptions extends js.Object {
  /** Omit comments and extraneous whitespace. */
  var compress: js.UndefOr[Boolean] = js.native
  /** The string used to indent the output. Defaults to two spaces. */
  var indent: js.UndefOr[String] = js.native
  /** (enabled by default, specify false to disable)
    *  Reads any source maps referenced by the input files 
    * when generating the output source map. When enabled, 
    * file system access may be required for reading the referenced source maps. 
    */
  var inputSourcemaps: js.UndefOr[Boolean] = js.native
  /** Return a sourcemap along with the CSS output. 
    * Using the source option of css.parse is strongly recommended 
    * when creating a source map. Specify sourcemap: 'generator' 
    * to return the SourceMapGenerator object instead of serializing the source map. 
    */
  var sourcemap: js.UndefOr[String] = js.native
}

object StringifyOptions {
  @scala.inline
  def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
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
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setInputSourcemaps(value: Boolean): Self = this.set("inputSourcemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSourcemaps: Self = this.set("inputSourcemaps", js.undefined)
    @scala.inline
    def setSourcemap(value: String): Self = this.set("sourcemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemap: Self = this.set("sourcemap", js.undefined)
  }
  
}

