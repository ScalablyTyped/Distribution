package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumeAttributeResult extends StObject {
  
  /**
    * The state of autoEnableIO attribute.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}
object DescribeVolumeAttributeResult {
  
  @scala.inline
  def apply(): DescribeVolumeAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeAttributeResult]
  }
  
  @scala.inline
  implicit class DescribeVolumeAttributeResultMutableBuilder[Self <: DescribeVolumeAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEnableIO(value: AttributeBooleanValue): Self = StObject.set(x, "AutoEnableIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEnableIOUndefined: Self = StObject.set(x, "AutoEnableIO", js.undefined)
    
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
