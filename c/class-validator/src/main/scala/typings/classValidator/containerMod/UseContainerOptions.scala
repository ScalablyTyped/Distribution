package typings.classValidator.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseContainerOptions extends js.Object {
  
  /**
    * If set to true, then default container will be used in the case if given container haven't returned anything.
    */
  var fallback: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, then default container will be used in the case if given container thrown an exception.
    */
  var fallbackOnErrors: js.UndefOr[Boolean] = js.native
}
object UseContainerOptions {
  
  @scala.inline
  def apply(): UseContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseContainerOptions]
  }
  
  @scala.inline
  implicit class UseContainerOptionsOps[Self <: UseContainerOptions] (val x: Self) extends AnyVal {
    
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
    def setFallback(value: Boolean): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setFallbackOnErrors(value: Boolean): Self = this.set("fallbackOnErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackOnErrors: Self = this.set("fallbackOnErrors", js.undefined)
  }
}
