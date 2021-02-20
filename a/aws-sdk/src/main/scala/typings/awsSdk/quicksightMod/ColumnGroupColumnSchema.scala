package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupColumnSchema extends StObject {
  
  /**
    * The name of the column group's column schema.
    */
  var Name: js.UndefOr[String] = js.native
}
object ColumnGroupColumnSchema {
  
  @scala.inline
  def apply(): ColumnGroupColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupColumnSchema]
  }
  
  @scala.inline
  implicit class ColumnGroupColumnSchemaMutableBuilder[Self <: ColumnGroupColumnSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
