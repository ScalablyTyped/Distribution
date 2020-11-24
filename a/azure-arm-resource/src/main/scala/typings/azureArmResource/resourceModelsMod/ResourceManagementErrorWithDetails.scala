package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceManagementErrorWithDetails extends js.Object {
  
  /**
    * The error code returned when exporting the template.
    */
  val code: js.UndefOr[String] = js.native
  
  /**
    * Validation error.
    */
  val details: js.UndefOr[js.Array[ResourceManagementErrorWithDetails]] = js.native
  
  /**
    * The error message describing the export error.
    */
  val message: js.UndefOr[String] = js.native
  
  /**
    * The target of the error.
    */
  val target: js.UndefOr[String] = js.native
}
object ResourceManagementErrorWithDetails {
  
  @scala.inline
  def apply(): ResourceManagementErrorWithDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceManagementErrorWithDetails]
  }
  
  @scala.inline
  implicit class ResourceManagementErrorWithDetailsOps[Self <: ResourceManagementErrorWithDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: ResourceManagementErrorWithDetails*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[ResourceManagementErrorWithDetails]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
