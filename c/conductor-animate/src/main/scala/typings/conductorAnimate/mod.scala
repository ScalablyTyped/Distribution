package typings.conductorAnimate

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("conductor-animate", "Animated")
  @js.native
  class Animated protected ()
    extends PureComponent[AnimatedProps, js.Object, js.Any] {
    def this(props: AnimatedProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnimatedProps, context: js.Any) = this()
  }
  
  @JSImport("conductor-animate", "Conductor")
  @js.native
  class Conductor protected ()
    extends PureComponent[ConductorProps, js.Object, js.Any] {
    def this(props: ConductorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ConductorProps, context: js.Any) = this()
  }
  
  trait AnimatedProps extends StObject {
    
    var additional: js.UndefOr[js.Object] = js.undefined
    
    var children: js.UndefOr[ReactNode | ReactNodeArray | Null] = js.undefined
    
    var id: String
  }
  object AnimatedProps {
    
    inline def apply(id: String): AnimatedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimatedProps]
    }
    
    extension [Self <: AnimatedProps](x: Self) {
      
      inline def setAdditional(value: js.Object): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
      
      inline def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
      
      inline def setChildren(value: ReactNode | ReactNodeArray): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type Animations = StringDictionary[(ComponentClass[js.Any, ComponentState]) | FunctionComponent[js.Any]]
  
  trait ConductorProps extends StObject {
    
    var animations: Animations
    
    var children: ReactNode | ReactNodeArray
    
    var config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
  }
  object ConductorProps {
    
    inline def apply(
      animations: Animations,
      config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
    ): ConductorProps = {
      val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConductorProps]
    }
    
    extension [Self <: ConductorProps](x: Self) {
      
      inline def setAnimations(value: Animations): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode | ReactNodeArray): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setConfig(
        value: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
      ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigFunction2(value: (/* id */ String, /* additional */ js.Object) => Config): Self = StObject.set(x, "config", js.Any.fromFunction2(value))
    }
  }
  
  trait Config extends StObject {
    
    var animation: String
  }
  object Config {
    
    inline def apply(animation: String): Config = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    }
  }
}
