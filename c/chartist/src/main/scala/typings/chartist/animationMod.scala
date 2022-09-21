package typings.chartist

import typings.chartist.eventMod.EventEmitter
import typings.chartist.svgSvgMod.Svg
import typings.chartist.svgTypesMod.AnimationDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  @JSImport("chartist/dist/svg/animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAnimation(element: Svg, attribute: String, animationDefinition: AnimationDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], animationDefinition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAnimation(element: Svg, attribute: String, animationDefinition: AnimationDefinition, createGuided: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], animationDefinition.asInstanceOf[js.Any], createGuided.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAnimation(
    element: Svg,
    attribute: String,
    animationDefinition: AnimationDefinition,
    createGuided: Boolean,
    eventEmitter: EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], animationDefinition.asInstanceOf[js.Any], createGuided.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAnimation(
    element: Svg,
    attribute: String,
    animationDefinition: AnimationDefinition,
    createGuided: Unit,
    eventEmitter: EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], animationDefinition.asInstanceOf[js.Any], createGuided.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object easings {
    
    @JSImport("chartist/dist/svg/animation", "easings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInBack")
    @js.native
    def easeInBack: js.Array[Double] = js.native
    inline def easeInBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInCirc")
    @js.native
    def easeInCirc: js.Array[Double] = js.native
    inline def easeInCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInCubic")
    @js.native
    def easeInCubic: js.Array[Double] = js.native
    inline def easeInCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInExpo")
    @js.native
    def easeInExpo: js.Array[Double] = js.native
    inline def easeInExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutBack")
    @js.native
    def easeInOutBack: js.Array[Double] = js.native
    inline def easeInOutBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutCirc")
    @js.native
    def easeInOutCirc: js.Array[Double] = js.native
    inline def easeInOutCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutCubic")
    @js.native
    def easeInOutCubic: js.Array[Double] = js.native
    inline def easeInOutCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutExpo")
    @js.native
    def easeInOutExpo: js.Array[Double] = js.native
    inline def easeInOutExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutQuad")
    @js.native
    def easeInOutQuad: js.Array[Double] = js.native
    inline def easeInOutQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutQuart")
    @js.native
    def easeInOutQuart: js.Array[Double] = js.native
    inline def easeInOutQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutQuint")
    @js.native
    def easeInOutQuint: js.Array[Double] = js.native
    inline def easeInOutQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInOutSine")
    @js.native
    def easeInOutSine: js.Array[Double] = js.native
    inline def easeInOutSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInQuad")
    @js.native
    def easeInQuad: js.Array[Double] = js.native
    inline def easeInQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInQuart")
    @js.native
    def easeInQuart: js.Array[Double] = js.native
    inline def easeInQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInQuint")
    @js.native
    def easeInQuint: js.Array[Double] = js.native
    inline def easeInQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeInSine")
    @js.native
    def easeInSine: js.Array[Double] = js.native
    inline def easeInSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutBack")
    @js.native
    def easeOutBack: js.Array[Double] = js.native
    inline def easeOutBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutCirc")
    @js.native
    def easeOutCirc: js.Array[Double] = js.native
    inline def easeOutCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutCubic")
    @js.native
    def easeOutCubic: js.Array[Double] = js.native
    inline def easeOutCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutExpo")
    @js.native
    def easeOutExpo: js.Array[Double] = js.native
    inline def easeOutExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutQuad")
    @js.native
    def easeOutQuad: js.Array[Double] = js.native
    inline def easeOutQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutQuart")
    @js.native
    def easeOutQuart: js.Array[Double] = js.native
    inline def easeOutQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutQuint")
    @js.native
    def easeOutQuint: js.Array[Double] = js.native
    inline def easeOutQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg/animation", "easings.easeOutSine")
    @js.native
    def easeOutSine: js.Array[Double] = js.native
    inline def easeOutSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutSine")(x.asInstanceOf[js.Any])
  }
}
