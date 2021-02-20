package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExistingObjectReplication extends StObject {
  
  /**
    * 
    */
  var Status: ExistingObjectReplicationStatus = js.native
}
object ExistingObjectReplication {
  
  @scala.inline
  def apply(Status: ExistingObjectReplicationStatus): ExistingObjectReplication = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingObjectReplication]
  }
  
  @scala.inline
  implicit class ExistingObjectReplicationMutableBuilder[Self <: ExistingObjectReplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ExistingObjectReplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
