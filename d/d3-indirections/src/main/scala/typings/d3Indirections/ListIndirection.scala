package typings.d3Indirections

import typings.d3Indirections.anon.ResourceIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An indirection with a list of resources to choose from.
  */
@js.native
trait ListIndirection
  extends IndirectionBase
     with Indirection {
  
  var listIndirection: ResourceIndex = js.native
}
object ListIndirection {
  
  @scala.inline
  def apply(listIndirection: ResourceIndex, name: String, resourceType: ResourceType, uid: String): ListIndirection = {
    val __obj = js.Dynamic.literal(listIndirection = listIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndirection]
  }
  
  @scala.inline
  implicit class ListIndirectionOps[Self <: ListIndirection] (val x: Self) extends AnyVal {
    
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
    def setListIndirection(value: ResourceIndex): Self = this.set("listIndirection", value.asInstanceOf[js.Any])
  }
}
