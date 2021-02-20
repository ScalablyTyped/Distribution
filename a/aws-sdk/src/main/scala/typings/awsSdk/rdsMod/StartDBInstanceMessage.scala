package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDBInstanceMessage extends StObject {
  
  /**
    *  The user-supplied instance identifier. 
    */
  var DBInstanceIdentifier: String = js.native
}
object StartDBInstanceMessage {
  
  @scala.inline
  def apply(DBInstanceIdentifier: String): StartDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDBInstanceMessage]
  }
  
  @scala.inline
  implicit class StartDBInstanceMessageMutableBuilder[Self <: StartDBInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
  }
}
