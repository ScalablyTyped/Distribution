package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.dashdash.mod.OptionWithoutAliases
  - typings.dashdash.mod.OptionWithAliases
*/
trait Option extends js.Object
object Option {
  
  @scala.inline
  def OptionWithoutAliases(name: String, `type`: String): Option = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  def OptionWithAliases(names: js.Array[String], `type`: String): Option = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}
