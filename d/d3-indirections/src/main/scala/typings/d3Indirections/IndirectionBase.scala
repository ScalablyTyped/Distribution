package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all indirections. Should not be used directly.
  *
  * Indirections are controlled by an Indirection Controller. When
  * an indirection is changed, all indirections controlled by the
  * same indirection controller will also be affected.
  */
@js.native
trait IndirectionBase extends js.Object {
  
  /** The display name of this indirection. */
  var name: String = js.native
  
  /** The type of resource the indirection controller is associated with. */
  var resourceType: ResourceType = js.native
  
  /** Unique identifier for this indirection. */
  var uid: String = js.native
}
object IndirectionBase {
  
  @scala.inline
  def apply(name: String, resourceType: ResourceType, uid: String): IndirectionBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndirectionBase]
  }
  
  @scala.inline
  implicit class IndirectionBaseOps[Self <: IndirectionBase] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
}
