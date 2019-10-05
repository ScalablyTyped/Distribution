package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.Anon_Code
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder extends js.Object {
  def decode(buffer: Buffer, `type`: Anon_Code): Unit = js.native
  def encode(value: js.Any): Buffer = js.native
  def encode(value: js.Any, typeInfo: String): Buffer = js.native
  def encode(value: js.Any, typeInfo: Double): Buffer = js.native
  def encode(value: js.Any, typeInfo: Anon_Code): Buffer = js.native
}

@JSImport("cassandra-driver", "Encoder")
@js.native
object Encoder extends TopLevel[EncoderStatic]

