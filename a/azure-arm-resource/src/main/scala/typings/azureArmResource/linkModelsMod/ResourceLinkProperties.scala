package typings.azureArmResource.linkModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLinkProperties extends js.Object {
  
  /**
    * Notes about the resource link.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified ID of the source resource in the link.
    */
  val sourceId: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified ID of the target resource in the link.
    */
  var targetId: String = js.native
}
object ResourceLinkProperties {
  
  @scala.inline
  def apply(targetId: String): ResourceLinkProperties = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLinkProperties]
  }
  
  @scala.inline
  implicit class ResourceLinkPropertiesOps[Self <: ResourceLinkProperties] (val x: Self) extends AnyVal {
    
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
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceId: Self = this.set("sourceId", js.undefined)
  }
}
