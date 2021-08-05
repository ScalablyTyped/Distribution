package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidStorageOptions extends StObject {
  
  /**
    * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that provisioned IOPS can be between 3 and 10 times storage. 
    */
  var IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined
  
  /**
    * The valid range of provisioned IOPS. For example, 1000-20000. 
    */
  var ProvisionedIops: js.UndefOr[RangeList] = js.undefined
  
  /**
    * The valid range of storage in gibibytes. For example, 100 to 16384. 
    */
  var StorageSize: js.UndefOr[RangeList] = js.undefined
  
  /**
    * The valid storage types for your DB instance. For example, gp2, io1. 
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance class.
    */
  var SupportsStorageAutoscaling: js.UndefOr[Boolean] = js.undefined
}
object ValidStorageOptions {
  
  inline def apply(): ValidStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidStorageOptions]
  }
  
  extension [Self <: ValidStorageOptions](x: Self) {
    
    inline def setIopsToStorageRatio(value: DoubleRangeList): Self = StObject.set(x, "IopsToStorageRatio", value.asInstanceOf[js.Any])
    
    inline def setIopsToStorageRatioUndefined: Self = StObject.set(x, "IopsToStorageRatio", js.undefined)
    
    inline def setIopsToStorageRatioVarargs(value: DoubleRange*): Self = StObject.set(x, "IopsToStorageRatio", js.Array(value :_*))
    
    inline def setProvisionedIops(value: RangeList): Self = StObject.set(x, "ProvisionedIops", value.asInstanceOf[js.Any])
    
    inline def setProvisionedIopsUndefined: Self = StObject.set(x, "ProvisionedIops", js.undefined)
    
    inline def setProvisionedIopsVarargs(value: Range*): Self = StObject.set(x, "ProvisionedIops", js.Array(value :_*))
    
    inline def setStorageSize(value: RangeList): Self = StObject.set(x, "StorageSize", value.asInstanceOf[js.Any])
    
    inline def setStorageSizeUndefined: Self = StObject.set(x, "StorageSize", js.undefined)
    
    inline def setStorageSizeVarargs(value: Range*): Self = StObject.set(x, "StorageSize", js.Array(value :_*))
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSupportsStorageAutoscaling(value: Boolean): Self = StObject.set(x, "SupportsStorageAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setSupportsStorageAutoscalingUndefined: Self = StObject.set(x, "SupportsStorageAutoscaling", js.undefined)
  }
}
