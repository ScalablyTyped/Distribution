package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageTypeLimit extends StObject {
  
  /**
    *  Name of storage limits that are applicable for given storage type. If  StorageType  is ebs, following storage options are applicable  MinimumVolumeSize Minimum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumVolumeSize Maximum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumIops Maximum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable. MinimumIops Minimum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.esMod.LimitName] = js.undefined
  
  /**
    *  Values for the  StorageTypeLimit$LimitName  . 
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.undefined
}
object StorageTypeLimit {
  
  @scala.inline
  def apply(): StorageTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageTypeLimit]
  }
  
  @scala.inline
  implicit class StorageTypeLimitMutableBuilder[Self <: StorageTypeLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimitName(value: LimitName): Self = StObject.set(x, "LimitName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitNameUndefined: Self = StObject.set(x, "LimitName", js.undefined)
    
    @scala.inline
    def setLimitValues(value: LimitValueList): Self = StObject.set(x, "LimitValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitValuesUndefined: Self = StObject.set(x, "LimitValues", js.undefined)
    
    @scala.inline
    def setLimitValuesVarargs(value: LimitValue*): Self = StObject.set(x, "LimitValues", js.Array(value :_*))
  }
}
