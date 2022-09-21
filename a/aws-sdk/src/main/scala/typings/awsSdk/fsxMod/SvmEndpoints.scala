package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvmEndpoints extends StObject {
  
  /**
    * An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
    */
  var Iscsi: js.UndefOr[SvmEndpoint] = js.undefined
  
  /**
    * An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
    */
  var Management: js.UndefOr[SvmEndpoint] = js.undefined
  
  /**
    * An endpoint for connecting using the Network File System (NFS) protocol.
    */
  var Nfs: js.UndefOr[SvmEndpoint] = js.undefined
  
  /**
    * An endpoint for connecting using the Server Message Block (SMB) protocol.
    */
  var Smb: js.UndefOr[SvmEndpoint] = js.undefined
}
object SvmEndpoints {
  
  inline def apply(): SvmEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvmEndpoints]
  }
  
  extension [Self <: SvmEndpoints](x: Self) {
    
    inline def setIscsi(value: SvmEndpoint): Self = StObject.set(x, "Iscsi", value.asInstanceOf[js.Any])
    
    inline def setIscsiUndefined: Self = StObject.set(x, "Iscsi", js.undefined)
    
    inline def setManagement(value: SvmEndpoint): Self = StObject.set(x, "Management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "Management", js.undefined)
    
    inline def setNfs(value: SvmEndpoint): Self = StObject.set(x, "Nfs", value.asInstanceOf[js.Any])
    
    inline def setNfsUndefined: Self = StObject.set(x, "Nfs", js.undefined)
    
    inline def setSmb(value: SvmEndpoint): Self = StObject.set(x, "Smb", value.asInstanceOf[js.Any])
    
    inline def setSmbUndefined: Self = StObject.set(x, "Smb", js.undefined)
  }
}
