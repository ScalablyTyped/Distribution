package typings.debessmann.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debessmann", "Event")
@js.native
class Event () extends js.Object {
  var _id: EventId = js.native
  var headers: StringDictionary[String] = js.native
  var id: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[StringDictionary[Double]] = js.native
  var payload: js.UndefOr[js.Any] = js.native
  var timestamp: js.UndefOr[String] = js.native
}

