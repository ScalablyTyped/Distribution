package typings.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BemItem extends js.Object {
  def has(state: BemState): BemItem with String = js.native
  def is(state: BemState): BemItem with String = js.native
  def mix(mix: BemMix*): BemItem with String = js.native
  def split(): BemItem with String = js.native
  def split(separator: js.UndefOr[scala.Nothing], limit: Double): BemItem with String = js.native
  def split(separator: String): BemItem with String = js.native
  def split(separator: String, limit: Double): BemItem with String = js.native
  def state(state: BemState): BemItem with String = js.native
}

