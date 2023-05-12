package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesFieldMod.FieldInfo
import typings.bufbuildProtobuf.distTypesFieldMod.OneofInfo
import typings.bufbuildProtobuf.distTypesFieldMod.PartialFieldInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateFieldListMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/field-list", "InternalFieldList")
  @js.native
  open class InternalFieldList protected ()
    extends StObject
       with FieldList {
    def this(fields: FieldListSource, normalizer: js.Function1[/* p */ FieldListSource, js.Array[FieldInfo]]) = this()
    
    /* private */ val _fields: Any = js.native
    
    /* private */ val _normalizer: Any = js.native
    
    /* private */ var all: Any = js.native
    
    /**
      * In order of appearance in the source, list fields and
      * oneof groups.
      */
    /* CompleteClass */
    override def byMember(): js.Array[FieldInfo | OneofInfo] = js.native
    
    /**
      * Return field information ordered by field number ascending.
      */
    /* CompleteClass */
    override def byNumber(): js.Array[FieldInfo] = js.native
    
    /**
      * Find field information by proto field number.
      */
    /* CompleteClass */
    override def find(fieldNo: Double): js.UndefOr[FieldInfo] = js.native
    
    /**
      * Find field information by field name or json_name.
      */
    /* CompleteClass */
    override def findJsonName(jsonName: String): js.UndefOr[FieldInfo] = js.native
    
    /* private */ var jsonNames: Any = js.native
    
    /**
      * Return field information in the order they appear in the source.
      */
    /* CompleteClass */
    override def list(): js.Array[FieldInfo] = js.native
    
    /* private */ var members: Any = js.native
    
    /* private */ var numbers: Any = js.native
    
    /* private */ var numbersAsc: Any = js.native
  }
  
  type FieldListSource = (js.Array[FieldInfo | PartialFieldInfo]) | (js.Function0[js.Array[FieldInfo | PartialFieldInfo]])
}
