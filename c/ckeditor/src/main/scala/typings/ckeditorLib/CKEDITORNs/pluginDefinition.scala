package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluginDefinition extends js.Object {
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* editor */ editor, scala.Unit]] = js.undefined
  var lang: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var requires: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

