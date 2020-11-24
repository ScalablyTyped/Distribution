package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageType extends js.Object {
  
  var StorageSubTypeName: js.UndefOr[typings.awsSdk.esMod.StorageSubTypeName] = js.native
  
  /**
    * List of limits that are applicable for given storage type. 
    */
  var StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.native
  
  var StorageTypeName: js.UndefOr[typings.awsSdk.esMod.StorageTypeName] = js.native
}
object StorageType {
  
  @scala.inline
  def apply(): StorageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageType]
  }
  
  @scala.inline
  implicit class StorageTypeOps[Self <: StorageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStorageSubTypeName(value: StorageSubTypeName): Self = this.set("StorageSubTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageSubTypeName: Self = this.set("StorageSubTypeName", js.undefined)
    
    @scala.inline
    def setStorageTypeLimitsVarargs(value: StorageTypeLimit*): Self = this.set("StorageTypeLimits", js.Array(value :_*))
    
    @scala.inline
    def setStorageTypeLimits(value: StorageTypeLimitList): Self = this.set("StorageTypeLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageTypeLimits: Self = this.set("StorageTypeLimits", js.undefined)
    
    @scala.inline
    def setStorageTypeName(value: StorageTypeName): Self = this.set("StorageTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageTypeName: Self = this.set("StorageTypeName", js.undefined)
  }
}
