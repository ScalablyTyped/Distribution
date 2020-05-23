package typings.cheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheerioOptionsInterface extends js.Object {
  var _useHtmlParser2: js.UndefOr[Boolean] = js.undefined
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
  var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
  var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
  var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
  var normalizeWhitespace: js.UndefOr[Boolean] = js.undefined
  var recognizeCDATA: js.UndefOr[Boolean] = js.undefined
  var recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined
  var withEndIndices: js.UndefOr[Boolean] = js.undefined
  var withStartIndices: js.UndefOr[Boolean] = js.undefined
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // HTMLParser2 https://github.com/fb55/htmlparser2/wiki/Parser-options
  // DomHandler https://github.com/fb55/DomHandler
  var xmlMode: js.UndefOr[Boolean] = js.undefined
}

object CheerioOptionsInterface {
  @scala.inline
  def apply(
    _useHtmlParser2: js.UndefOr[Boolean] = js.undefined,
    decodeEntities: js.UndefOr[Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[Boolean] = js.undefined,
    lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined,
    lowerCaseTags: js.UndefOr[Boolean] = js.undefined,
    normalizeWhitespace: js.UndefOr[Boolean] = js.undefined,
    recognizeCDATA: js.UndefOr[Boolean] = js.undefined,
    recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined,
    withEndIndices: js.UndefOr[Boolean] = js.undefined,
    withStartIndices: js.UndefOr[Boolean] = js.undefined,
    xmlMode: js.UndefOr[Boolean] = js.undefined
  ): CheerioOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_useHtmlParser2)) __obj.updateDynamic("_useHtmlParser2")(_useHtmlParser2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerCaseAttributeNames)) __obj.updateDynamic("lowerCaseAttributeNames")(lowerCaseAttributeNames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerCaseTags)) __obj.updateDynamic("lowerCaseTags")(lowerCaseTags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeWhitespace)) __obj.updateDynamic("normalizeWhitespace")(normalizeWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recognizeCDATA)) __obj.updateDynamic("recognizeCDATA")(recognizeCDATA.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recognizeSelfClosing)) __obj.updateDynamic("recognizeSelfClosing")(recognizeSelfClosing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withEndIndices)) __obj.updateDynamic("withEndIndices")(withEndIndices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withStartIndices)) __obj.updateDynamic("withStartIndices")(withStartIndices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlMode)) __obj.updateDynamic("xmlMode")(xmlMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheerioOptionsInterface]
  }
}

