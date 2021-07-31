package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceAccessProperties extends StObject {
  
  /**
    * Indicates whether users can use Android devices to access their WorkSpaces.
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
    * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to trusted devices (also known as managed devices) with valid certificates, specify a value of TRUST. For more information, see Restrict WorkSpaces Access to Trusted Devices. 
    */
  var DeviceTypeOsx: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can access their WorkSpaces through a web browser.
    */
  var DeviceTypeWeb: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to trusted devices (also known as managed devices) with valid certificates, specify a value of TRUST. For more information, see Restrict WorkSpaces Access to Trusted Devices. 
    */
  var DeviceTypeWindows: js.UndefOr[AccessPropertyValue] = js.undefined
  
  /**
    * Indicates whether users can use zero client devices to access their WorkSpaces.
    */
  var DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue] = js.undefined
}
object WorkspaceAccessProperties {
  
  @scala.inline
  def apply(): WorkspaceAccessProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceAccessProperties]
  }
  
  @scala.inline
  implicit class WorkspaceAccessPropertiesMutableBuilder[Self <: WorkspaceAccessProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceTypeAndroid(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeAndroidUndefined: Self = StObject.set(x, "DeviceTypeAndroid", js.undefined)
    
    @scala.inline
    def setDeviceTypeChromeOs(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeChromeOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeChromeOsUndefined: Self = StObject.set(x, "DeviceTypeChromeOs", js.undefined)
    
    @scala.inline
    def setDeviceTypeIos(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeIos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeIosUndefined: Self = StObject.set(x, "DeviceTypeIos", js.undefined)
    
    @scala.inline
    def setDeviceTypeOsx(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeOsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeOsxUndefined: Self = StObject.set(x, "DeviceTypeOsx", js.undefined)
    
    @scala.inline
    def setDeviceTypeWeb(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeWebUndefined: Self = StObject.set(x, "DeviceTypeWeb", js.undefined)
    
    @scala.inline
    def setDeviceTypeWindows(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeWindowsUndefined: Self = StObject.set(x, "DeviceTypeWindows", js.undefined)
    
    @scala.inline
    def setDeviceTypeZeroClient(value: AccessPropertyValue): Self = StObject.set(x, "DeviceTypeZeroClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeZeroClientUndefined: Self = StObject.set(x, "DeviceTypeZeroClient", js.undefined)
  }
}
