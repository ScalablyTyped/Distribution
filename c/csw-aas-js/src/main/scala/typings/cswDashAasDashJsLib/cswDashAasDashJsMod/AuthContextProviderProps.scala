package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextProviderProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var config: AuthConfig
}

object AuthContextProviderProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, config: AuthConfig): AuthContextProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], config = config)
  
    __obj.asInstanceOf[AuthContextProviderProps]
  }
}

