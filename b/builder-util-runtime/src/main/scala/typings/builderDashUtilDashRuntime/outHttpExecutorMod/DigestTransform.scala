package typings.builderDashUtilDashRuntime.outHttpExecutorMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.base64
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.hex
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.latin1
import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "DigestTransform")
@js.native
class DigestTransform protected () extends Transform {
  def this(expected: String) = this()
  def this(expected: String, algorithm: String) = this()
  def this(expected: String, algorithm: String, encoding: base64) = this()
  def this(expected: String, algorithm: String, encoding: hex) = this()
  def this(expected: String, algorithm: String, encoding: latin1) = this()
  var _actual: js.Any = js.native
  val actual: String | Null = js.native
  val algorithm: js.Any = js.native
  val digester: js.Any = js.native
  val encoding: js.Any = js.native
  val expected: String = js.native
  var isValidateOnEnd: Boolean = js.native
  def _flush(callback: js.Any): Unit = js.native
  def _transform(chunk: Buffer, encoding: String, callback: js.Any): Unit = js.native
  def validate(): Null = js.native
}

