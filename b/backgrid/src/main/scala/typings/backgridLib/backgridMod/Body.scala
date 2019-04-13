package typings
package backgridLib.backgridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "Body")
@js.native
class Body ()
  extends backboneLib.backboneMod.View[backboneLib.backboneMod.Model] {
  def initialize(options: js.Any): scala.Unit = js.native
  def insertRow(
    model: backboneLib.backboneMod.Model,
    collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    options: js.Any
  ): js.Any = js.native
  def moveToNextCell(model: backboneLib.backboneMod.Model, cell: Column, command: Command): js.Any = js.native
  def refresh(): Body = js.native
  def removeRow(
    model: backboneLib.backboneMod.Model,
    collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    options: js.Any
  ): js.Any = js.native
}

