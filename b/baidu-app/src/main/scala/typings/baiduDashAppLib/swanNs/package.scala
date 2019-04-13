package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swanNs {
  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, scala.Unit]
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]
  type CheckSessionOption = BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = Methods with Instance
  type CompassChangeCallback = js.Function1[/* res */ CompassData, scala.Unit]
  type CompassOptions = BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: java.lang.String */, Detail] = BaseEvent[T, Detail]
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
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (stdLib.Record[java.lang.String, js.Any])
  type ExtendedComponent[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = (CombinedInstance[Instance, Data, Methods, Props]) with (Component[Data, Props])
  type FormEvent = BuiltInEvent[baiduDashAppLib.baiduDashAppLibStrings.form, baiduDashAppLib.Anon_NameValue]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = BuiltInEvent[baiduDashAppLib.baiduDashAppLibStrings.input, baiduDashAppLib.Anon_Cursor]
  type Prop[T] = js.Function0[T] | baiduDashAppLib.Anon_Args[T]
  type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: baidu-app.swan.PropValidator<T[K]>}
    */ baiduDashAppLib.baiduDashAppLibStrings.RecordPropsDefinition with T
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ScrollEvent = BuiltInEvent[baiduDashAppLib.baiduDashAppLibStrings.scroll, js.Object]
  type TapEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Component[Data, Props] */, Data, Methods, Props] = js.Object with (ComponentOptions[V, Data, Methods, Props]) with (stdLib.ThisType[CombinedInstance[V, Data, Methods, stdLib.Readonly[Props]]])
  type TouchCancelEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchcancel]
  type TouchEndEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchend]
  type TouchForceChangeEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchforcechange]
  type TouchMoveEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchmove]
  type TouchStartEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchstart]
}
