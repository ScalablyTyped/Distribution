package typings.backgrid.backgridMod

import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import typings.backbone.backboneMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "Grid")
@js.native
class Grid protected () extends View[Model] {
  def this(options: GridOptions) = this()
  var body: Body = js.native
  var footer: js.Any = js.native
  var header: js.Any = js.native
  def getSelectedModels(): js.Array[Model] = js.native
  def initialize(options: js.Any): Unit = js.native
  def insertColumn(options: js.Any*): Grid = js.native
  def insertRow(model: Model, collection: Collection[Model], options: js.Any): js.Any = js.native
  def removeColumn(options: js.Any*): Grid = js.native
  def removeRow(model: Model, collection: Collection[Model], options: js.Any): js.Any = js.native
}

