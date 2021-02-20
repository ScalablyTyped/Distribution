package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopySnapshotResult extends StObject {
  
  /**
    * The ID of the new snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  
  /**
    * Any tags applied to the new snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CopySnapshotResult {
  
  @scala.inline
  def apply(): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySnapshotResult]
  }
  
  @scala.inline
  implicit class CopySnapshotResultMutableBuilder[Self <: CopySnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
