package typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod

import typings.builderDashUtilDashRuntime.Anon_Format
import typings.builderDashUtilDashRuntime.Anon_FormatVariant
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeNumbers.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", "UUID")
@js.native
class UUID protected ()
  extends typings.builderDashUtilDashRuntime.outUuidMod.UUID {
  def this(uuid: String) = this()
  def this(uuid: Buffer) = this()
}

/* static members */
@JSImport("builder-util-runtime", "UUID")
@js.native
object UUID extends js.Object {
  val OID: Buffer = js.native
  def check(uuid: String): `false` | Anon_Format | Anon_FormatVariant = js.native
  def check(uuid: String, offset: Double): `false` | Anon_Format | Anon_FormatVariant = js.native
  def check(uuid: Buffer): `false` | Anon_Format | Anon_FormatVariant = js.native
  def check(uuid: Buffer, offset: Double): `false` | Anon_Format | Anon_FormatVariant = js.native
  def parse(input: String): Buffer = js.native
  def v5(name: String, namespace: Buffer): js.Any = js.native
  def v5(name: Buffer, namespace: Buffer): js.Any = js.native
}

