package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreDefinitionVersion extends js.Object {
  
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[listOfCore] = js.native
}
object CoreDefinitionVersion {
  
  @scala.inline
  def apply(): CoreDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreDefinitionVersion]
  }
  
  @scala.inline
  implicit class CoreDefinitionVersionOps[Self <: CoreDefinitionVersion] (val x: Self) extends AnyVal {
    
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
    def setCoresVarargs(value: Core*): Self = this.set("Cores", js.Array(value :_*))
    
    @scala.inline
    def setCores(value: listOfCore): Self = this.set("Cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCores: Self = this.set("Cores", js.undefined)
  }
}
