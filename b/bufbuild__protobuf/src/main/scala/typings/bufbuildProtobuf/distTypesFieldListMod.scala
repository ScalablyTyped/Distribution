package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesFieldMod.FieldInfo
import typings.bufbuildProtobuf.distTypesFieldMod.OneofInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFieldListMod {
  
  trait FieldList extends StObject {
    
    /**
      * In order of appearance in the source, list fields and
      * oneof groups.
      */
    def byMember(): js.Array[FieldInfo | OneofInfo]
    
    /**
      * Return field information ordered by field number ascending.
      */
    def byNumber(): js.Array[FieldInfo]
    
    /**
      * Find field information by proto field number.
      */
    def find(fieldNo: Double): js.UndefOr[FieldInfo]
    
    /**
      * Find field information by field name or json_name.
      */
    def findJsonName(jsonName: String): js.UndefOr[FieldInfo]
    
    /**
      * Return field information in the order they appear in the source.
      */
    def list(): js.Array[FieldInfo]
  }
  object FieldList {
    
    inline def apply(
      byMember: () => js.Array[FieldInfo | OneofInfo],
      byNumber: () => js.Array[FieldInfo],
      find: Double => js.UndefOr[FieldInfo],
      findJsonName: String => js.UndefOr[FieldInfo],
      list: () => js.Array[FieldInfo]
    ): FieldList = {
      val __obj = js.Dynamic.literal(byMember = js.Any.fromFunction0(byMember), byNumber = js.Any.fromFunction0(byNumber), find = js.Any.fromFunction1(find), findJsonName = js.Any.fromFunction1(findJsonName), list = js.Any.fromFunction0(list))
      __obj.asInstanceOf[FieldList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldList] (val x: Self) extends AnyVal {
      
      inline def setByMember(value: () => js.Array[FieldInfo | OneofInfo]): Self = StObject.set(x, "byMember", js.Any.fromFunction0(value))
      
      inline def setByNumber(value: () => js.Array[FieldInfo]): Self = StObject.set(x, "byNumber", js.Any.fromFunction0(value))
      
      inline def setFind(value: Double => js.UndefOr[FieldInfo]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindJsonName(value: String => js.UndefOr[FieldInfo]): Self = StObject.set(x, "findJsonName", js.Any.fromFunction1(value))
      
      inline def setList(value: () => js.Array[FieldInfo]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    }
  }
}
