package typings.conductorDashAnimate.conductorDashAnimateMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConductorProps extends js.Object {
  var animations: Animations
  var children: ReactNode | ReactNodeArray
  var config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
}

object ConductorProps {
  @scala.inline
  def apply(
    animations: Animations,
    children: ReactNode | ReactNodeArray,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
  ): ConductorProps = {
    val __obj = js.Dynamic.literal(animations = animations, children = children.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConductorProps]
  }
}

