package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMarkerReplication extends StObject {
  
  /**
    * Indicates whether to replicate delete markers.  Indicates whether to replicate delete markers. 
    */
  var Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.native
}
object DeleteMarkerReplication {
  
  @scala.inline
  def apply(): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
  
  @scala.inline
  implicit class DeleteMarkerReplicationMutableBuilder[Self <: DeleteMarkerReplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: DeleteMarkerReplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
