package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttp.anon.Protocol
import typings.azureCoreHttp.httpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.restErrorMod.RestError
import typings.azureCoreHttp.webResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@azure/core-http/types/latest/src/util/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyMixins(targetCtorParam: Any, sourceCtors: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMixins")(targetCtorParam.asInstanceOf[js.Any], sourceCtors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encodeUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def executePromisesSequentially(promiseFactories: js.Array[Any], kickstart: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executePromisesSequentially")(promiseFactories.asInstanceOf[js.Any], kickstart.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def generateUuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUuid")().asInstanceOf[String]
  
  inline def getEnvironmentValue(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentValue")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def isDuration(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@azure/core-http/types/latest/src/util/utils", "isNode")
  @js.native
  val isNode: Boolean = js.native
  
  inline def isObject(input: Any): /* is @azure/core-http.@azure/core-http/types/latest/src/util/utils.UnknownObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-http.@azure/core-http/types/latest/src/util/utils.UnknownObject */ Boolean]
  
  inline def isPrimitiveType(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitiveType")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidUuid(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUuid")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prepareXMLRootList(obj: Any, elementName: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareXMLRootList")(obj.asInstanceOf[js.Any], elementName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def prepareXMLRootList(obj: Any, elementName: String, xmlNamespaceKey: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareXMLRootList")(obj.asInstanceOf[js.Any], elementName.asInstanceOf[js.Any], xmlNamespaceKey.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def prepareXMLRootList(obj: Any, elementName: String, xmlNamespaceKey: String, xmlNamespace: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareXMLRootList")(obj.asInstanceOf[js.Any], elementName.asInstanceOf[js.Any], xmlNamespaceKey.asInstanceOf[js.Any], xmlNamespace.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def prepareXMLRootList(obj: Any, elementName: String, xmlNamespaceKey: Unit, xmlNamespace: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareXMLRootList")(obj.asInstanceOf[js.Any], elementName.asInstanceOf[js.Any], xmlNamespaceKey.asInstanceOf[js.Any], xmlNamespace.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def promiseToCallback(promise: js.Promise[Any]): js.Function1[/* cb */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseToCallback")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* cb */ js.Function, Unit]]
  
  inline def promiseToServiceCallback[T](promise: js.Promise[HttpOperationResponse]): js.Function1[/* cb */ ServiceCallback[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseToServiceCallback")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* cb */ ServiceCallback[T], Unit]]
  
  inline def replaceAll(value: String, searchValue: String, replaceValue: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAll")(value.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def replaceAll(value: Unit, searchValue: String, replaceValue: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAll")(value.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def stripRequest(request: WebResourceLike): WebResourceLike = ^.asInstanceOf[js.Dynamic].applyDynamic("stripRequest")(request.asInstanceOf[js.Any]).asInstanceOf[WebResourceLike]
  
  inline def stripResponse(response: HttpOperationResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stripResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def urlIsHTTPS(urlToCheck: Protocol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("urlIsHTTPS")(urlToCheck.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ServiceCallback[TResult] = js.Function4[
    /* err */ js.Error | RestError | Null, 
    /* result */ js.UndefOr[TResult], 
    /* request */ js.UndefOr[WebResourceLike], 
    /* response */ js.UndefOr[HttpOperationResponse], 
    Unit
  ]
  
  type UnknownObject = StringDictionary[Any]
}
