package typings
package cryptojsLib.CryptoJSNs.x64Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Word
  extends cryptojsLib.CryptoJSNs.libNs.Base {
  var high: scala.Double = js.native
  var low: scala.Double = js.native
  def create(): Word = js.native
  def create(high: scala.Double): Word = js.native
  def create(high: scala.Double, low: scala.Double): Word = js.native
  def init(): scala.Unit = js.native
  def init(high: scala.Double): scala.Unit = js.native
  def init(high: scala.Double, low: scala.Double): scala.Unit = js.native
}

