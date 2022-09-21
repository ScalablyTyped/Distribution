package typings.baiduApp.swan

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.baiduApp.anon.Cursor
import typings.baiduApp.anon.Instantiable
import typings.baiduApp.anon.Value
import typings.baiduApp.baiduAppStrings.form
import typings.baiduApp.baiduAppStrings.input
import typings.baiduApp.baiduAppStrings.scroll
import typings.baiduApp.baiduAppStrings.tap
import typings.baiduApp.baiduAppStrings.touchcancel
import typings.baiduApp.baiduAppStrings.touchend
import typings.baiduApp.baiduAppStrings.touchforcechange
import typings.baiduApp.baiduAppStrings.touchmove
import typings.baiduApp.baiduAppStrings.touchstart
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]

type ArrayPropsDefinition[T] = js.Array[/* keyof T */ String]

type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]

type CheckSessionOption = BaseOptions[Any, Any]

// CombinedInstance models the `this`, i.e. instance type for (user defined) component
type CombinedInstance[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = Methods & Instance

type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]

type CompassOptions = BaseOptions[Any, Any]

type CustomEvent[T /* <: String */, Detail] = BaseEvent[T, Detail]

/**
  * There are two valid ways to define the type of data / properties:
  *
  * 1. { name: valueType }
  * 2. { name: { type: valueType, value?: value } }
  *
  * and this conditional type will extract that out so the call-site will typecheck.
  *
  * Note this is different from PropOptions as it is the definitions you passed to Component function
  * whereas this type is for call-site.
  */
type DataValueType[Def] = Any

// #endregion
// #region Compontent组件
type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])

type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ Any, Any]]

type DefaultProps = js.Object | (Record[String, Any])

type ExtendedComponent[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = (CombinedInstance[Instance, Data, Methods, Props]) & (Component[Data, Props])

type FormEvent = BuiltInEvent[form, Value]

/**
  * 指定focus时的光标位置
  * @version 1.5.0
  */
type InputEvent = BuiltInEvent[input, Cursor]

type Prop[T] = js.Function0[T] | Instantiable[T]

type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]

type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]

type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: baidu-app.swan.PropValidator<T[K]>}
  */ typings.baiduApp.baiduAppStrings.RecordPropsDefinition & TopLevel[T]

// #endregion
// #region 网络API列表
// 发起请求
type RequestHeader = StringDictionary[String]

type ScrollEvent = BuiltInEvent[scroll, js.Object]

type TapEvent = TouchEvent[tap]

type TouchCancelEvent = TouchEvent[touchcancel]

type TouchEndEvent = TouchEvent[touchend]

type TouchForceChangeEvent = TouchEvent[touchforcechange]

type TouchMoveEvent = TouchEvent[touchmove]

type TouchStartEvent = TouchEvent[touchstart]
