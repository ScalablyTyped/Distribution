package typings
package builderDashUtilDashRuntimeLib.outUuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/uuid", "UUID")
@js.native
class UUID protected () extends js.Object {
  def this(uuid: java.lang.String) = this()
  def this(uuid: nodeLib.Buffer) = this()
  var ascii: js.Any = js.native
  val binary: js.Any = js.native
  val version: js.Any = js.native
  def inspect(): java.lang.String = js.native
}

@JSImport("builder-util-runtime/out/uuid", "UUID")
@js.native
object UUID extends js.Object {
  val OID: nodeLib.Buffer = js.native
  def check(uuid: java.lang.String): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Format | builderDashUtilDashRuntimeLib.Anon_FormatVariant = js.native
  def check(uuid: java.lang.String, offset: scala.Double): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Format | builderDashUtilDashRuntimeLib.Anon_FormatVariant = js.native
  def check(uuid: nodeLib.Buffer): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Format | builderDashUtilDashRuntimeLib.Anon_FormatVariant = js.native
  def check(uuid: nodeLib.Buffer, offset: scala.Double): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Format | builderDashUtilDashRuntimeLib.Anon_FormatVariant = js.native
  def parse(input: java.lang.String): nodeLib.Buffer = js.native
  def v5(name: java.lang.String, namespace: nodeLib.Buffer): js.Any = js.native
  def v5(name: nodeLib.Buffer, namespace: nodeLib.Buffer): js.Any = js.native
}

