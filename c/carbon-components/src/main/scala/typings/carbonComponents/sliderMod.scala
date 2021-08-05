package typings.carbonComponents

import typings.carbonComponents.anon.Max
import typings.carbonComponents.anon.NewValue
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("carbon-components/components/slider/slider", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Slider {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _calcValue(evt: js.Any): NewValue = js.native
    
    /* CompleteClass */
    override def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _updateInput(): Unit = js.native
    
    /* CompleteClass */
    override def _updatePosition(evt: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getInputProps(): Max = js.native
    
    /* CompleteClass */
    override def setValue(value: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def stepDown(): Unit = js.native
    
    /* CompleteClass */
    override def stepUp(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/slider/slider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/slider/slider", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Slider extends StObject {
    
    def _calcValue(evt: js.Any): NewValue
    
    def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit
    
    def _updateInput(): Unit
    
    def _updatePosition(evt: js.Any): Unit
    
    def getInputProps(): Max
    
    def setValue(value: js.Any): Unit
    
    def stepDown(): Unit
    
    def stepUp(): Unit
  }
  object Slider {
    
    inline def apply(
      _calcValue: js.Any => NewValue,
      _changeState: (js.Any, js.Any, js.Any) => Unit,
      _updateInput: () => Unit,
      _updatePosition: js.Any => Unit,
      getInputProps: () => Max,
      setValue: js.Any => Unit,
      stepDown: () => Unit,
      stepUp: () => Unit
    ): Slider = {
      val __obj = js.Dynamic.literal(_calcValue = js.Any.fromFunction1(_calcValue), _changeState = js.Any.fromFunction3(_changeState), _updateInput = js.Any.fromFunction0(_updateInput), _updatePosition = js.Any.fromFunction1(_updatePosition), getInputProps = js.Any.fromFunction0(getInputProps), setValue = js.Any.fromFunction1(setValue), stepDown = js.Any.fromFunction0(stepDown), stepUp = js.Any.fromFunction0(stepUp))
      __obj.asInstanceOf[Slider]
    }
    
    extension [Self <: Slider](x: Self) {
      
      inline def setGetInputProps(value: () => Max): Self = StObject.set(x, "getInputProps", js.Any.fromFunction0(value))
      
      inline def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      inline def setStepDown(value: () => Unit): Self = StObject.set(x, "stepDown", js.Any.fromFunction0(value))
      
      inline def setStepUp(value: () => Unit): Self = StObject.set(x, "stepUp", js.Any.fromFunction0(value))
      
      inline def set_calcValue(value: js.Any => NewValue): Self = StObject.set(x, "_calcValue", js.Any.fromFunction1(value))
      
      inline def set_changeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction3(value))
      
      inline def set_updateInput(value: () => Unit): Self = StObject.set(x, "_updateInput", js.Any.fromFunction0(value))
      
      inline def set_updatePosition(value: js.Any => Unit): Self = StObject.set(x, "_updatePosition", js.Any.fromFunction1(value))
    }
  }
}
