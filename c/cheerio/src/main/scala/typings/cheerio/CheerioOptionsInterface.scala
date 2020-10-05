package typings.cheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheerioOptionsInterface extends js.Object {
  var _useHtmlParser2: js.UndefOr[Boolean] = js.native
  var decodeEntities: js.UndefOr[Boolean] = js.native
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
  var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.native
  var lowerCaseTags: js.UndefOr[Boolean] = js.native
  var normalizeWhitespace: js.UndefOr[Boolean] = js.native
  var recognizeCDATA: js.UndefOr[Boolean] = js.native
  var recognizeSelfClosing: js.UndefOr[Boolean] = js.native
  var withEndIndices: js.UndefOr[Boolean] = js.native
  var withStartIndices: js.UndefOr[Boolean] = js.native
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // HTMLParser2 https://github.com/fb55/htmlparser2/wiki/Parser-options
  // DomHandler https://github.com/fb55/DomHandler
  var xmlMode: js.UndefOr[Boolean] = js.native
}

object CheerioOptionsInterface {
  @scala.inline
  def apply(): CheerioOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheerioOptionsInterface]
  }
  @scala.inline
  implicit class CheerioOptionsInterfaceOps[Self <: CheerioOptionsInterface] (val x: Self) extends AnyVal {
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
    def set_useHtmlParser2(value: Boolean): Self = this.set("_useHtmlParser2", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_useHtmlParser2: Self = this.set("_useHtmlParser2", js.undefined)
    @scala.inline
    def setDecodeEntities(value: Boolean): Self = this.set("decodeEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecodeEntities: Self = this.set("decodeEntities", js.undefined)
    @scala.inline
    def setIgnoreWhitespace(value: Boolean): Self = this.set("ignoreWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWhitespace: Self = this.set("ignoreWhitespace", js.undefined)
    @scala.inline
    def setLowerCaseAttributeNames(value: Boolean): Self = this.set("lowerCaseAttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerCaseAttributeNames: Self = this.set("lowerCaseAttributeNames", js.undefined)
    @scala.inline
    def setLowerCaseTags(value: Boolean): Self = this.set("lowerCaseTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerCaseTags: Self = this.set("lowerCaseTags", js.undefined)
    @scala.inline
    def setNormalizeWhitespace(value: Boolean): Self = this.set("normalizeWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeWhitespace: Self = this.set("normalizeWhitespace", js.undefined)
    @scala.inline
    def setRecognizeCDATA(value: Boolean): Self = this.set("recognizeCDATA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecognizeCDATA: Self = this.set("recognizeCDATA", js.undefined)
    @scala.inline
    def setRecognizeSelfClosing(value: Boolean): Self = this.set("recognizeSelfClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecognizeSelfClosing: Self = this.set("recognizeSelfClosing", js.undefined)
    @scala.inline
    def setWithEndIndices(value: Boolean): Self = this.set("withEndIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithEndIndices: Self = this.set("withEndIndices", js.undefined)
    @scala.inline
    def setWithStartIndices(value: Boolean): Self = this.set("withStartIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithStartIndices: Self = this.set("withStartIndices", js.undefined)
    @scala.inline
    def setXmlMode(value: Boolean): Self = this.set("xmlMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlMode: Self = this.set("xmlMode", js.undefined)
  }
  
}

