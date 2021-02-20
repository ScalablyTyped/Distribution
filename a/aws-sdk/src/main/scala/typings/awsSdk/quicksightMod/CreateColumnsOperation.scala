package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateColumnsOperation extends StObject {
  
  /**
    * Calculated columns to create.
    */
  var Columns: CalculatedColumnList = js.native
}
object CreateColumnsOperation {
  
  @scala.inline
  def apply(Columns: CalculatedColumnList): CreateColumnsOperation = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateColumnsOperation]
  }
  
  @scala.inline
  implicit class CreateColumnsOperationMutableBuilder[Self <: CreateColumnsOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: CalculatedColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: CalculatedColumn*): Self = StObject.set(x, "Columns", js.Array(value :_*))
  }
}
