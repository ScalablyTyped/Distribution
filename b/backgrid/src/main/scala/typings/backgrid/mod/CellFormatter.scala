package typings.backgrid.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "CellFormatter")
@js.native
class CellFormatter () extends js.Object {
  def fromRaw(rawData: js.Any, model: Model[_, ModelSetOptions]): js.Any = js.native
  def toRaw(formattedData: js.Any, model: Model[_, ModelSetOptions]): js.Any = js.native
}

