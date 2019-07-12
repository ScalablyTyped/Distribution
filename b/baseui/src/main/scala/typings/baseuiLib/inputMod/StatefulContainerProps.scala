package typings
package baseuiLib.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function3[
      baseuiLib.baseuiLibStrings.change, 
      /* nextState */ State, 
      /* currentState */ State, 
      State
    ]
  ] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    initialState: State = null,
    onChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement] = null,
    stateReducer: (baseuiLib.baseuiLibStrings.change, /* nextState */ State, /* currentState */ State) => State = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

