package typings.builderUtilRuntime

import typings.builderUtilRuntime.anon.Format
import typings.builderUtilRuntime.anon.Variant
import typings.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uuidMod {
  
  @JSImport("builder-util-runtime/out/uuid", "UUID")
  @js.native
  class UUID protected () extends StObject {
    def this(uuid: String) = this()
    def this(uuid: Buffer) = this()
    
    var ascii: js.Any = js.native
    
    val binary: js.Any = js.native
    
    def inspect(): String = js.native
    
    val version: js.Any = js.native
  }
  /* static members */
  object UUID {
    
    @JSImport("builder-util-runtime/out/uuid", "UUID.OID")
    @js.native
    val OID: Buffer = js.native
    
    @JSImport("builder-util-runtime/out/uuid", "UUID.check")
    @js.native
    def check(uuid: String): `false` | Format | Variant = js.native
    @JSImport("builder-util-runtime/out/uuid", "UUID.check")
    @js.native
    def check(uuid: String, offset: Double): `false` | Format | Variant = js.native
    @JSImport("builder-util-runtime/out/uuid", "UUID.check")
    @js.native
    def check(uuid: Buffer): `false` | Format | Variant = js.native
    @JSImport("builder-util-runtime/out/uuid", "UUID.check")
    @js.native
    def check(uuid: Buffer, offset: Double): `false` | Format | Variant = js.native
    
    @JSImport("builder-util-runtime/out/uuid", "UUID.parse")
    @js.native
    def parse(input: String): Buffer = js.native
    
    @JSImport("builder-util-runtime/out/uuid", "UUID.v5")
    @js.native
    def v5(name: String, namespace: Buffer): js.Any = js.native
    @JSImport("builder-util-runtime/out/uuid", "UUID.v5")
    @js.native
    def v5(name: Buffer, namespace: Buffer): js.Any = js.native
  }
  
  @JSImport("builder-util-runtime/out/uuid", "nil")
  @js.native
  val nil: UUID = js.native
}
