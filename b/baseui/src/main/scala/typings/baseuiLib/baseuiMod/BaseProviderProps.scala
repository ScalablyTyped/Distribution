package typings
package baseuiLib.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var theme: baseuiLib.Theme
}

object BaseProviderProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, theme: baseuiLib.Theme): BaseProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], theme = theme)
  
    __obj.asInstanceOf[BaseProviderProps]
  }
}

