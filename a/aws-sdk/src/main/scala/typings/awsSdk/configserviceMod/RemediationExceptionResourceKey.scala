package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemediationExceptionResourceKey extends StObject {
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: js.UndefOr[StringWithCharLimit1024] = js.native
  
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}
object RemediationExceptionResourceKey {
  
  @scala.inline
  def apply(): RemediationExceptionResourceKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExceptionResourceKey]
  }
  
  @scala.inline
  implicit class RemediationExceptionResourceKeyMutableBuilder[Self <: RemediationExceptionResourceKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: StringWithCharLimit1024): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
