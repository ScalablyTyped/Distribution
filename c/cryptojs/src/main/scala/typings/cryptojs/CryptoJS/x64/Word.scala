package typings.cryptojs.CryptoJS.x64

import typings.cryptojs.CryptoJS.lib.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Word extends Base {
  var high: Double = js.native
  var low: Double = js.native
  def create(): Word = js.native
  def create(high: js.UndefOr[scala.Nothing], low: Double): Word = js.native
  def create(high: Double): Word = js.native
  def create(high: Double, low: Double): Word = js.native
  def init(): Unit = js.native
  def init(high: js.UndefOr[scala.Nothing], low: Double): Unit = js.native
  def init(high: Double): Unit = js.native
  def init(high: Double, low: Double): Unit = js.native
}

