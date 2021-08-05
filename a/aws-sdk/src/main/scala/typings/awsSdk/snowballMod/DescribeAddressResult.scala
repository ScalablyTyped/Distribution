package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressResult extends StObject {
  
  /**
    * The address that you want the Snow device(s) associated with a specific job to be shipped to.
    */
  var Address: js.UndefOr[typings.awsSdk.snowballMod.Address] = js.undefined
}
object DescribeAddressResult {
  
  inline def apply(): DescribeAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressResult]
  }
  
  extension [Self <: DescribeAddressResult](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
  }
}
