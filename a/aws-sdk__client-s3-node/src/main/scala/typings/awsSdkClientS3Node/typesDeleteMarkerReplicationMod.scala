package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMarkerReplicationMod {
  
  trait DeleteMarkerReplication extends StObject {
    
    /**
      * <p>The status of the delete marker replication.</p> <note> <p> In the current implementation, Amazon S3 does not replicate the delete markers. Therefore, the status must be <code>Disabled</code>. </p> </note>
      */
    var Status: js.UndefOr[Enabled | Disabled | String] = js.undefined
  }
  object DeleteMarkerReplication {
    
    inline def apply(): DeleteMarkerReplication = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMarkerReplication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteMarkerReplication] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type UnmarshalledDeleteMarkerReplication = DeleteMarkerReplication
}
