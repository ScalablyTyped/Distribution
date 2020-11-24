package typings.builderUtilRuntime

import typings.builderUtilRuntime.anon.Format
import typings.builderUtilRuntime.anon.Variant
import typings.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util-runtime/out/uuid", JSImport.Namespace)
@js.native
object uuidMod extends js.Object {
  
  val nil: UUID = js.native
  
  @js.native
  class UUID protected () extends js.Object {
    def this(uuid: String) = this()
    def this(uuid: Buffer) = this()
    
    var ascii: js.Any = js.native
    
    val binary: js.Any = js.native
    
    def inspect(): String = js.native
    
    val version: js.Any = js.native
  }
  /* static members */
  @js.native
  object UUID extends js.Object {
    
    val OID: Buffer = js.native
    
    def check(uuid: String): `false` | Format | Variant = js.native
    def check(uuid: String, offset: Double): `false` | Format | Variant = js.native
    def check(uuid: Buffer): `false` | Format | Variant = js.native
    def check(uuid: Buffer, offset: Double): `false` | Format | Variant = js.native
    
    def parse(input: String): Buffer = js.native
    
    def v5(name: String, namespace: Buffer): js.Any = js.native
    def v5(name: Buffer, namespace: Buffer): js.Any = js.native
  }
}
