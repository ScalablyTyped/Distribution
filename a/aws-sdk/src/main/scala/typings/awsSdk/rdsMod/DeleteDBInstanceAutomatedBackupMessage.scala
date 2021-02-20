package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBInstanceAutomatedBackupMessage extends StObject {
  
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: String = js.native
}
object DeleteDBInstanceAutomatedBackupMessage {
  
  @scala.inline
  def apply(DbiResourceId: String): DeleteDBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal(DbiResourceId = DbiResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
  }
  
  @scala.inline
  implicit class DeleteDBInstanceAutomatedBackupMessageMutableBuilder[Self <: DeleteDBInstanceAutomatedBackupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
  }
}
