package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnGroupSchema extends StObject {
  
  /**
    * A structure containing the list of schemas for column group columns.
    */
  var ColumnGroupColumnSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnGroupColumnSchemaList] = js.undefined
  
  /**
    * The name of the column group schema.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ColumnGroupSchema {
  
  @scala.inline
  def apply(): ColumnGroupSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupSchema]
  }
  
  @scala.inline
  implicit class ColumnGroupSchemaMutableBuilder[Self <: ColumnGroupSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnGroupColumnSchemaList(value: ColumnGroupColumnSchemaList): Self = StObject.set(x, "ColumnGroupColumnSchemaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupColumnSchemaListUndefined: Self = StObject.set(x, "ColumnGroupColumnSchemaList", js.undefined)
    
    @scala.inline
    def setColumnGroupColumnSchemaListVarargs(value: ColumnGroupColumnSchema*): Self = StObject.set(x, "ColumnGroupColumnSchemaList", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
