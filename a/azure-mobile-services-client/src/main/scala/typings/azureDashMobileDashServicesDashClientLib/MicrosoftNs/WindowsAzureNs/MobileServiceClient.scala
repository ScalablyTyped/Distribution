package typings
package azureDashMobileDashServicesDashClientLib.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// MobileServiceClient object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554219.aspx
@js.native
trait MobileServiceClient
  extends org.scalablytyped.runtime.Instantiable1[/* applicationUrl */ java.lang.String, MobileServiceClient]
     with org.scalablytyped.runtime.Instantiable2[
      /* applicationUrl */ java.lang.String, 
      /* applicationKey */ java.lang.String, 
      MobileServiceClient
    ] {
  var applicationKey: java.lang.String = js.native
  var applicationUrl: java.lang.String = js.native
  var currentUser: User = js.native
  var push: Push = js.native
  def getTable(tableName: java.lang.String): MobileServiceTable = js.native
  /**
           * Invokes the specified custom api and returns a response object.
           *
           * @param apiName The custom api to invoke.
           * @param options Contains additional parameter information, valid values are:
           *     body: The body of the HTTP request.
           *     method: The HTTP method to use in the request, with the default being POST,
           *     parameters: Any additional query string parameters, 
           *     headers: HTTP request headers, specified as an object.
           * @param callback Optional callback accepting (error, results) parameters.
           */
  def invokeApi(apiName: java.lang.String): asyncPromise = js.native
  /**
           * Invokes the specified custom api and returns a response object.
           *
           * @param apiName The custom api to invoke.
           * @param options Contains additional parameter information, valid values are:
           *     body: The body of the HTTP request.
           *     method: The HTTP method to use in the request, with the default being POST,
           *     parameters: Any additional query string parameters, 
           *     headers: HTTP request headers, specified as an object.
           * @param callback Optional callback accepting (error, results) parameters.
           */
  def invokeApi(apiName: java.lang.String, options: InvokeApiOptions): asyncPromise = js.native
  /**
           * Invokes the specified custom api and returns a response object.
           *
           * @param apiName The custom api to invoke.
           * @param options Contains additional parameter information, valid values are:
           *     body: The body of the HTTP request.
           *     method: The HTTP method to use in the request, with the default being POST,
           *     parameters: Any additional query string parameters, 
           *     headers: HTTP request headers, specified as an object.
           * @param callback Optional callback accepting (error, results) parameters.
           */
  def invokeApi(
    apiName: java.lang.String,
    options: InvokeApiOptions,
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, scala.Unit]
  ): asyncPromise = js.native
  def login(provider: java.lang.String): asyncPromise = js.native
  def login(
    provider: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* user */ User, scala.Unit]
  ): scala.Unit = js.native
  def login(provider: java.lang.String, token: java.lang.String): asyncPromise = js.native
  //for provider:string use one of ProviderEnum: 'microsoftaccount', 'facebook', 'twitter', 'google'
  def login(
    provider: java.lang.String,
    token: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* user */ User, scala.Unit]
  ): scala.Unit = js.native
  def logout(): asyncPromise = js.native
  def withFilter(
    serviceFilter: js.Function3[
      /* request */ js.Any, 
      /* next */ js.Function2[
        /* request */ js.Any, 
        /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit], 
        scala.Unit
      ], 
      /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): MobileServiceClient = js.native
}

