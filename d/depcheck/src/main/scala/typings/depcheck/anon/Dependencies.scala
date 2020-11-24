package typings.depcheck.anon

import typings.depcheck.mod.PackageDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dependencies extends js.Object {
  
  var dependencies: js.UndefOr[PackageDependencies] = js.native
  
  var devDependencies: js.UndefOr[PackageDependencies] = js.native
  
  var optionalDependencies: js.UndefOr[PackageDependencies] = js.native
  
  var peerDependencies: js.UndefOr[PackageDependencies] = js.native
}
object Dependencies {
  
  @scala.inline
  def apply(): Dependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependencies]
  }
  
  @scala.inline
  implicit class DependenciesOps[Self <: Dependencies] (val x: Self) extends AnyVal {
    
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
    def setDependencies(value: PackageDependencies): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDevDependencies(value: PackageDependencies): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
    
    @scala.inline
    def setOptionalDependencies(value: PackageDependencies): Self = this.set("optionalDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalDependencies: Self = this.set("optionalDependencies", js.undefined)
    
    @scala.inline
    def setPeerDependencies(value: PackageDependencies): Self = this.set("peerDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerDependencies: Self = this.set("peerDependencies", js.undefined)
  }
}
