package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTestsConfiguration extends StObject {
  
  /**
    * Determines if tests should run after building the image. Image Builder defaults to enable tests to run following the image build, before image distribution.
    */
  var imageTestsEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The maximum time in minutes that tests are permitted to run.
    */
  var timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes] = js.undefined
}
object ImageTestsConfiguration {
  
  inline def apply(): ImageTestsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageTestsConfiguration]
  }
  
  extension [Self <: ImageTestsConfiguration](x: Self) {
    
    inline def setImageTestsEnabled(value: NullableBoolean): Self = StObject.set(x, "imageTestsEnabled", value.asInstanceOf[js.Any])
    
    inline def setImageTestsEnabledUndefined: Self = StObject.set(x, "imageTestsEnabled", js.undefined)
    
    inline def setTimeoutMinutes(value: ImageTestsTimeoutMinutes): Self = StObject.set(x, "timeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMinutesUndefined: Self = StObject.set(x, "timeoutMinutes", js.undefined)
  }
}
