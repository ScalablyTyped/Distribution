package typings.cliColor

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object artMod {
  
  @scala.inline
  def apply(text: String, styleConf: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], styleConf.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cli-color/art", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
