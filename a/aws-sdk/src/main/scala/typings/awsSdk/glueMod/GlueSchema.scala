package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueSchema extends StObject {
  
  /**
    * Specifies the column definitions that make up a Glue schema.
    */
  var Columns: js.UndefOr[GlueStudioSchemaColumnList] = js.undefined
}
object GlueSchema {
  
  inline def apply(): GlueSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlueSchema]
  }
  
  extension [Self <: GlueSchema](x: Self) {
    
    inline def setColumns(value: GlueStudioSchemaColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    inline def setColumnsVarargs(value: GlueStudioSchemaColumn*): Self = StObject.set(x, "Columns", js.Array(value*))
  }
}
