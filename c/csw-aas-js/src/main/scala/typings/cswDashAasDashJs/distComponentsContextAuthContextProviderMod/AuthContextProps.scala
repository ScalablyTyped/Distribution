package typings.cswDashAasDashJs.distComponentsContextAuthContextProviderMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextProps extends js.Object {
  var children: ReactNode
  var config: AuthContextConfig
}

object AuthContextProps {
  @scala.inline
  def apply(children: ReactNode, config: AuthContextConfig): AuthContextProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], config = config)
  
    __obj.asInstanceOf[AuthContextProps]
  }
}

