package typings.awsSdkProtocolHttp

import typings.awsSdkProtocolHttp.distTypesFieldPositionMod.FieldPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFieldMod {
  
  @JSImport("@aws-sdk/protocol-http/dist-types/Field", "Field")
  @js.native
  open class Field protected () extends StObject {
    def this(param0: FieldOptions) = this()
    
    /**
      * Appends a value to the field.
      *
      * @param value The value to append.
      */
    def add(value: String): Unit = js.native
    
    /**
      * Get string values as a list
      *
      * @returns Values in {@link Field} as a list.
      */
    def get(): js.Array[String] = js.native
    
    val kind: FieldPosition = js.native
    
    val name: String = js.native
    
    /**
      * Remove all matching entries from list.
      *
      * @param value Value to remove.
      */
    def remove(value: String): Unit = js.native
    
    /**
      * Overwrite existing field values.
      *
      * @param values The new field values.
      */
    def set(values: js.Array[String]): Unit = js.native
    
    var values: js.Array[String] = js.native
  }
  
  trait FieldOptions extends StObject {
    
    var kind: js.UndefOr[FieldPosition] = js.undefined
    
    var name: String
    
    var values: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FieldOptions {
    
    inline def apply(name: String): FieldOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldOptions] (val x: Self) extends AnyVal {
      
      inline def setKind(value: FieldPosition): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
