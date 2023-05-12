package typings.chartJs

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotanimationsMod {
  
  @JSImport("chart.js/dist/core/core.animations", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Animations {
    def this(chart: Any, config: Any) = this()
    
    /**
      * Utility to handle animation of `options`.
      * @private
      */
    /* private */ /* CompleteClass */
    var _animateOptions: Any = js.native
    
    /* CompleteClass */
    var _chart: Any = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    var _createAnimations: Any = js.native
    
    /* CompleteClass */
    var _properties: Map[Any, Any] = js.native
    
    /* CompleteClass */
    override def configure(config: Any): Unit = js.native
    
    /**
      * Update `target` properties to new values, using configured animations
      * @param {object} target - object to update
      * @param {object} values - new target properties
      * @returns {boolean|undefined} - `true` if animations were started
      **/
    /* CompleteClass */
    override def update(target: js.Object, values: js.Object): js.UndefOr[Boolean] = js.native
  }
  
  trait Animations extends StObject {
    
    /**
      * Utility to handle animation of `options`.
      * @private
      */
    /* private */ var _animateOptions: Any
    
    var _chart: Any
    
    /**
      * @private
      */
    /* private */ var _createAnimations: Any
    
    var _properties: Map[Any, Any]
    
    def configure(config: Any): Unit
    
    /**
      * Update `target` properties to new values, using configured animations
      * @param {object} target - object to update
      * @param {object} values - new target properties
      * @returns {boolean|undefined} - `true` if animations were started
      **/
    def update(target: js.Object, values: js.Object): js.UndefOr[Boolean]
  }
  object Animations {
    
    inline def apply(
      _animateOptions: Any,
      _chart: Any,
      _createAnimations: Any,
      _properties: Map[Any, Any],
      configure: Any => Unit,
      update: (js.Object, js.Object) => js.UndefOr[Boolean]
    ): Animations = {
      val __obj = js.Dynamic.literal(_animateOptions = _animateOptions.asInstanceOf[js.Any], _chart = _chart.asInstanceOf[js.Any], _createAnimations = _createAnimations.asInstanceOf[js.Any], _properties = _properties.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Animations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animations] (val x: Self) extends AnyVal {
      
      inline def setConfigure(value: Any => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (js.Object, js.Object) => js.UndefOr[Boolean]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def set_animateOptions(value: Any): Self = StObject.set(x, "_animateOptions", value.asInstanceOf[js.Any])
      
      inline def set_chart(value: Any): Self = StObject.set(x, "_chart", value.asInstanceOf[js.Any])
      
      inline def set_createAnimations(value: Any): Self = StObject.set(x, "_createAnimations", value.asInstanceOf[js.Any])
      
      inline def set_properties(value: Map[Any, Any]): Self = StObject.set(x, "_properties", value.asInstanceOf[js.Any])
    }
  }
}
