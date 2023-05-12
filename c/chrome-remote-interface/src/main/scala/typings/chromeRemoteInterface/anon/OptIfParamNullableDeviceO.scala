package typings.chromeRemoteInterface.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chrome-remote-interface.chrome-remote-interface.OptIfParamNullable<devtools-protocol.devtools-protocol/types/protocol-proxy-api.default.DeviceOrientationApi> */
trait OptIfParamNullableDeviceO extends StObject {
  
  var clearDeviceOrientationOverride: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any
  
  var setDeviceOrientationOverride: /* import warning: importer.ImportType#apply Failed type conversion: (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>>[0] | undefined): std.ReturnType<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>> : (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> : (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> */ js.Any
}
object OptIfParamNullableDeviceO {
  
  inline def apply(
    clearDeviceOrientationOverride: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any,
    setDeviceOrientationOverride: /* import warning: importer.ImportType#apply Failed type conversion: (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>>[0] | undefined): std.ReturnType<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>> : (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> : (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> */ js.Any
  ): OptIfParamNullableDeviceO = {
    val __obj = js.Dynamic.literal(clearDeviceOrientationOverride = clearDeviceOrientationOverride.asInstanceOf[js.Any], setDeviceOrientationOverride = setDeviceOrientationOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptIfParamNullableDeviceO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptIfParamNullableDeviceO] (val x: Self) extends AnyVal {
    
    inline def setClearDeviceOrientationOverride(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any
    ): Self = StObject.set(x, "clearDeviceOrientationOverride", value.asInstanceOf[js.Any])
    
    inline def setSetDeviceOrientationOverride(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>>[0] | undefined): std.ReturnType<(params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void>> : (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> : (params : devtools-protocol.devtools-protocol.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest): std.Promise<void> */ js.Any
    ): Self = StObject.set(x, "setDeviceOrientationOverride", value.asInstanceOf[js.Any])
  }
}
