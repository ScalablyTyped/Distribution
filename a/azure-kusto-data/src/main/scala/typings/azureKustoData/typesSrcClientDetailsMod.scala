package typings.azureKustoData

import typings.azureKustoData.anon.PartialKustoHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcClientDetailsMod {
  
  @JSImport("azure-kusto-data/types/src/clientDetails", "ClientDetails")
  @js.native
  open class ClientDetails () extends StObject {
    def this(applicationNameForTracing: String) = this()
    def this(applicationNameForTracing: String, userNameForTracing: String) = this()
    def this(applicationNameForTracing: Null, userNameForTracing: String) = this()
    
    var applicationNameForTracing: String | Null = js.native
    
    def getHeaders(): PartialKustoHeaders = js.native
    
    var userNameForTracing: String | Null = js.native
    
    val versionForTracing: String = js.native
  }
  /* static members */
  object ClientDetails {
    
    @JSImport("azure-kusto-data/types/src/clientDetails", "ClientDetails")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultApplication(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultApplication")().asInstanceOf[String]
    
    inline def defaultUser(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUser")().asInstanceOf[String]
    
    inline def defaultVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultVersion")().asInstanceOf[String]
    
    inline def escapeHeader(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHeader")(header.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def formatHeader(args: js.Array[js.Tuple2[String, String]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHeader")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def setConnectorDetails(
      name: String,
      version: String,
      app_name: js.UndefOr[String | Null],
      app_version: js.UndefOr[String | Null],
      send_user: js.UndefOr[Boolean],
      override_user: js.UndefOr[String | Null],
      additional_fields: js.UndefOr[(js.Array[js.Tuple2[String, String]]) | Null]
    ): ClientDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("setConnectorDetails")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], app_name.asInstanceOf[js.Any], app_version.asInstanceOf[js.Any], send_user.asInstanceOf[js.Any], override_user.asInstanceOf[js.Any], additional_fields.asInstanceOf[js.Any])).asInstanceOf[ClientDetails]
  }
  
  trait KustoHeaders extends StObject {
    
    var `x-ms-app`: String | Null
    
    var `x-ms-client-request-id`: String | Null
    
    var `x-ms-client-version`: String | Null
    
    var `x-ms-user`: String | Null
  }
  object KustoHeaders {
    
    inline def apply(): KustoHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("x-ms-app")(null)
      __obj.updateDynamic("x-ms-client-request-id")(null)
      __obj.updateDynamic("x-ms-client-version")(null)
      __obj.updateDynamic("x-ms-user")(null)
      __obj.asInstanceOf[KustoHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KustoHeaders] (val x: Self) extends AnyVal {
      
      inline def `setX-ms-app`(value: String): Self = StObject.set(x, "x-ms-app", value.asInstanceOf[js.Any])
      
      inline def `setX-ms-appNull`: Self = StObject.set(x, "x-ms-app", null)
      
      inline def `setX-ms-client-request-id`(value: String): Self = StObject.set(x, "x-ms-client-request-id", value.asInstanceOf[js.Any])
      
      inline def `setX-ms-client-request-idNull`: Self = StObject.set(x, "x-ms-client-request-id", null)
      
      inline def `setX-ms-client-version`(value: String): Self = StObject.set(x, "x-ms-client-version", value.asInstanceOf[js.Any])
      
      inline def `setX-ms-client-versionNull`: Self = StObject.set(x, "x-ms-client-version", null)
      
      inline def `setX-ms-user`(value: String): Self = StObject.set(x, "x-ms-user", value.asInstanceOf[js.Any])
      
      inline def `setX-ms-userNull`: Self = StObject.set(x, "x-ms-user", null)
    }
  }
}
