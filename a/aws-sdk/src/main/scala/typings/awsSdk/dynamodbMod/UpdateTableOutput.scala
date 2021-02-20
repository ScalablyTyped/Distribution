package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableOutput extends StObject {
  
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableDescription] = js.native
}
object UpdateTableOutput {
  
  @scala.inline
  def apply(): UpdateTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableOutput]
  }
  
  @scala.inline
  implicit class UpdateTableOutputMutableBuilder[Self <: UpdateTableOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
