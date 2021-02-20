package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDhcpConfiguration extends StObject {
  
  var Key: js.UndefOr[String] = js.native
  
  var Values: js.UndefOr[ValueStringList] = js.native
}
object NewDhcpConfiguration {
  
  @scala.inline
  def apply(): NewDhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDhcpConfiguration]
  }
  
  @scala.inline
  implicit class NewDhcpConfigurationMutableBuilder[Self <: NewDhcpConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
