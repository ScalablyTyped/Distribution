package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileShareInfo extends StObject {
  
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.undefined
  
  var FileShareId: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareId] = js.undefined
  
  var FileShareStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareStatus] = js.undefined
  
  var FileShareType: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareType] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object FileShareInfo {
  
  @scala.inline
  def apply(): FileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileShareInfo]
  }
  
  @scala.inline
  implicit class FileShareInfoMutableBuilder[Self <: FileShareInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    @scala.inline
    def setFileShareId(value: FileShareId): Self = StObject.set(x, "FileShareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareIdUndefined: Self = StObject.set(x, "FileShareId", js.undefined)
    
    @scala.inline
    def setFileShareStatus(value: FileShareStatus): Self = StObject.set(x, "FileShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareStatusUndefined: Self = StObject.set(x, "FileShareStatus", js.undefined)
    
    @scala.inline
    def setFileShareType(value: FileShareType): Self = StObject.set(x, "FileShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareTypeUndefined: Self = StObject.set(x, "FileShareType", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
