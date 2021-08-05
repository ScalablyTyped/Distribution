package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMarkerReplication extends StObject {
  
  /**
    * Indicates whether to replicate delete markers.  Indicates whether to replicate delete markers. 
    */
  var Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.undefined
}
object DeleteMarkerReplication {
  
  inline def apply(): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
  
  extension [Self <: DeleteMarkerReplication](x: Self) {
    
    inline def setStatus(value: DeleteMarkerReplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
