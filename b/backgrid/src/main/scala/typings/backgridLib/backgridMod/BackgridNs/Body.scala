package typings
package backgridLib.backgridMod.BackgridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body
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

