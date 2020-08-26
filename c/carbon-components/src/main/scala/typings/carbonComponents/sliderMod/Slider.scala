package typings.carbonComponents.sliderMod

import typings.carbonComponents.anon.Max
import typings.carbonComponents.anon.NewValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Slider extends js.Object {
  def _calcValue(evt: js.Any): NewValue = js.native
  def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
  def _updateInput(): Unit = js.native
  def _updatePosition(evt: js.Any): Unit = js.native
  def getInputProps(): Max = js.native
  def setValue(value: js.Any): Unit = js.native
  def stepDown(): Unit = js.native
  def stepUp(): Unit = js.native
}

object Slider {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
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
    def set_calcValue(value: js.Any => NewValue): Self = this.set("_calcValue", js.Any.fromFunction1(value))
    @scala.inline
    def set_changeState(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("_changeState", js.Any.fromFunction3(value))
    @scala.inline
    def set_updateInput(value: () => Unit): Self = this.set("_updateInput", js.Any.fromFunction0(value))
    @scala.inline
    def set_updatePosition(value: js.Any => Unit): Self = this.set("_updatePosition", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInputProps(value: () => Max): Self = this.set("getInputProps", js.Any.fromFunction0(value))
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def setStepDown(value: () => Unit): Self = this.set("stepDown", js.Any.fromFunction0(value))
    @scala.inline
    def setStepUp(value: () => Unit): Self = this.set("stepUp", js.Any.fromFunction0(value))
  }
  
}

