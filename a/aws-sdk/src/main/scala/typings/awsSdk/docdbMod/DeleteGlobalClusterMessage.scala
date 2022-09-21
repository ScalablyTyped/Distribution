package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalClusterMessage extends StObject {
  
  /**
    * The cluster identifier of the global cluster being deleted.
    */
  var GlobalClusterIdentifier: typings.awsSdk.docdbMod.GlobalClusterIdentifier
}
object DeleteGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier): DeleteGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalClusterMessage]
  }
  
  extension [Self <: DeleteGlobalClusterMessage](x: Self) {
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
