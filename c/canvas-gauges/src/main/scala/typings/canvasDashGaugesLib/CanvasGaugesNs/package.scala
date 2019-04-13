package typings
package canvasDashGaugesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CanvasGaugesNs {
  type AnimationRule = js.Function1[/* percent */ scala.Double, scala.Double]
  type DrawEventCallback = js.Function1[/* percent */ scala.Double, js.Any]
  type EndEventCallback = js.Function0[js.Any]
  type EventListeners = org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]]
  type MajorTicks = js.Array[java.lang.String] | js.Array[scala.Double]
  type RenderTarget = java.lang.String | stdLib.HTMLElement
}
