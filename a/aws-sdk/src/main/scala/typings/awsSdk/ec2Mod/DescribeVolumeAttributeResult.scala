package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumeAttributeResult extends StObject {
  
  /**
    * The state of autoEnableIO attribute.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object DescribeVolumeAttributeResult {
  
  inline def apply(): DescribeVolumeAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeAttributeResult]
  }
  
  extension [Self <: DescribeVolumeAttributeResult](x: Self) {
    
    inline def setAutoEnableIO(value: AttributeBooleanValue): Self = StObject.set(x, "AutoEnableIO", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableIOUndefined: Self = StObject.set(x, "AutoEnableIO", js.undefined)
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
