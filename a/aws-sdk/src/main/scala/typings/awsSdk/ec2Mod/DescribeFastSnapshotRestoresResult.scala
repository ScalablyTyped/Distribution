package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFastSnapshotRestoresResult extends js.Object {
  
  /**
    * Information about the state of fast snapshot restores.
    */
  var FastSnapshotRestores: js.UndefOr[DescribeFastSnapshotRestoreSuccessSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeFastSnapshotRestoresResult {
  
  @scala.inline
  def apply(): DescribeFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastSnapshotRestoresResult]
  }
  
  @scala.inline
  implicit class DescribeFastSnapshotRestoresResultOps[Self <: DescribeFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFastSnapshotRestoresVarargs(value: DescribeFastSnapshotRestoreSuccessItem*): Self = this.set("FastSnapshotRestores", js.Array(value :_*))
    
    @scala.inline
    def setFastSnapshotRestores(value: DescribeFastSnapshotRestoreSuccessSet): Self = this.set("FastSnapshotRestores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastSnapshotRestores: Self = this.set("FastSnapshotRestores", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
