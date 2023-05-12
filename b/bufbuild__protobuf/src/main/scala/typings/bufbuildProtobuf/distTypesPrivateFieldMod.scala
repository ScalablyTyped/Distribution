package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import typings.bufbuildProtobuf.bufbuildProtobufStrings.oneof
import typings.bufbuildProtobuf.distTypesFieldMod.FieldInfo
import typings.bufbuildProtobuf.distTypesFieldMod.OneofInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateFieldMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/field", "InternalOneofInfo")
  @js.native
  open class InternalOneofInfo protected ()
    extends StObject
       with OneofInfo {
    def this(name: String) = this()
    
    /* CompleteClass */
    override val default: Unit = js.native
    
    /* private */ var _lookup: Any = js.native
    
    def addField(field: FieldInfo): Unit = js.native
    
    /* CompleteClass */
    override val fields: js.Array[FieldInfo] = js.native
    
    /**
      * Return field information by local name.
      */
    /* CompleteClass */
    override def findField(localName: String): js.UndefOr[FieldInfo] = js.native
    
    /* CompleteClass */
    override val kind: oneof = js.native
    @JSName("kind")
    val kind_InternalOneofInfo: /* "oneof" */ String = js.native
    
    /* CompleteClass */
    override val localName: String = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    override val opt: `false` = js.native
    @JSName("opt")
    val opt_InternalOneofInfo: /* false */ Boolean = js.native
    
    /* CompleteClass */
    override val packed: `false` = js.native
    @JSName("packed")
    val packed_InternalOneofInfo: /* false */ Boolean = js.native
    
    /* CompleteClass */
    override val repeated: `false` = js.native
    @JSName("repeated")
    val repeated_InternalOneofInfo: /* false */ Boolean = js.native
  }
}
