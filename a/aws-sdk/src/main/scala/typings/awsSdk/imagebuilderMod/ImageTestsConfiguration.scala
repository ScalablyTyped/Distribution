package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageTestsConfiguration extends js.Object {
  
  /**
    * Defines if tests should be executed when building this image.
    */
  var imageTestsEnabled: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The maximum time in minutes that tests are permitted to run.
    */
  var timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes] = js.native
}
object ImageTestsConfiguration {
  
  @scala.inline
  def apply(): ImageTestsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageTestsConfiguration]
  }
  
  @scala.inline
  implicit class ImageTestsConfigurationOps[Self <: ImageTestsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setImageTestsEnabled(value: NullableBoolean): Self = this.set("imageTestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTestsEnabled: Self = this.set("imageTestsEnabled", js.undefined)
    
    @scala.inline
    def setTimeoutMinutes(value: ImageTestsTimeoutMinutes): Self = this.set("timeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutMinutes: Self = this.set("timeoutMinutes", js.undefined)
  }
}
