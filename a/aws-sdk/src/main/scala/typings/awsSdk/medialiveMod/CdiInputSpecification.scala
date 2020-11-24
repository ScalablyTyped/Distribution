package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CdiInputSpecification extends js.Object {
  
  /**
    * Maximum CDI input resolution
    */
  var Resolution: js.UndefOr[CdiInputResolution] = js.native
}
object CdiInputSpecification {
  
  @scala.inline
  def apply(): CdiInputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CdiInputSpecification]
  }
  
  @scala.inline
  implicit class CdiInputSpecificationOps[Self <: CdiInputSpecification] (val x: Self) extends AnyVal {
    
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
    def setResolution(value: CdiInputResolution): Self = this.set("Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("Resolution", js.undefined)
  }
}
