package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromBackupOutput extends StObject {
  
  /**
    * The description of the table created from an existing backup.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableDescription] = js.undefined
}
object RestoreTableFromBackupOutput {
  
  @scala.inline
  def apply(): RestoreTableFromBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromBackupOutput]
  }
  
  @scala.inline
  implicit class RestoreTableFromBackupOutputMutableBuilder[Self <: RestoreTableFromBackupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
