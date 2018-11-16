package typings
package atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var element: stdLib.HTMLElement
  var fitInViewport: js.UndefOr[scala.Boolean] = js.undefined
  var limiter: js.UndefOr[
    stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect | (js.Function0[stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect])
  ] = js.undefined
  var positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]
  var target: stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect | (js.Function0[stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect])
}

