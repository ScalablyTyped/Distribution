package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
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
    
    @scala.inline
    def apply(): DeleteMarkerReplication = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMarkerReplication]
    }
    
    @scala.inline
    implicit class DeleteMarkerReplicationMutableBuilder[Self <: DeleteMarkerReplication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type UnmarshalledDeleteMarkerReplication = DeleteMarkerReplication
}
