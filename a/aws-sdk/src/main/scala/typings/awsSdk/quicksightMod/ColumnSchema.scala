package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSchema extends StObject {
  
  /**
    * The data type of the column schema.
    */
  var DataType: js.UndefOr[String] = js.native
  
  /**
    * The geographic role of the column schema.
    */
  var GeographicRole: js.UndefOr[String] = js.native
  
  /**
    * The name of the column schema.
    */
  var Name: js.UndefOr[String] = js.native
}
object ColumnSchema {
  
  @scala.inline
  def apply(): ColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSchema]
  }
  
  @scala.inline
  implicit class ColumnSchemaMutableBuilder[Self <: ColumnSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    @scala.inline
    def setGeographicRole(value: String): Self = StObject.set(x, "GeographicRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeographicRoleUndefined: Self = StObject.set(x, "GeographicRole", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
