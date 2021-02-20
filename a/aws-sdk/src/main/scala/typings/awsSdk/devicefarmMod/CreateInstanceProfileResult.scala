package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceProfileResult extends StObject {
  
  /**
    * An object that contains information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
}
object CreateInstanceProfileResult {
  
  @scala.inline
  def apply(): CreateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceProfileResult]
  }
  
  @scala.inline
  implicit class CreateInstanceProfileResultMutableBuilder[Self <: CreateInstanceProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileUndefined: Self = StObject.set(x, "instanceProfile", js.undefined)
  }
}
