package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfo extends StObject {
  
  /**
    *  CPU architecture type for the server. 
    */
  var cpuArchitecture: js.UndefOr[String] = js.undefined
  
  /**
    *  File system type for the server. 
    */
  var fileSystemType: js.UndefOr[String] = js.undefined
  
  /**
    *  Networking information related to a server. 
    */
  var networkInfoList: js.UndefOr[NetworkInfoList] = js.undefined
  
  /**
    *  Operating system corresponding to a server. 
    */
  var osInfo: js.UndefOr[OSInfo] = js.undefined
}
object SystemInfo {
  
  inline def apply(): SystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInfo]
  }
  
  extension [Self <: SystemInfo](x: Self) {
    
    inline def setCpuArchitecture(value: String): Self = StObject.set(x, "cpuArchitecture", value.asInstanceOf[js.Any])
    
    inline def setCpuArchitectureUndefined: Self = StObject.set(x, "cpuArchitecture", js.undefined)
    
    inline def setFileSystemType(value: String): Self = StObject.set(x, "fileSystemType", value.asInstanceOf[js.Any])
    
    inline def setFileSystemTypeUndefined: Self = StObject.set(x, "fileSystemType", js.undefined)
    
    inline def setNetworkInfoList(value: NetworkInfoList): Self = StObject.set(x, "networkInfoList", value.asInstanceOf[js.Any])
    
    inline def setNetworkInfoListUndefined: Self = StObject.set(x, "networkInfoList", js.undefined)
    
    inline def setNetworkInfoListVarargs(value: NetworkInfo*): Self = StObject.set(x, "networkInfoList", js.Array(value*))
    
    inline def setOsInfo(value: OSInfo): Self = StObject.set(x, "osInfo", value.asInstanceOf[js.Any])
    
    inline def setOsInfoUndefined: Self = StObject.set(x, "osInfo", js.undefined)
  }
}
