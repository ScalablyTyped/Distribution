package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swan {
  import org.scalablytyped.runtime.StringDictionary
  import typings.baiduDashApp.Anon_Args
  import typings.baiduDashApp.Anon_Cursor
  import typings.baiduDashApp.Anon_NameValue
  import typings.baiduDashApp.baiduDashAppStrings.form
  import typings.baiduDashApp.baiduDashAppStrings.input
  import typings.baiduDashApp.baiduDashAppStrings.scroll
  import typings.baiduDashApp.baiduDashAppStrings.tap
  import typings.baiduDashApp.baiduDashAppStrings.touchcancel
  import typings.baiduDashApp.baiduDashAppStrings.touchend
  import typings.baiduDashApp.baiduDashAppStrings.touchforcechange
  import typings.baiduDashApp.baiduDashAppStrings.touchmove
  import typings.baiduDashApp.baiduDashAppStrings.touchstart
  import typings.std.Record
  import typings.std.ThisType

  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]
  type ArrayPropsDefinition[T] = js.Array[String]
  type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]
  type CheckSessionOption = BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = Methods with Instance
  type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]
  type CompassOptions = BaseOptions[js.Any, js.Any]
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
  type DataValueType[Def] = js.Any
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (Record[String, js.Any])
  type ExtendedComponent[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = (CombinedInstance[Instance, Data, Methods, Props]) with (Component[Data, Props])
  type FormEvent = BuiltInEvent[form, Anon_NameValue]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = BuiltInEvent[input, Anon_Cursor]
  type Prop[T] = js.Function0[T] | Anon_Args[T]
  type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: baidu-app.swan.PropValidator<T[K]>}
    */ typings.baiduDashApp.baiduDashAppStrings.RecordPropsDefinition with T
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = StringDictionary[String]
  type ScrollEvent = BuiltInEvent[scroll, js.Object]
  type TapEvent = TouchEvent[tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Component[Data, Props] */, Data, Methods, Props] = js.Object with (ComponentOptions[V, Data, Methods, Props]) with (ThisType[CombinedInstance[V, Data, Methods, Props]])
  type TouchCancelEvent = TouchEvent[touchcancel]
  type TouchEndEvent = TouchEvent[touchend]
  type TouchForceChangeEvent = TouchEvent[touchforcechange]
  type TouchMoveEvent = TouchEvent[touchmove]
  type TouchStartEvent = TouchEvent[touchstart]
}
