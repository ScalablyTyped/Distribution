package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
  
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsSdk.neptuneMod.DBClusterSnapshotAttributesResult] = js.native
}
object ModifyDBClusterSnapshotAttributeResult {
  
  @scala.inline
  def apply(): ModifyDBClusterSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
  }
  
  @scala.inline
  implicit class ModifyDBClusterSnapshotAttributeResultOps[Self <: ModifyDBClusterSnapshotAttributeResult] (val x: Self) extends AnyVal {
    
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
    def setDBClusterSnapshotAttributesResult(value: DBClusterSnapshotAttributesResult): Self = this.set("DBClusterSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterSnapshotAttributesResult: Self = this.set("DBClusterSnapshotAttributesResult", js.undefined)
  }
}
