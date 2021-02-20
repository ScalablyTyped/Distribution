package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageTestsConfiguration extends StObject {
  
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
  implicit class ImageTestsConfigurationMutableBuilder[Self <: ImageTestsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageTestsEnabled(value: NullableBoolean): Self = StObject.set(x, "imageTestsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTestsEnabledUndefined: Self = StObject.set(x, "imageTestsEnabled", js.undefined)
    
    @scala.inline
    def setTimeoutMinutes(value: ImageTestsTimeoutMinutes): Self = StObject.set(x, "timeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMinutesUndefined: Self = StObject.set(x, "timeoutMinutes", js.undefined)
  }
}
