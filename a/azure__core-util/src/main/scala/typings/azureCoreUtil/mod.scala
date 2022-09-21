package typings.azureCoreUtil

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreUtil.azureCoreUtilStrings.base64
import typings.azureCoreUtil.azureCoreUtilStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeSha256Hash(content: String, encoding: base64 | hex): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSha256Hash")(content.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def computeSha256Hmac(key: String, stringToSign: String, encoding: base64 | hex): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSha256Hmac")(key.asInstanceOf[js.Any], stringToSign.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def delay(timeInMs: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(timeInMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getErrorMessage(e: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessage")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRandomIntegerInclusive(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRandomIntegerInclusive")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](thing: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isError(e: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  @JSImport("@azure/core-util", "isNode")
  @js.native
  val isNode: Boolean = js.native
  
  inline def isObject(input: Any): /* is @azure/core-util.@azure/core-util.UnknownObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-util.@azure/core-util.UnknownObject */ Boolean]
  
  inline def isObjectWithProperties[Thing, PropertyName /* <: String */](thing: Thing, properties: js.Array[PropertyName]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectWithProperties")(thing.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def objectHasProperty[Thing, PropertyName /* <: String */](thing: Thing, property: PropertyName): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objectHasProperty")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type UnknownObject = StringDictionary[Any]
}
