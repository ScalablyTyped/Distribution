package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerPropertiesOptions extends TimeoutIntervalOptions {
  
  var leaseId: js.UndefOr[String] = js.native
}
object GetContainerPropertiesOptions {
  
  @scala.inline
  def apply(): GetContainerPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerPropertiesOptions]
  }
  
  @scala.inline
  implicit class GetContainerPropertiesOptionsMutableBuilder[Self <: GetContainerPropertiesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaseId(value: String): Self = StObject.set(x, "leaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseIdUndefined: Self = StObject.set(x, "leaseId", js.undefined)
  }
}
