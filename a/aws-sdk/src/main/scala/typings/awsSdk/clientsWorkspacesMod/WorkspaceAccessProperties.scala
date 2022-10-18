package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceAccessProperties extends StObject {
  
  /**
    * Indicates whether users can use Android and Android-compatible Chrome OS devices to access their WorkSpaces.
    */
  var DeviceTypeAndroid: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use Chromebooks to access their WorkSpaces.
    */
  var DeviceTypeChromeOs: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use iOS devices to access their WorkSpaces.
    */
  var DeviceTypeIos: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use Linux clients to access their WorkSpaces.
    */
  var DeviceTypeLinux: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use macOS clients to access their WorkSpaces.
    */
  var DeviceTypeOsx: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can access their WorkSpaces through a web browser.
    */
  var DeviceTypeWeb: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use Windows clients to access their WorkSpaces.
    */
  var DeviceTypeWindows: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use zero client devices to access their WorkSpaces.
    */
  var DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue] = js.undefined
}
object WorkspaceAccessProperties {
  
  inline def apply(): WorkspaceAccessProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceAccessProperties]
  }
  
  extension [Self <: WorkspaceAccessProperties](x: Self) {
    
    inline def setDeviceTypeAndroid(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeAndroid", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeAndroidUndefined: Self = StObject.set(x, "DeviceTypeAndroid", js.undefined)
    
    inline def setDeviceTypeChromeOs(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeChromeOs", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeChromeOsUndefined: Self = StObject.set(x, "DeviceTypeChromeOs", js.undefined)
    
    inline def setDeviceTypeIos(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeIos", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeIosUndefined: Self = StObject.set(x, "DeviceTypeIos", js.undefined)
    
    inline def setDeviceTypeLinux(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeLinux", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeLinuxUndefined: Self = StObject.set(x, "DeviceTypeLinux", js.undefined)
    
    inline def setDeviceTypeOsx(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeOsx", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeOsxUndefined: Self = StObject.set(x, "DeviceTypeOsx", js.undefined)
    
    inline def setDeviceTypeWeb(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeWeb", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeWebUndefined: Self = StObject.set(x, "DeviceTypeWeb", js.undefined)
    
    inline def setDeviceTypeWindows(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeWindows", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeWindowsUndefined: Self = StObject.set(x, "DeviceTypeWindows", js.undefined)
    
    inline def setDeviceTypeZeroClient(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeZeroClient", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeZeroClientUndefined: Self = StObject.set(x, "DeviceTypeZeroClient", js.undefined)
  }
}
