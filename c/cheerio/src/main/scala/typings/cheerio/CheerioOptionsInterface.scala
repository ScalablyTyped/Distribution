package typings.cheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheerioOptionsInterface extends js.Object {
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
  var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
  var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
  var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
  var normalizeWhitespace: js.UndefOr[Boolean] = js.undefined
  var recognizeCDATA: js.UndefOr[Boolean] = js.undefined
  var recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // HTMLParser2 https://github.com/fb55/htmlparser2/wiki/Parser-options
  // DomHandler https://github.com/fb55/DomHandler
  var xmlMode: js.UndefOr[Boolean] = js.undefined
}

object CheerioOptionsInterface {
  @scala.inline
  def apply(
    decodeEntities: js.UndefOr[Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[Boolean] = js.undefined,
    lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined,
    lowerCaseTags: js.UndefOr[Boolean] = js.undefined,
    normalizeWhitespace: js.UndefOr[Boolean] = js.undefined,
    recognizeCDATA: js.UndefOr[Boolean] = js.undefined,
    recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined,
    xmlMode: js.UndefOr[Boolean] = js.undefined
  ): CheerioOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerCaseAttributeNames)) __obj.updateDynamic("lowerCaseAttributeNames")(lowerCaseAttributeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerCaseTags)) __obj.updateDynamic("lowerCaseTags")(lowerCaseTags.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeWhitespace)) __obj.updateDynamic("normalizeWhitespace")(normalizeWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(recognizeCDATA)) __obj.updateDynamic("recognizeCDATA")(recognizeCDATA.asInstanceOf[js.Any])
    if (!js.isUndefined(recognizeSelfClosing)) __obj.updateDynamic("recognizeSelfClosing")(recognizeSelfClosing.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlMode)) __obj.updateDynamic("xmlMode")(xmlMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheerioOptionsInterface]
  }
}

