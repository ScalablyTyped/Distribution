package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSnapshotsResult extends StObject {
  
  /**
    * If not null, more results are available. Pass this value in the NextToken member of a subsequent call to DescribeSnapshots.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  
  /**
    * The list of Snapshot objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var Snapshots: js.UndefOr[typings.awsSdk.directoryserviceMod.Snapshots] = js.native
}
object DescribeSnapshotsResult {
  
  @scala.inline
  def apply(): DescribeSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsResult]
  }
  
  @scala.inline
  implicit class DescribeSnapshotsResultMutableBuilder[Self <: DescribeSnapshotsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSnapshots(value: Snapshots): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "Snapshots", js.Array(value :_*))
  }
}
