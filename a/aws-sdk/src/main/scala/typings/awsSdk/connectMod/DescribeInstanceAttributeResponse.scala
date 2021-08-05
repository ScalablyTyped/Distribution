package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceAttributeResponse extends StObject {
  
  /**
    * The type of attribute.
    */
  var Attribute: js.UndefOr[typings.awsSdk.connectMod.Attribute] = js.undefined
}
object DescribeInstanceAttributeResponse {
  
  inline def apply(): DescribeInstanceAttributeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceAttributeResponse]
  }
  
  extension [Self <: DescribeInstanceAttributeResponse](x: Self) {
    
    inline def setAttribute(value: Attribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
  }
}
