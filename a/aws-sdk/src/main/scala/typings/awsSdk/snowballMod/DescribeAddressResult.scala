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
  
  @scala.inline
  def apply(): DescribeAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressResult]
  }
  
  @scala.inline
  implicit class DescribeAddressResultMutableBuilder[Self <: DescribeAddressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
  }
}
