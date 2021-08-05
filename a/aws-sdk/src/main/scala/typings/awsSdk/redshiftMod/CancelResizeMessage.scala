package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelResizeMessage extends StObject {
  
  /**
    * The unique identifier for the cluster that you want to cancel a resize operation for.
    */
  var ClusterIdentifier: String
}
object CancelResizeMessage {
  
  inline def apply(ClusterIdentifier: String): CancelResizeMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelResizeMessage]
  }
  
  extension [Self <: CancelResizeMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
