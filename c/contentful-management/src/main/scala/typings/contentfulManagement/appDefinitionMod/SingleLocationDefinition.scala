package typings.contentfulManagement.appDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleLocationDefinition extends LocationDefinition {
  
  var location: AppLocation = js.native
}
object SingleLocationDefinition {
  
  @scala.inline
  def apply(location: AppLocation): SingleLocationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleLocationDefinition]
  }
  
  @scala.inline
  implicit class SingleLocationDefinitionOps[Self <: SingleLocationDefinition] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: AppLocation): Self = this.set("location", value.asInstanceOf[js.Any])
  }
}
