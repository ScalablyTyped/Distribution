package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorTypesResponse extends StObject {
  
  /**
    *  The available accelerator types. 
    */
  var acceleratorTypes: js.UndefOr[AcceleratorTypeList] = js.native
}
object DescribeAcceleratorTypesResponse {
  
  @scala.inline
  def apply(): DescribeAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorTypesResponse]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorTypesResponseMutableBuilder[Self <: DescribeAcceleratorTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypes(value: AcceleratorTypeList): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = StObject.set(x, "acceleratorTypes", js.Array(value :_*))
  }
}
