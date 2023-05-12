package typings.chromeRemoteInterface.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chrome-remote-interface.chrome-remote-interface.OptIfParamNullable<devtools-protocol.devtools-protocol/types/protocol-proxy-api.default.InspectorApi> */
trait OptIfParamNullableInspect extends StObject {
  
  var disable: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any
  
  var enable: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any
  
  var on: /* import warning: importer.ImportType#apply Failed type conversion: (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void>[0]> extends true ? (params : std.Parameters<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void>[0] | undefined): std.ReturnType<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void> : (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void : (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void */ js.Any
}
object OptIfParamNullableInspect {
  
  inline def apply(
    disable: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any,
    enable: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any,
    on: /* import warning: importer.ImportType#apply Failed type conversion: (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void>[0]> extends true ? (params : std.Parameters<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void>[0] | undefined): std.ReturnType<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void> : (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void : (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void */ js.Any
  ): OptIfParamNullableInspect = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptIfParamNullableInspect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptIfParamNullableInspect] (val x: Self) extends AnyVal {
    
    inline def setDisable(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any
    ): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setEnable(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<void> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<void>>[0]> extends true ? (params : std.Parameters<(): std.Promise<void>>[0] | undefined): std.ReturnType<(): std.Promise<void>> : (): std.Promise<void> : (): std.Promise<void> */ js.Any
    ): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setOn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void>[0]> extends true ? (params : std.Parameters<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void>[0] | undefined): std.ReturnType<(event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void> : (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void : (event : 'detached', listener : (params : devtools-protocol.devtools-protocol.Protocol.Inspector.DetachedEvent): void): void */ js.Any
    ): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
