package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceProfileResult extends StObject {
  
  /**
    * An object that contains information about an instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
}
object GetInstanceProfileResult {
  
  @scala.inline
  def apply(): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
  
  @scala.inline
  implicit class GetInstanceProfileResultMutableBuilder[Self <: GetInstanceProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileUndefined: Self = StObject.set(x, "instanceProfile", js.undefined)
  }
}
