package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBClusterSnapshotAttributesResult extends StObject {
  
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsSdk.docdbMod.DBClusterSnapshotAttributesResult] = js.undefined
}
object DescribeDBClusterSnapshotAttributesResult {
  
  inline def apply(): DescribeDBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesResult]
  }
  
  extension [Self <: DescribeDBClusterSnapshotAttributesResult](x: Self) {
    
    inline def setDBClusterSnapshotAttributesResult(value: DBClusterSnapshotAttributesResult): Self = StObject.set(x, "DBClusterSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributesResult", js.undefined)
  }
}
