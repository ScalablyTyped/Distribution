package typings.d3Indirections.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUid extends js.Object {
  
  /** The resource currently in use. */
  var resourceUid: String = js.native
}
object ResourceUid {
  
  @scala.inline
  def apply(resourceUid: String): ResourceUid = {
    val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceUid]
  }
  
  @scala.inline
  implicit class ResourceUidOps[Self <: ResourceUid] (val x: Self) extends AnyVal {
    
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
    def setResourceUid(value: String): Self = this.set("resourceUid", value.asInstanceOf[js.Any])
  }
}
