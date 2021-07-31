package typings.cleanRegexp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(regexp: String): String = ^.asInstanceOf[js.Dynamic].apply(regexp.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(regexp: String, flags: String): String = (^.asInstanceOf[js.Dynamic].apply(regexp.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("clean-regexp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
