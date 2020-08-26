package typings.buble.mod

import typings.buble.anon.Arrow
import typings.buble.anon.Chrome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions extends js.Object {
   // input
  var file: js.UndefOr[String] = js.native
     // output
  var includeContent: js.UndefOr[Boolean] = js.native
  // custom JSX pragma (https://buble.surge.sh/guide/#jsx)
  var jsx: js.UndefOr[String] = js.native
  // others
  var namedFunctionExpressions: js.UndefOr[Boolean] = js.native
   // default: 'React.createElement'
  // custom `Object.assign` (https://buble.surge.sh/guide/#object-spread-and-rest)
  var objectAssign: js.UndefOr[String | Boolean] = js.native
  // used for sourcemaps
  var source: js.UndefOr[String] = js.native
  // source: https://github.com/Rich-Harris/buble/blob/master/src/support.js
  var target: js.UndefOr[Chrome] = js.native
  // transforms
  var transforms: js.UndefOr[Arrow] = js.native
}

object TransformOptions {
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setIncludeContent(value: Boolean): Self = this.set("includeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeContent: Self = this.set("includeContent", js.undefined)
    @scala.inline
    def setJsx(value: String): Self = this.set("jsx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
    @scala.inline
    def setNamedFunctionExpressions(value: Boolean): Self = this.set("namedFunctionExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedFunctionExpressions: Self = this.set("namedFunctionExpressions", js.undefined)
    @scala.inline
    def setObjectAssign(value: String | Boolean): Self = this.set("objectAssign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectAssign: Self = this.set("objectAssign", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: Chrome): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTransforms(value: Arrow): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

