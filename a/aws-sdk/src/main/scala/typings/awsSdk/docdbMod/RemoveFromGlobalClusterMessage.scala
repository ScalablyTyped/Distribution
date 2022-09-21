package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFromGlobalClusterMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) identifying the cluster that was detached from the Amazon DocumentDB global cluster. 
    */
  var DbClusterIdentifier: String
  
  /**
    * The cluster identifier to detach from the Amazon DocumentDB global cluster. 
    */
  var GlobalClusterIdentifier: typings.awsSdk.docdbMod.GlobalClusterIdentifier
}
object RemoveFromGlobalClusterMessage {
  
  inline def apply(DbClusterIdentifier: String, GlobalClusterIdentifier: GlobalClusterIdentifier): RemoveFromGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(DbClusterIdentifier = DbClusterIdentifier.asInstanceOf[js.Any], GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
  }
  
  extension [Self <: RemoveFromGlobalClusterMessage](x: Self) {
    
    inline def setDbClusterIdentifier(value: String): Self = StObject.set(x, "DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
