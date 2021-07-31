package typings.cssWhat

import typings.cssWhat.parseMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  @JSImport("css-what/lib/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(token: js.Array[js.Array[Selector]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(token.asInstanceOf[js.Any]).asInstanceOf[String]
}
