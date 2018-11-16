package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "DigestTransform")
@js.native
class DigestTransform protected ()
  extends nodeLib.streamMod.Transform {
  def this(expected: java.lang.String) = this()
  def this(expected: java.lang.String, algorithm: java.lang.String) = this()
  def this(expected: java.lang.String, algorithm: java.lang.String, encoding: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.base64) = this()
  def this(expected: java.lang.String, algorithm: java.lang.String, encoding: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.hex) = this()
  def this(expected: java.lang.String, algorithm: java.lang.String, encoding: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.latin1) = this()
  var _actual: js.Any = js.native
  val actual: java.lang.String | scala.Null = js.native
  val algorithm: js.Any = js.native
  val digester: js.Any = js.native
  val encoding: js.Any = js.native
  val expected: java.lang.String = js.native
  var isValidateOnEnd: scala.Boolean = js.native
  def _flush(callback: js.Any): scala.Unit = js.native
  def _transform(chunk: nodeLib.Buffer, encoding: java.lang.String, callback: js.Any): scala.Unit = js.native
  def validate(): scala.Null = js.native
}

