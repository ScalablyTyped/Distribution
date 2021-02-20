package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SanitizationWarning extends StObject {
  
  /**
    * The name of the XML attribute that has been sanitized.
    */
  var AttributeName: js.UndefOr[string] = js.native
  
  /**
    * The name of the XML element that has been sanitized.
    */
  var ElementName: js.UndefOr[string] = js.native
  
  /**
    * Required. The reason for which the XML elements or attributes were sanitized.
    */
  var Reason: js.UndefOr[SanitizationWarningReason] = js.native
}
object SanitizationWarning {
  
  @scala.inline
  def apply(): SanitizationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SanitizationWarning]
  }
  
  @scala.inline
  implicit class SanitizationWarningMutableBuilder[Self <: SanitizationWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: string): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setElementName(value: string): Self = StObject.set(x, "ElementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementNameUndefined: Self = StObject.set(x, "ElementName", js.undefined)
    
    @scala.inline
    def setReason(value: SanitizationWarningReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
