package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBSnapshotAttributesResult extends js.Object {
  
  /**
    * The list of attributes and values for the manual DB snapshot.
    */
  var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.native
  
  /**
    * The identifier of the manual DB snapshot that the attributes apply to.
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.native
}
object DBSnapshotAttributesResult {
  
  @scala.inline
  def apply(): DBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSnapshotAttributesResult]
  }
  
  @scala.inline
  implicit class DBSnapshotAttributesResultOps[Self <: DBSnapshotAttributesResult] (val x: Self) extends AnyVal {
    
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
    def setDBSnapshotAttributesVarargs(value: DBSnapshotAttribute*): Self = this.set("DBSnapshotAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDBSnapshotAttributes(value: DBSnapshotAttributeList): Self = this.set("DBSnapshotAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSnapshotAttributes: Self = this.set("DBSnapshotAttributes", js.undefined)
    
    @scala.inline
    def setDBSnapshotIdentifier(value: String): Self = this.set("DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSnapshotIdentifier: Self = this.set("DBSnapshotIdentifier", js.undefined)
  }
}
