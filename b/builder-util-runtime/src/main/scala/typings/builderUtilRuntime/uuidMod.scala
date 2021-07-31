package typings.builderUtilRuntime

import typings.builderUtilRuntime.anon.Format
import typings.builderUtilRuntime.anon.Variant
import typings.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("builder-util-runtime/out/uuid", "UUID")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("builder-util-runtime/out/uuid", "UUID.OID")
    @js.native
    val OID: Buffer = js.native
    
    @scala.inline
    def check(uuid: String): `false` | Format | Variant = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[`false` | Format | Variant]
    @scala.inline
    def check(uuid: String, offset: Double): `false` | Format | Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[`false` | Format | Variant]
    @scala.inline
    def check(uuid: Buffer): `false` | Format | Variant = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[`false` | Format | Variant]
    @scala.inline
    def check(uuid: Buffer, offset: Double): `false` | Format | Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[`false` | Format | Variant]
    
    @scala.inline
    def parse(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def v5(name: String, namespace: Buffer): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def v5(name: Buffer, namespace: Buffer): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("builder-util-runtime/out/uuid", "nil")
  @js.native
  val nil: UUID = js.native
}
