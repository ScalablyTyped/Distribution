package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFastSnapshotRestoresResult extends StObject {
  
  /**
    * Information about the state of fast snapshot restores.
    */
  var FastSnapshotRestores: js.UndefOr[DescribeFastSnapshotRestoreSuccessSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeFastSnapshotRestoresResult {
  
  inline def apply(): DescribeFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastSnapshotRestoresResult]
  }
  
  extension [Self <: DescribeFastSnapshotRestoresResult](x: Self) {
    
    inline def setFastSnapshotRestores(value: DescribeFastSnapshotRestoreSuccessSet): Self = StObject.set(x, "FastSnapshotRestores", value.asInstanceOf[js.Any])
    
    inline def setFastSnapshotRestoresUndefined: Self = StObject.set(x, "FastSnapshotRestores", js.undefined)
    
    inline def setFastSnapshotRestoresVarargs(value: DescribeFastSnapshotRestoreSuccessItem*): Self = StObject.set(x, "FastSnapshotRestores", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
