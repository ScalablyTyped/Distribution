package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteSnapshotResponse extends StObject {
  
  /**
    * The status of the snapshot.
    */
  var Status: js.UndefOr[typings.awsSdk.ebsMod.Status] = js.native
}
object CompleteSnapshotResponse {
  
  @scala.inline
  def apply(): CompleteSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteSnapshotResponse]
  }
  
  @scala.inline
  implicit class CompleteSnapshotResponseMutableBuilder[Self <: CompleteSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
