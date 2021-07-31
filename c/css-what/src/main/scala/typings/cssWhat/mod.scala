package typings.cssWhat

import typings.cssWhat.parseMod.Options
import typings.cssWhat.parseMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-what", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(selector: String): js.Array[js.Array[Selector]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Selector]]]
  @scala.inline
  def parse(selector: String, options: Options): js.Array[js.Array[Selector]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Selector]]]
  
  @scala.inline
  def stringify(token: js.Array[js.Array[Selector]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any]).asInstanceOf[String]
}
