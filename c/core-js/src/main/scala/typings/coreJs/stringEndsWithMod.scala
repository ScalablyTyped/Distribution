package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringEndsWithMod {
  
  /* was `typeof core.String.endsWith` */
  @scala.inline
  def apply(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], endPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/library/fn/string/ends-with", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
