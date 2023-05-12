package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotStruct
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields
  extends StObject
     with DescWkt {
  
  var fields: DescField & FieldKind
  
  var typeName: googleDotprotobufDotStruct
}
object Fields {
  
  inline def apply(fields: DescField & FieldKind): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], typeName = "google.protobuf.Struct")
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    inline def setFields(value: DescField & FieldKind): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: googleDotprotobufDotStruct): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
