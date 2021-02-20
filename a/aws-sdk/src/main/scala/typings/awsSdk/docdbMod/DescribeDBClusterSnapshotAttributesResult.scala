package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBClusterSnapshotAttributesResult extends StObject {
  
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsSdk.docdbMod.DBClusterSnapshotAttributesResult] = js.native
}
object DescribeDBClusterSnapshotAttributesResult {
  
  @scala.inline
  def apply(): DescribeDBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesResult]
  }
  
  @scala.inline
  implicit class DescribeDBClusterSnapshotAttributesResultMutableBuilder[Self <: DescribeDBClusterSnapshotAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshotAttributesResult(value: DBClusterSnapshotAttributesResult): Self = StObject.set(x, "DBClusterSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributesResult", js.undefined)
  }
}
