package typings
package backgridLib.backgridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "Grid")
@js.native
class Grid protected ()
  extends backboneLib.backboneMod.View[backboneLib.backboneMod.Model] {
  def this(options: GridOptions) = this()
  var body: Body = js.native
  var footer: js.Any = js.native
  var header: js.Any = js.native
  def getSelectedModels(): js.Array[backboneLib.backboneMod.Model] = js.native
  def initialize(options: js.Any): scala.Unit = js.native
  def insertColumn(options: js.Any*): Grid = js.native
  def insertRow(
    model: backboneLib.backboneMod.Model,
    collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    options: js.Any
  ): js.Any = js.native
  def removeColumn(options: js.Any*): Grid = js.native
  def removeRow(
    model: backboneLib.backboneMod.Model,
    collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    options: js.Any
  ): js.Any = js.native
}

