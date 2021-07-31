package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableOutput extends StObject {
  
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableDescription] = js.undefined
}
object DeleteTableOutput {
  
  @scala.inline
  def apply(): DeleteTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableOutput]
  }
  
  @scala.inline
  implicit class DeleteTableOutputMutableBuilder[Self <: DeleteTableOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
