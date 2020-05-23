package typings.backgrid.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "CellEditor")
@js.native
class CellEditor ()
  extends View[Model[js.Any, ModelSetOptions]] {
  def initialize(options: js.Any): Unit = js.native
  def postRender(model: Model[_, ModelSetOptions], column: Model[_, ModelSetOptions]): js.Any = js.native
}

