package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportClientBrandingResult extends StObject {
  
  /**
    * The branding information configured for Android devices.
    */
  var DeviceTypeAndroid: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information configured for iOS devices.
    */
  var DeviceTypeIos: js.UndefOr[IosClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information configured for Linux devices.
    */
  var DeviceTypeLinux: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information configured for macOS devices.
    */
  var DeviceTypeOsx: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information configured for web access.
    */
  var DeviceTypeWeb: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information configured for Windows devices.
    */
  var DeviceTypeWindows: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined
}
object ImportClientBrandingResult {
  
  inline def apply(): ImportClientBrandingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportClientBrandingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportClientBrandingResult] (val x: Self) extends AnyVal {
    
    inline def setDeviceTypeAndroid(value: DefaultClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeAndroid", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeAndroidUndefined: Self = StObject.set(x, "DeviceTypeAndroid", js.undefined)
    
    inline def setDeviceTypeIos(value: IosClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeIos", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeIosUndefined: Self = StObject.set(x, "DeviceTypeIos", js.undefined)
    
    inline def setDeviceTypeLinux(value: DefaultClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeLinux", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeLinuxUndefined: Self = StObject.set(x, "DeviceTypeLinux", js.undefined)
    
    inline def setDeviceTypeOsx(value: DefaultClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeOsx", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeOsxUndefined: Self = StObject.set(x, "DeviceTypeOsx", js.undefined)
    
    inline def setDeviceTypeWeb(value: DefaultClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeWeb", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeWebUndefined: Self = StObject.set(x, "DeviceTypeWeb", js.undefined)
    
    inline def setDeviceTypeWindows(value: DefaultClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeWindows", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeWindowsUndefined: Self = StObject.set(x, "DeviceTypeWindows", js.undefined)
  }
}
