package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableToPointInTimeOutput extends StObject {
  
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableDescription] = js.undefined
}
object RestoreTableToPointInTimeOutput {
  
  inline def apply(): RestoreTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
  }
  
  extension [Self <: RestoreTableToPointInTimeOutput](x: Self) {
    
    inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
