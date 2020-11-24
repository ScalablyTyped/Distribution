package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dependency extends js.Object {
  
  /**
    * The list of dependencies.
    */
  var dependsOn: js.UndefOr[js.Array[BasicDependency]] = js.native
  
  /**
    * The ID of the dependency.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The dependency resource name.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * The dependency resource type.
    */
  var resourceType: js.UndefOr[String] = js.native
}
object Dependency {
  
  @scala.inline
  def apply(): Dependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependency]
  }
  
  @scala.inline
  implicit class DependencyOps[Self <: Dependency] (val x: Self) extends AnyVal {
    
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
    def setDependsOnVarargs(value: BasicDependency*): Self = this.set("dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDependsOn(value: js.Array[BasicDependency]): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
