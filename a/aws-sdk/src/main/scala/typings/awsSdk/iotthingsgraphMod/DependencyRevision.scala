package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyRevision extends js.Object {
  
  /**
    * The ID of the workflow or system.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The revision number of the workflow or system.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}
object DependencyRevision {
  
  @scala.inline
  def apply(): DependencyRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyRevision]
  }
  
  @scala.inline
  implicit class DependencyRevisionOps[Self <: DependencyRevision] (val x: Self) extends AnyVal {
    
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
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRevisionNumber(value: Version): Self = this.set("revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionNumber: Self = this.set("revisionNumber", js.undefined)
  }
}
