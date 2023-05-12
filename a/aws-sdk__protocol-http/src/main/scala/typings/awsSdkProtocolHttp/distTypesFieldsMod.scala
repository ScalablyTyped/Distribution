package typings.awsSdkProtocolHttp

import typings.awsSdkProtocolHttp.distTypesFieldMod.Field
import typings.awsSdkProtocolHttp.distTypesFieldPositionMod.FieldPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFieldsMod {
  
  @JSImport("@aws-sdk/protocol-http/dist-types/Fields", "Fields")
  @js.native
  open class Fields protected () extends StObject {
    def this(param0: FieldsOptions) = this()
    
    /* private */ val encoding: Any = js.native
    
    /* private */ val entries: Any = js.native
    
    /**
      * Helper function for retrieving specific types of fields.
      * Used to grab all headers or all trailers.
      *
      * @param kind {@link FieldPosition} of entries to retrieve.
      * @returns The {@link Field} entries with the specified
      *  {@link FieldPosition}.
      */
    def getByType(kind: FieldPosition): js.Array[Field] = js.native
    
    /**
      *  Retrieve {@link Field} entry by name.
      *
      * @param name The name of the {@link Field} entry
      *  to retrieve
      * @returns The {@link Field} if it exists.
      */
    def getField(name: String): js.UndefOr[Field] = js.native
    
    /**
      * Delete entry from collection.
      *
      * @param name Name of the entry to delete.
      */
    def removeField(name: String): Unit = js.native
    
    /**
      * Set entry for a {@link Field} name. The `name`
      * attribute will be used to key the collection.
      *
      * @param field The {@link Field} to set.
      */
    def setField(field: Field): Unit = js.native
  }
  
  trait FieldsOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[js.Array[Field]] = js.undefined
  }
  object FieldsOptions {
    
    inline def apply(): FieldsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldsOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
}
