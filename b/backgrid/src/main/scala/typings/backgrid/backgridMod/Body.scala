package typings.backgrid.backgridMod

import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import typings.backbone.backboneMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "Body")
@js.native
class Body () extends View[Model] {
  def initialize(options: js.Any): Unit = js.native
  def insertRow(model: Model, collection: Collection[Model], options: js.Any): js.Any = js.native
  def moveToNextCell(model: Model, cell: Column, command: Command): js.Any = js.native
  def refresh(): Body = js.native
  def removeRow(model: Model, collection: Collection[Model], options: js.Any): js.Any = js.native
}

