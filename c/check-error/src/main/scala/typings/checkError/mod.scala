package typings.checkError

import typings.checkError.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("check-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compatibleConstructor(thrown: js.Error, errorLike: ErrorInstanceOrConstructor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleConstructor")(thrown.asInstanceOf[js.Any], errorLike.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compatibleInstance(thrown: js.Error, errorLike: js.Error): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleInstance")(thrown.asInstanceOf[js.Any], errorLike.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compatibleMessage(thrown: String, errMatcher: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compatibleMessage(thrown: String, errMatcher: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compatibleMessage(thrown: js.Error, errMatcher: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compatibleMessage(thrown: js.Error, errMatcher: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getConstructorName(errorLike: ErrorInstanceOrConstructor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorName")(errorLike.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getMessage(err: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMessage(err: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ErrorInstanceOrConstructor = js.Error | Instantiable | (js.Function1[/* repeated */ Any, js.Error])
}
