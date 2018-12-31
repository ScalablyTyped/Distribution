package typings
package blazyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlazyOptions extends js.Object {
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[
    js.Function2[
      /* ele */ stdLib.Element | stdLib.HTMLElement, 
      /* msg */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var errorClass: js.UndefOr[java.lang.String] = js.undefined
  var loadInvisible: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var saveViewportOffsetDelay: js.UndefOr[scala.Double] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[js.Function1[/* ele */ stdLib.Element | stdLib.HTMLElement, scala.Unit]] = js.undefined
  var successClass: js.UndefOr[java.lang.String] = js.undefined
  var validateDelay: js.UndefOr[scala.Double] = js.undefined
}

