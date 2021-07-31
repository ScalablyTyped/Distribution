package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliverConfigSnapshotResponse extends StObject {
  
  /**
    * The ID of the snapshot that is being created.
    */
  var configSnapshotId: js.UndefOr[String] = js.undefined
}
object DeliverConfigSnapshotResponse {
  
  @scala.inline
  def apply(): DeliverConfigSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverConfigSnapshotResponse]
  }
  
  @scala.inline
  implicit class DeliverConfigSnapshotResponseMutableBuilder[Self <: DeliverConfigSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigSnapshotId(value: String): Self = StObject.set(x, "configSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSnapshotIdUndefined: Self = StObject.set(x, "configSnapshotId", js.undefined)
  }
}
