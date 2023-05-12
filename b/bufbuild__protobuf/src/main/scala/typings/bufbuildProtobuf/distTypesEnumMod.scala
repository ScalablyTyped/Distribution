package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnumMod {
  
  trait EnumType extends StObject {
    
    /**
      * Find an enum value by its (protobuf) name.
      */
    def findName(name: String): js.UndefOr[EnumValueInfo]
    
    /**
      * Find an enum value by its number.
      */
    def findNumber(no: Double): js.UndefOr[EnumValueInfo]
    
    /**
      * The fully qualified name of the enumeration.
      */
    val typeName: String
    
    val values: js.Array[EnumValueInfo]
  }
  object EnumType {
    
    inline def apply(
      findName: String => js.UndefOr[EnumValueInfo],
      findNumber: Double => js.UndefOr[EnumValueInfo],
      typeName: String,
      values: js.Array[EnumValueInfo]
    ): EnumType = {
      val __obj = js.Dynamic.literal(findName = js.Any.fromFunction1(findName), findNumber = js.Any.fromFunction1(findNumber), typeName = typeName.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnumType] (val x: Self) extends AnyVal {
      
      inline def setFindName(value: String => js.UndefOr[EnumValueInfo]): Self = StObject.set(x, "findName", js.Any.fromFunction1(value))
      
      inline def setFindNumber(value: Double => js.UndefOr[EnumValueInfo]): Self = StObject.set(x, "findNumber", js.Any.fromFunction1(value))
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[EnumValueInfo]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: EnumValueInfo*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait EnumValueInfo extends StObject {
    
    /**
      * The name of the enumeration value in generated code.
      */
    val localName: String
    
    /**
      * The name of the enumeration value, as specified in the protobuf source.
      */
    val name: String
    
    /**
      * The numeric enumeration value, as specified in the protobuf source.
      */
    val no: Double
  }
  object EnumValueInfo {
    
    inline def apply(localName: String, name: String, no: Double): EnumValueInfo = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumValueInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnumValueInfo] (val x: Self) extends AnyVal {
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNo(value: Double): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
    }
  }
}
