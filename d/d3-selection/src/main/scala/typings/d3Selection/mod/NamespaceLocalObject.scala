package typings.d3Selection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceLocalObject extends js.Object {
  
  /**
    * Name of the local to be namespaced.
    */
  var local: String = js.native
  
  /**
    * Fully qualified namespace
    */
  var space: String = js.native
}
object NamespaceLocalObject {
  
  @scala.inline
  def apply(local: String, space: String): NamespaceLocalObject = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceLocalObject]
  }
  
  @scala.inline
  implicit class NamespaceLocalObjectOps[Self <: NamespaceLocalObject] (val x: Self) extends AnyVal {
    
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
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: String): Self = this.set("space", value.asInstanceOf[js.Any])
  }
}
