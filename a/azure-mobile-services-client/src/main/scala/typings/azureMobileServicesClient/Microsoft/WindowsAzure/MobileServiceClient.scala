package typings.azureMobileServicesClient.Microsoft.WindowsAzure

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// MobileServiceClient object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554219.aspx
@js.native
trait MobileServiceClient
  extends Instantiable1[/* applicationUrl */ String, MobileServiceClient]
     with Instantiable2[/* applicationUrl */ String, /* applicationKey */ String, MobileServiceClient] {
  var applicationKey: String = js.native
  var applicationUrl: String = js.native
  var currentUser: User = js.native
  var push: Push = js.native
  def getTable(tableName: String): MobileServiceTable = js.native
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
  def invokeApi(apiName: String): asyncPromise = js.native
  def invokeApi(apiName: String, options: InvokeApiOptions): asyncPromise = js.native
  def invokeApi(
    apiName: String,
    options: InvokeApiOptions,
    callback: js.Function2[/* error */ js.Any, /* results */ js.Any, Unit]
  ): asyncPromise = js.native
  def login(provider: String): asyncPromise = js.native
  def login(provider: String, callback: js.Function2[/* error */ js.Any, /* user */ User, Unit]): Unit = js.native
  def login(provider: String, token: String): asyncPromise = js.native
  //for provider:string use one of ProviderEnum: 'microsoftaccount', 'facebook', 'twitter', 'google'
  def login(provider: String, token: String, callback: js.Function2[/* error */ js.Any, /* user */ User, Unit]): Unit = js.native
  def logout(): asyncPromise = js.native
  def withFilter(
    serviceFilter: js.Function3[
      /* request */ js.Any, 
      /* next */ js.Function2[
        /* request */ js.Any, 
        /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
        Unit
      ], 
      /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
      Unit
    ]
  ): MobileServiceClient = js.native
}

