package typings.cheapDashRuler.cheapDashRulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cheap-ruler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(lat: Double): CheapRuler = js.native
  def apply(lat: Double, units: String): CheapRuler = js.native
  def fromTile(y: Double, z: Double): CheapRuler = js.native
  def fromTile(y: Double, z: Double, units: String): CheapRuler = js.native
}

