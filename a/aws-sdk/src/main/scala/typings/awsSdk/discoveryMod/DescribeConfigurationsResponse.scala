package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationsResponse extends StObject {
  
  /**
    * A key in the response map. The value is an array of data.
    */
  var configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.native
}
object DescribeConfigurationsResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationsResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationsResponseMutableBuilder[Self <: DescribeConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurations(value: DescribeConfigurationsAttributes): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: DescribeConfigurationsAttribute*): Self = StObject.set(x, "configurations", js.Array(value :_*))
  }
}
