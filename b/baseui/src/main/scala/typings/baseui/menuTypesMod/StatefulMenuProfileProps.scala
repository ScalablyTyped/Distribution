package typings.baseui.menuTypesMod

import typings.baseui.anon.Body
import typings.baseui.anon.PartialStatefulContainerS
import typings.baseui.anon.`14`
import typings.baseui.baseuiStrings.character
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.enter_
import typings.baseui.baseuiStrings.focus
import typings.baseui.baseuiStrings.mouseEnter
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.reset
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulMenuProfileProps
  extends StObject
     with StatefulContainerProps
     with MenuProfileProps
object StatefulMenuProfileProps {
  
  inline def apply(
    children: RenderProps => ReactNode,
    forceHighlight: Boolean,
    getProfileItemImg: /* item */ Item => String | ComponentType[Any],
    getProfileItemImgText: /* item */ Item => String,
    getProfileItemLabels: /* item */ Item => Body,
    getRequiredItemProps: (/* item */ Item, /* index */ Double) => RenderItemProps,
    initialState: InitialState,
    items: Items,
    keyboardControlNode: `14`,
    onItemSelect: /* a */ typings.baseui.anon.Item => Any,
    stateReducer: (/* changeType */ js.UndefOr[
      click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
    ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState,
    typeAhead: Boolean
  ): StatefulMenuProfileProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), forceHighlight = forceHighlight.asInstanceOf[js.Any], getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), initialState = initialState.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], keyboardControlNode = keyboardControlNode.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), stateReducer = js.Any.fromFunction3(stateReducer), typeAhead = typeAhead.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulMenuProfileProps]
  }
}
