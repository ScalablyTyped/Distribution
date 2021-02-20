package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableToPointInTimeOutput extends StObject {
  
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableDescription] = js.native
}
object RestoreTableToPointInTimeOutput {
  
  @scala.inline
  def apply(): RestoreTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
  }
  
  @scala.inline
  implicit class RestoreTableToPointInTimeOutputMutableBuilder[Self <: RestoreTableToPointInTimeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
