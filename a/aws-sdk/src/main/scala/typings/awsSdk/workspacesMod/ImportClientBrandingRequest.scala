package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportClientBrandingRequest extends StObject {
  
  /**
    * The branding information to import for Android devices.
    */
  var DeviceTypeAndroid: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information to import for iOS devices.
    */
  var DeviceTypeIos: js.UndefOr[IosImportClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information to import for Linux devices.
    */
  var DeviceTypeLinux: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information to import for macOS devices.
    */
  var DeviceTypeOsx: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information to import for web access.
    */
  var DeviceTypeWeb: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined
  
  /**
    * The branding information to import for Windows devices.
    */
  var DeviceTypeWindows: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined
  
  /**
    * The directory identifier of the WorkSpace for which you want to import client branding.
    */
  var ResourceId: DirectoryId
}
object ImportClientBrandingRequest {
  
  inline def apply(ResourceId: DirectoryId): ImportClientBrandingRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportClientBrandingRequest]
  }
  
  extension [Self <: ImportClientBrandingRequest](x: Self) {
    
    inline def setDeviceTypeAndroid(value: DefaultImportClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeAndroid", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeAndroidUndefined: Self = StObject.set(x, "DeviceTypeAndroid", js.undefined)
    
    inline def setDeviceTypeIos(value: IosImportClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeIos", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeIosUndefined: Self = StObject.set(x, "DeviceTypeIos", js.undefined)
    
    inline def setDeviceTypeLinux(value: DefaultImportClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeLinux", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeLinuxUndefined: Self = StObject.set(x, "DeviceTypeLinux", js.undefined)
    
    inline def setDeviceTypeOsx(value: DefaultImportClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeOsx", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeOsxUndefined: Self = StObject.set(x, "DeviceTypeOsx", js.undefined)
    
    inline def setDeviceTypeWeb(value: DefaultImportClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeWeb", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeWebUndefined: Self = StObject.set(x, "DeviceTypeWeb", js.undefined)
    
    inline def setDeviceTypeWindows(value: DefaultImportClientBrandingAttributes): Self = StObject.set(x, "DeviceTypeWindows", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeWindowsUndefined: Self = StObject.set(x, "DeviceTypeWindows", js.undefined)
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
