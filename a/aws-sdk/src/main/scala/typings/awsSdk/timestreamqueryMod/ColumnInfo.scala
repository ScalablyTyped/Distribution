package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnInfo extends StObject {
  
  /**
    *  The name of the result set column. The name of the result set is available for columns of all data types except for arrays. 
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    *  The data type of the result set column. The data type can be a scalar or complex. Scalar data types are integers, strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and others. 
    */
  var Type: typings.awsSdk.timestreamqueryMod.Type
}
object ColumnInfo {
  
  @scala.inline
  def apply(Type: Type): ColumnInfo = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  
  @scala.inline
  implicit class ColumnInfoMutableBuilder[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
