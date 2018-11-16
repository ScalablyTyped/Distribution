package typings
package babelifyLib.babelifyMod.BabelifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelifyObject
  extends nodeLib.streamMod.Transform {
  def _flush(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def _transform(buf: java.lang.String, encoding: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def _transform(buf: nodeLib.Buffer, encoding: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

