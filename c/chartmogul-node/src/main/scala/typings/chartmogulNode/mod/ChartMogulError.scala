package typings.chartmogulNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "ChartMogulError")
@js.native
class ChartMogulError () extends Error {
  var httpStatus: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var response: js.Any = js.native
}

