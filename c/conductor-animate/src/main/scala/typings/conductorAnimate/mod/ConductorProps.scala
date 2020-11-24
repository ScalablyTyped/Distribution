package typings.conductorAnimate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConductorProps extends js.Object {
  
  var animations: Animations = js.native
  
  var children: ReactNode | ReactNodeArray = js.native
  
  var config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config]) = js.native
}
object ConductorProps {
  
  @scala.inline
  def apply(
    animations: Animations,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
  ): ConductorProps = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConductorProps]
  }
  
  @scala.inline
  implicit class ConductorPropsOps[Self <: ConductorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimations(value: Animations): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFunction2(value: (/* id */ String, /* additional */ js.Object) => Config): Self = this.set("config", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfig(
      value: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
    ): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode | ReactNodeArray): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
