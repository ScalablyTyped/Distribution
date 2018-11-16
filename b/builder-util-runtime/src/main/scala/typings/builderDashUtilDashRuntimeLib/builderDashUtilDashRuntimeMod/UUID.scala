package typings
package builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", "UUID")
@js.native
class UUID protected ()
  extends builderDashUtilDashRuntimeLib.outUuidMod.UUID {
  def this(uuid: java.lang.String) = this()
  def this(uuid: nodeLib.Buffer) = this()
}

@JSImport("builder-util-runtime", "UUID")
@js.native
object UUID extends js.Object {
  val OID: nodeLib.Buffer = js.native
  def check(uuid: java.lang.String): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Variant | builderDashUtilDashRuntimeLib.Anon_VariantFormat = js.native
  def check(uuid: java.lang.String, offset: scala.Double): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Variant | builderDashUtilDashRuntimeLib.Anon_VariantFormat = js.native
  def check(uuid: nodeLib.Buffer): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Variant | builderDashUtilDashRuntimeLib.Anon_VariantFormat = js.native
  def check(uuid: nodeLib.Buffer, offset: scala.Double): builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`false` | builderDashUtilDashRuntimeLib.Anon_Variant | builderDashUtilDashRuntimeLib.Anon_VariantFormat = js.native
  def parse(input: java.lang.String): nodeLib.Buffer = js.native
  def v5(name: java.lang.String, namespace: nodeLib.Buffer): js.Any = js.native
  def v5(name: nodeLib.Buffer, namespace: nodeLib.Buffer): js.Any = js.native
}

