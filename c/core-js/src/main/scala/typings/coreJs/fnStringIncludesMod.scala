package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnStringIncludesMod {
  
  /* was `typeof core.String.includes` */
  inline def apply(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/fn/string/includes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
