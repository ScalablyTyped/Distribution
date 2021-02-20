package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZone extends StObject {
  
  /**
    * The name of the availability zone.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.native
}
object AvailabilityZone {
  
  @scala.inline
  def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  @scala.inline
  implicit class AvailabilityZoneMutableBuilder[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSupportedPlatforms(value: SupportedPlatformsList): Self = StObject.set(x, "SupportedPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPlatformsUndefined: Self = StObject.set(x, "SupportedPlatforms", js.undefined)
    
    @scala.inline
    def setSupportedPlatformsVarargs(value: SupportedPlatform*): Self = StObject.set(x, "SupportedPlatforms", js.Array(value :_*))
  }
}
