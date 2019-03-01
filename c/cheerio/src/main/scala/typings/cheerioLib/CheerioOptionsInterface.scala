package typings
package cheerioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheerioOptionsInterface extends js.Object {
  var decodeEntities: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var lowerCaseAttributeNames: js.UndefOr[scala.Boolean] = js.undefined
  var lowerCaseTags: js.UndefOr[scala.Boolean] = js.undefined
  var normalizeWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var recognizeCDATA: js.UndefOr[scala.Boolean] = js.undefined
  var recognizeSelfClosing: js.UndefOr[scala.Boolean] = js.undefined
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // HTMLParser2 https://github.com/fb55/htmlparser2/wiki/Parser-options
  // DomHandler https://github.com/fb55/DomHandler
  var xmlMode: js.UndefOr[scala.Boolean] = js.undefined
}

object CheerioOptionsInterface {
  @scala.inline
  def apply(
    decodeEntities: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    lowerCaseAttributeNames: js.UndefOr[scala.Boolean] = js.undefined,
    lowerCaseTags: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    recognizeCDATA: js.UndefOr[scala.Boolean] = js.undefined,
    recognizeSelfClosing: js.UndefOr[scala.Boolean] = js.undefined,
    xmlMode: js.UndefOr[scala.Boolean] = js.undefined
  ): CheerioOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities)
    if (!js.isUndefined(ignoreWhitespace)) __obj.updateDynamic("ignoreWhitespace")(ignoreWhitespace)
    if (!js.isUndefined(lowerCaseAttributeNames)) __obj.updateDynamic("lowerCaseAttributeNames")(lowerCaseAttributeNames)
    if (!js.isUndefined(lowerCaseTags)) __obj.updateDynamic("lowerCaseTags")(lowerCaseTags)
    if (!js.isUndefined(normalizeWhitespace)) __obj.updateDynamic("normalizeWhitespace")(normalizeWhitespace)
    if (!js.isUndefined(recognizeCDATA)) __obj.updateDynamic("recognizeCDATA")(recognizeCDATA)
    if (!js.isUndefined(recognizeSelfClosing)) __obj.updateDynamic("recognizeSelfClosing")(recognizeSelfClosing)
    if (!js.isUndefined(xmlMode)) __obj.updateDynamic("xmlMode")(xmlMode)
    __obj.asInstanceOf[CheerioOptionsInterface]
  }
}

