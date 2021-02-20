package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupOutput extends StObject {
  
  /**
    * Contains the details of the backup created for the table.
    */
  var BackupDetails: js.UndefOr[typings.awsSdk.dynamodbMod.BackupDetails] = js.native
}
object CreateBackupOutput {
  
  @scala.inline
  def apply(): CreateBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupOutput]
  }
  
  @scala.inline
  implicit class CreateBackupOutputMutableBuilder[Self <: CreateBackupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
  }
}
