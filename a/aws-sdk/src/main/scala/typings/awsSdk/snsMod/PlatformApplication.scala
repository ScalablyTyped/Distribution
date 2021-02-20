package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformApplication extends StObject {
  
  /**
    * Attributes for platform application object.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  
  /**
    * PlatformApplicationArn for platform application object.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}
object PlatformApplication {
  
  @scala.inline
  def apply(): PlatformApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformApplication]
  }
  
  @scala.inline
  implicit class PlatformApplicationMutableBuilder[Self <: PlatformApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformApplicationArnUndefined: Self = StObject.set(x, "PlatformApplicationArn", js.undefined)
  }
}
