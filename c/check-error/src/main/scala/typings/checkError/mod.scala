package typings.checkError

import typings.checkError.anon.Instantiable
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("check-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compatibleConstructor(thrown: Error, errorLike: ErrorInstanceOrConstructor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleConstructor")(thrown.asInstanceOf[js.Any], errorLike.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def compatibleInstance(thrown: Error, errorLike: Error): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleInstance")(thrown.asInstanceOf[js.Any], errorLike.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def compatibleMessage(thrown: String, errMatcher: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def compatibleMessage(thrown: String, errMatcher: RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def compatibleMessage(thrown: Error, errMatcher: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def compatibleMessage(thrown: Error, errMatcher: RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compatibleMessage")(thrown.asInstanceOf[js.Any], errMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getConstructorName(errorLike: ErrorInstanceOrConstructor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorName")(errorLike.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getMessage(err: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getMessage(err: Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ErrorInstanceOrConstructor = Error | Instantiable | (js.Function1[/* repeated */ js.Any, Error])
}
