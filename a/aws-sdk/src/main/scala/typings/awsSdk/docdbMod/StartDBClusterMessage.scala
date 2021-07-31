package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDBClusterMessage extends StObject {
  
  /**
    * The identifier of the cluster to restart. Example: docdb-2019-05-28-15-24-52 
    */
  var DBClusterIdentifier: String
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
