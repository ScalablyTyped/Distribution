package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swanNs {
  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, scala.Unit]
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]
  type CameraDevice = baiduDashAppLib.baiduDashAppLibStrings.front | baiduDashAppLib.baiduDashAppLibStrings.back
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
  type DefaultProps = js.Object | (stdLib.Record[java.lang.String, js.Any])
  type EncodeBitRate = baiduDashAppLib.baiduDashAppLibNumbers.`8000` | baiduDashAppLib.baiduDashAppLibNumbers.`11025` | baiduDashAppLib.baiduDashAppLibNumbers.`12000` | baiduDashAppLib.baiduDashAppLibNumbers.`16000` | baiduDashAppLib.baiduDashAppLibNumbers.`22050` | baiduDashAppLib.baiduDashAppLibNumbers.`24000` | baiduDashAppLib.baiduDashAppLibNumbers.`32000` | baiduDashAppLib.baiduDashAppLibNumbers.`44100` | baiduDashAppLib.baiduDashAppLibNumbers.`48000`
  type EventType = baiduDashAppLib.baiduDashAppLibStrings.input | baiduDashAppLib.baiduDashAppLibStrings.form | baiduDashAppLib.baiduDashAppLibStrings.submit | baiduDashAppLib.baiduDashAppLibStrings.scroll | TouchEventType | TransitionEventType | baiduDashAppLib.baiduDashAppLibStrings.tap | baiduDashAppLib.baiduDashAppLibStrings.longpress
  type ExtendedComponent[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = (CombinedInstance[Instance, Data, Methods, Props]) with (Component[Data, Props])
  type FormEvent = BuiltInEvent[baiduDashAppLib.baiduDashAppLibStrings.form, baiduDashAppLib.Anon_NameValue]
  // #endregion
  // #endregion
  // #region 媒体API列表
  // 媒体-----图片
  type ImageSizeType = baiduDashAppLib.baiduDashAppLibStrings.original | baiduDashAppLib.baiduDashAppLibStrings.compressed
  type ImageSourceType = baiduDashAppLib.baiduDashAppLibStrings.album | baiduDashAppLib.baiduDashAppLibStrings.camera
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = BuiltInEvent[baiduDashAppLib.baiduDashAppLibStrings.input, baiduDashAppLib.Anon_Cursor]
  type LineCapType = baiduDashAppLib.baiduDashAppLibStrings.butt | baiduDashAppLib.baiduDashAppLibStrings.round | baiduDashAppLib.baiduDashAppLibStrings.square
  type LineJoinType = baiduDashAppLib.baiduDashAppLibStrings.bevel | baiduDashAppLib.baiduDashAppLibStrings.round | baiduDashAppLib.baiduDashAppLibStrings.miter
  // 开放接口-----微信支付
  type PaymentSignType = baiduDashAppLib.baiduDashAppLibStrings.MD5 | baiduDashAppLib.baiduDashAppLibStrings.`HMAC-SHA256`
  type Prop[T] = js.Function0[T] | baiduDashAppLib.Anon_Args[T]
  type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: baidu-app.swan.PropValidator<T[K]>}
    */ baiduDashAppLib.baiduDashAppLibStrings.RecordPropsDefinition with T
  // 开放接口-----设置
  type Scope = baiduDashAppLib.baiduDashAppLibStrings.scopeDOTuserInfo | baiduDashAppLib.baiduDashAppLibStrings.scopeDOTuserLocation | baiduDashAppLib.baiduDashAppLibStrings.scopeDOTaddress | baiduDashAppLib.baiduDashAppLibStrings.scopeDOTinvoiceTitle | baiduDashAppLib.baiduDashAppLibStrings.scopeDOTwerun | baiduDashAppLib.baiduDashAppLibStrings.scopeDOTrecord | baiduDashAppLib.baiduDashAppLibStrings.scopeDOTwritePhotosAlbum
  type ScrollEvent = BuiltInEvent[baiduDashAppLib.baiduDashAppLibStrings.scroll, js.Object]
  type TapEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Component[Data, Props] */, Data, Methods, Props] = js.Object with (ComponentOptions[V, Data, Methods, Props]) with (stdLib.ThisType[CombinedInstance[V, Data, Methods, stdLib.Readonly[Props]]])
  // 界面-----动画
  type TimingFunction = baiduDashAppLib.baiduDashAppLibStrings.linear | baiduDashAppLib.baiduDashAppLibStrings.ease | baiduDashAppLib.baiduDashAppLibStrings.`ease-in` | baiduDashAppLib.baiduDashAppLibStrings.`ease-in-out` | baiduDashAppLib.baiduDashAppLibStrings.`ease-out` | baiduDashAppLib.baiduDashAppLibStrings.`step-start` | baiduDashAppLib.baiduDashAppLibStrings.`step-end`
  type TouchCancelEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchcancel]
  type TouchEndEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchend]
  type TouchEventType = baiduDashAppLib.baiduDashAppLibStrings.tap | baiduDashAppLib.baiduDashAppLibStrings.touchstart | baiduDashAppLib.baiduDashAppLibStrings.touchmove | baiduDashAppLib.baiduDashAppLibStrings.touchcancel | baiduDashAppLib.baiduDashAppLibStrings.touchend | baiduDashAppLib.baiduDashAppLibStrings.touchforcechange
  type TouchForceChangeEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchforcechange]
  type TouchMoveEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchmove]
  type TouchStartEvent = TouchEvent[baiduDashAppLib.baiduDashAppLibStrings.touchstart]
  type TransitionEventType = baiduDashAppLib.baiduDashAppLibStrings.transitionend | baiduDashAppLib.baiduDashAppLibStrings.animationstart | baiduDashAppLib.baiduDashAppLibStrings.animationiteration | baiduDashAppLib.baiduDashAppLibStrings.animationend
  type VideoSourceType = baiduDashAppLib.baiduDashAppLibStrings.album | baiduDashAppLib.baiduDashAppLibStrings.camera
  // 设备-----网络状态
  type networkType = baiduDashAppLib.baiduDashAppLibStrings.`2g` | baiduDashAppLib.baiduDashAppLibStrings.`3g` | baiduDashAppLib.baiduDashAppLibStrings.`4g` | baiduDashAppLib.baiduDashAppLibStrings.wifi | baiduDashAppLib.baiduDashAppLibStrings.unknown | baiduDashAppLib.baiduDashAppLibStrings.none
  // 设备-----扫码
  type scanType = baiduDashAppLib.baiduDashAppLibStrings.qrCode | baiduDashAppLib.baiduDashAppLibStrings.barCode
}
