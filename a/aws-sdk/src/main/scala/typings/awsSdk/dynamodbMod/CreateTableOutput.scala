package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableOutput extends StObject {
  
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableDescription] = js.undefined
}
object CreateTableOutput {
  
  @scala.inline
  def apply(): CreateTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableOutput]
  }
  
  @scala.inline
  implicit class CreateTableOutputMutableBuilder[Self <: CreateTableOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
