package typings.convertDashUnits.convertDashUnitsMod

import typings.convertDashUnits.Anon_Abbr
import typings.convertDashUnits.Anon_AbbrMeasure
import typings.convertDashUnits.Anon_CutOffNumber
import typings.convertDashUnits.Anon_Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Convert extends js.Object {
  def describe[T /* <: unit */](abbr: T): Anon_AbbrMeasure[T] = js.native
  def from(from: unit): this.type = js.native
  def getUnit[T /* <: unit */](abbr: T): Anon_Abbr[T] = js.native
  def list(): js.Array[unit] = js.native
  def list(measure: measure): js.Array[unit] = js.native
  def measures(): js.Array[measure] = js.native
  def possibilities(): js.Array[unit] = js.native
  def possibilities(measure: measure): js.Array[unit] = js.native
  /* private */ def throwUnsupportedUnitError(what: String): Unit = js.native
  def to(to: unit): Double = js.native
  def toBest(): Anon_Plural = js.native
  def toBest(options: Anon_CutOffNumber): Anon_Plural = js.native
}

