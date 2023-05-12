package typings.consola.distConsola3fef035aMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.consola.distConsola3fef035aMod.TextOptions
  - typings.consola.distConsola3fef035aMod.ConfirmOptions
  - typings.consola.distConsola3fef035aMod.SelectOptions
  - typings.consola.distConsola3fef035aMod.MultiSelectOptions
*/
trait PromptOptions extends StObject
object PromptOptions {
  
  inline def ConfirmOptions(): typings.consola.distConsola3fef035aMod.ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("confirm")
    __obj.asInstanceOf[typings.consola.distConsola3fef035aMod.ConfirmOptions]
  }
  
  inline def MultiSelectOptions(options: js.Array[SelectOption | String]): typings.consola.distConsola3fef035aMod.MultiSelectOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("multiselect")
    __obj.asInstanceOf[typings.consola.distConsola3fef035aMod.MultiSelectOptions]
  }
  
  inline def SelectOptions(options: js.Array[SelectOption | String]): typings.consola.distConsola3fef035aMod.SelectOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("select")
    __obj.asInstanceOf[typings.consola.distConsola3fef035aMod.SelectOptions]
  }
  
  inline def TextOptions(): typings.consola.distConsola3fef035aMod.TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.consola.distConsola3fef035aMod.TextOptions]
  }
}
