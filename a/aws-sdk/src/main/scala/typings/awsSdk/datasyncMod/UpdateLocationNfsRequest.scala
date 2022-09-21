package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLocationNfsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the NFS location to update.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn
  
  var MountOptions: js.UndefOr[NfsMountOptions] = js.undefined
  
  var OnPremConfig: js.UndefOr[typings.awsSdk.datasyncMod.OnPremConfig] = js.undefined
  
  /**
    * The subdirectory in the NFS file system that is used to read data from the NFS source location or write data to the NFS destination. The NFS path should be a path that's exported by the NFS server, or a subdirectory of that path. The path should be such that it can be mounted by other NFS clients in your network. To see all the paths exported by your NFS server, run "showmount -e nfs-server-name" from an NFS client that has access to your server. You can specify any directory that appears in the results, and any subdirectory of that directory. Ensure that the NFS export is accessible without Kerberos authentication.  To transfer all the data in the folder that you specified, DataSync must have permissions to read all the data. To ensure this, either configure the NFS export with no_root_squash, or ensure that the files you want DataSync to access have permissions that allow read access for all users. Doing either option enables the agent to read the files. For the agent to access directories, you must additionally enable all execute access. If you are copying data to or from your Snowcone device, see NFS Server on Snowcone for more information. For information about NFS export configuration, see 18.7. The /etc/exports Configuration File in the Red Hat Enterprise Linux documentation.
    */
  var Subdirectory: js.UndefOr[NfsSubdirectory] = js.undefined
}
object UpdateLocationNfsRequest {
  
  inline def apply(LocationArn: LocationArn): UpdateLocationNfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLocationNfsRequest]
  }
  
  extension [Self <: UpdateLocationNfsRequest](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setMountOptions(value: NfsMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    inline def setOnPremConfig(value: OnPremConfig): Self = StObject.set(x, "OnPremConfig", value.asInstanceOf[js.Any])
    
    inline def setOnPremConfigUndefined: Self = StObject.set(x, "OnPremConfig", js.undefined)
    
    inline def setSubdirectory(value: NfsSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
  }
}
