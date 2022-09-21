package typings.baseui.menuTypesMod

import typings.baseui.anon.Body
import typings.baseui.anon.PartialStatefulContainerS
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
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArrayItems = js.Array[Item]

type GetItemLabelFn = js.Function1[/* item */ Item, ReactNode]

type GetProfileItemImgFn = js.Function1[/* item */ Item, String | ComponentType[Any]]

type GetProfileItemImgTextFn = js.Function1[/* item */ Item, String]

type GetProfileItemLabelsFn = js.Function1[/* item */ Item, Body]

type GetRequiredItemPropsFn = js.Function2[/* item */ Item, /* index */ Double, RenderItemProps]

type Item = Any

type Items = ArrayItems | GroupedItems

type OnItemSelectFn = js.Function1[/* a */ typings.baseui.anon.Item, Any]

type SetRootRefFn = js.Function1[
/* ref */ RefObject[
  /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTMLElement */ Any
], 
Unit]

type StateReducerFn = js.Function3[
/* changeType */ js.UndefOr[
  click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
], 
/* changes */ PartialStatefulContainerS, 
/* currentState */ StatefulContainerState, 
StatefulContainerState]
