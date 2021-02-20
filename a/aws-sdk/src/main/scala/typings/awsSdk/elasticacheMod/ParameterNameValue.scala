package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterNameValue extends StObject {
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
}
object ParameterNameValue {
  
  @scala.inline
  def apply(): ParameterNameValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterNameValue]
  }
  
  @scala.inline
  implicit class ParameterNameValueMutableBuilder[Self <: ParameterNameValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    @scala.inline
    def setParameterValue(value: String): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
  }
}
