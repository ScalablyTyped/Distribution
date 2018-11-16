package typings
package canvasDashGaugesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CanvasGaugesNs {
  type AnimationRule = js.Function1[/* percent */ scala.Double, scala.Double]
  type DrawEventCallback = js.Function1[/* percent */ scala.Double, js.Any]
  type EndEventCallback = js.Function0[js.Any]
  type FontStyle = canvasDashGaugesLib.canvasDashGaugesLibStrings.normal | canvasDashGaugesLib.canvasDashGaugesLibStrings.italic | canvasDashGaugesLib.canvasDashGaugesLibStrings.oblique
  type FontWeight = canvasDashGaugesLib.canvasDashGaugesLibStrings.normal | canvasDashGaugesLib.canvasDashGaugesLibStrings.bold | canvasDashGaugesLib.canvasDashGaugesLibStrings.bolder | canvasDashGaugesLib.canvasDashGaugesLibStrings.lighter | canvasDashGaugesLib.canvasDashGaugesLibStrings.`100` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`200` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`300` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`400` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`500` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`600` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`700` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`800` | canvasDashGaugesLib.canvasDashGaugesLibStrings.`900`
  type MajorTicks = js.Array[java.lang.String] | js.Array[scala.Double]
  type RenderTarget = java.lang.String | stdLib.HTMLElement
}
