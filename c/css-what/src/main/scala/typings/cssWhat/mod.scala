package typings.cssWhat

import typings.cssWhat.parseMod.Options
import typings.cssWhat.parseMod.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-what", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parse(selector: String): js.Array[js.Array[Selector]] = js.native
  def parse(selector: String, options: Options): js.Array[js.Array[Selector]] = js.native
  
  def stringify(token: js.Array[js.Array[Selector]]): String = js.native
}
