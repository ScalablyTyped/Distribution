package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceAccessDetailsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about a get instance access request.
    */
  var accessDetails: js.UndefOr[InstanceAccessDetails] = js.native
}
object GetInstanceAccessDetailsResult {
  
  @scala.inline
  def apply(): GetInstanceAccessDetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceAccessDetailsResult]
  }
  
  @scala.inline
  implicit class GetInstanceAccessDetailsResultMutableBuilder[Self <: GetInstanceAccessDetailsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDetails(value: InstanceAccessDetails): Self = StObject.set(x, "accessDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessDetailsUndefined: Self = StObject.set(x, "accessDetails", js.undefined)
  }
}
