package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceResponse extends StObject {
  
  /**
    * The name of the instance.
    */
  var Instance: js.UndefOr[typings.awsSdk.connectMod.Instance] = js.undefined
}
object DescribeInstanceResponse {
  
  inline def apply(): DescribeInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceResponse]
  }
  
  extension [Self <: DescribeInstanceResponse](x: Self) {
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "Instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "Instance", js.undefined)
  }
}
