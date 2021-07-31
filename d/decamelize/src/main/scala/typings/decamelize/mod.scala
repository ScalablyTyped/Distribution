package typings.decamelize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(string: String, separator: String): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("decamelize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
