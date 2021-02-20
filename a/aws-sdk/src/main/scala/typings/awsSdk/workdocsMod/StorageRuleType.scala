package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageRuleType extends StObject {
  
  /**
    * The amount of storage allocated, in bytes.
    */
  var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.native
  
  /**
    * The type of storage.
    */
  var StorageType: js.UndefOr[typings.awsSdk.workdocsMod.StorageType] = js.native
}
object StorageRuleType {
  
  @scala.inline
  def apply(): StorageRuleType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageRuleType]
  }
  
  @scala.inline
  implicit class StorageRuleTypeMutableBuilder[Self <: StorageRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageAllocatedInBytes(value: PositiveSizeType): Self = StObject.set(x, "StorageAllocatedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAllocatedInBytesUndefined: Self = StObject.set(x, "StorageAllocatedInBytes", js.undefined)
    
    @scala.inline
    def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
