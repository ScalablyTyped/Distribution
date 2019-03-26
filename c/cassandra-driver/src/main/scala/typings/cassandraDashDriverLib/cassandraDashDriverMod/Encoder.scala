package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder extends js.Object {
  def decode(buffer: nodeLib.Buffer, `type`: cassandraDashDriverLib.Anon_Code): scala.Unit = js.native
  def encode(value: js.Any): nodeLib.Buffer = js.native
  def encode(value: js.Any, typeInfo: cassandraDashDriverLib.Anon_Code): nodeLib.Buffer = js.native
  def encode(value: js.Any, typeInfo: java.lang.String): nodeLib.Buffer = js.native
  def encode(value: js.Any, typeInfo: scala.Double): nodeLib.Buffer = js.native
}

@JSImport("cassandra-driver", "Encoder")
@js.native
class EncoderCls protected () extends Encoder {
  def this(protocolVersion: scala.Double, options: ClientOptions) = this()
}

