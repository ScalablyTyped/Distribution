package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemediationParameterValue extends StObject {
  
  /**
    * The value is dynamic and changes at run-time.
    */
  var ResourceValue: js.UndefOr[typings.awsSdk.configserviceMod.ResourceValue] = js.native
  
  /**
    * The value is static and does not change at run-time.
    */
  var StaticValue: js.UndefOr[typings.awsSdk.configserviceMod.StaticValue] = js.native
}
object RemediationParameterValue {
  
  @scala.inline
  def apply(): RemediationParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationParameterValue]
  }
  
  @scala.inline
  implicit class RemediationParameterValueMutableBuilder[Self <: RemediationParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceValue(value: ResourceValue): Self = StObject.set(x, "ResourceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceValueUndefined: Self = StObject.set(x, "ResourceValue", js.undefined)
    
    @scala.inline
    def setStaticValue(value: StaticValue): Self = StObject.set(x, "StaticValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticValueUndefined: Self = StObject.set(x, "StaticValue", js.undefined)
  }
}
