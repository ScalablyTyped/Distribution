package typings.chromeRemoteInterface.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chrome-remote-interface.chrome-remote-interface.OptIfParamNullable<devtools-protocol.devtools-protocol/types/protocol-proxy-api.default.SchemaApi> */
trait OptIfParamNullableSchemaA extends StObject {
  
  var getDomains: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>>[0]> extends true ? (params : std.Parameters<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>>[0] | undefined): std.ReturnType<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>> : (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> : (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> */ js.Any
}
object OptIfParamNullableSchemaA {
  
  inline def apply(
    getDomains: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>>[0]> extends true ? (params : std.Parameters<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>>[0] | undefined): std.ReturnType<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>> : (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> : (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> */ js.Any
  ): OptIfParamNullableSchemaA = {
    val __obj = js.Dynamic.literal(getDomains = getDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptIfParamNullableSchemaA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptIfParamNullableSchemaA] (val x: Self) extends AnyVal {
    
    inline def setGetDomains(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> extends (params : any): any ? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>>[0]> extends true ? (params : std.Parameters<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>>[0] | undefined): std.ReturnType<(): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse>> : (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> : (): std.Promise<devtools-protocol.devtools-protocol.Protocol.Schema.GetDomainsResponse> */ js.Any
    ): Self = StObject.set(x, "getDomains", value.asInstanceOf[js.Any])
  }
}
