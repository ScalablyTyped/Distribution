package typings
package cswDashAasDashJsLib.distComponentsContextAuthContextProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var config: AuthContextConfig
}

object AuthContextProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, config: AuthContextConfig): AuthContextProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], config = config)
  
    __obj.asInstanceOf[AuthContextProps]
  }
}

