package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageInfo extends StObject {
  
  /**
    * 
    EBS volume information.
    
    */
  var EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.undefined
}
object StorageInfo {
  
  @scala.inline
  def apply(): StorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageInfo]
  }
  
  @scala.inline
  implicit class StorageInfoMutableBuilder[Self <: StorageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsStorageInfo(value: EBSStorageInfo): Self = StObject.set(x, "EbsStorageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsStorageInfoUndefined: Self = StObject.set(x, "EbsStorageInfo", js.undefined)
  }
}
