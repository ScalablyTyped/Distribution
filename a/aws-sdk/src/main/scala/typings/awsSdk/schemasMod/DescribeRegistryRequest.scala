package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegistryRequest extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
}
object DescribeRegistryRequest {
  
  @scala.inline
  def apply(RegistryName: string): DescribeRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegistryRequest]
  }
  
  @scala.inline
  implicit class DescribeRegistryRequestMutableBuilder[Self <: DescribeRegistryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
  }
}
