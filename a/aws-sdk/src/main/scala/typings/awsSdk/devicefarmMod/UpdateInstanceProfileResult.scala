package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInstanceProfileResult extends StObject {
  
  /**
    * An object that contains information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
}
object UpdateInstanceProfileResult {
  
  @scala.inline
  def apply(): UpdateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceProfileResult]
  }
  
  @scala.inline
  implicit class UpdateInstanceProfileResultMutableBuilder[Self <: UpdateInstanceProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileUndefined: Self = StObject.set(x, "instanceProfile", js.undefined)
  }
}
