package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceResponse extends StObject {
  
  /**
    * A complex type that contains information about a specified instance.
    */
  var Instance: js.UndefOr[typings.awsSdk.servicediscoveryMod.Instance] = js.native
}
object GetInstanceResponse {
  
  @scala.inline
  def apply(): GetInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceResponse]
  }
  
  @scala.inline
  implicit class GetInstanceResponseMutableBuilder[Self <: GetInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "Instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "Instance", js.undefined)
  }
}
