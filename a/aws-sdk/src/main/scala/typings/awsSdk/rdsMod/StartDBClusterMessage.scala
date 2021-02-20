package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDBClusterMessage extends StObject {
  
  /**
    * The DB cluster identifier of the Amazon Aurora DB cluster to be started. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String = js.native
}
object StartDBClusterMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String): StartDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDBClusterMessage]
  }
  
  @scala.inline
  implicit class StartDBClusterMessageMutableBuilder[Self <: StartDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
