package typings.d3Indirections.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceIndex extends js.Object {
  
  /** The index of the resource list currently being used. */
  var resourceIndex: Double = js.native
  
  /** List of resources available to pick from. */
  var resourceUids: js.Array[String] = js.native
}
object ResourceIndex {
  
  @scala.inline
  def apply(resourceIndex: Double, resourceUids: js.Array[String]): ResourceIndex = {
    val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceUids = resourceUids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIndex]
  }
  
  @scala.inline
  implicit class ResourceIndexOps[Self <: ResourceIndex] (val x: Self) extends AnyVal {
    
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
    def setResourceIndex(value: Double): Self = this.set("resourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUidsVarargs(value: String*): Self = this.set("resourceUids", js.Array(value :_*))
    
    @scala.inline
    def setResourceUids(value: js.Array[String]): Self = this.set("resourceUids", value.asInstanceOf[js.Any])
  }
}
