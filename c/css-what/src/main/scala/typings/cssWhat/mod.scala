package typings.cssWhat

import typings.cssWhat.parseMod.Options
import typings.cssWhat.parseMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-what", "parse")
  @js.native
  def parse(selector: String): js.Array[js.Array[Selector]] = js.native
  @JSImport("css-what", "parse")
  @js.native
  def parse(selector: String, options: Options): js.Array[js.Array[Selector]] = js.native
  
  @JSImport("css-what", "stringify")
  @js.native
  def stringify(token: js.Array[js.Array[Selector]]): String = js.native
}
