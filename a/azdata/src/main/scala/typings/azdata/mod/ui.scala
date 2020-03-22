package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "ui")
@js.native
object ui extends js.Object {
  def registerModelViewProvider(widgetId: String, handler: js.Function1[/* view */ ModelView, Unit]): Unit = js.native
}

