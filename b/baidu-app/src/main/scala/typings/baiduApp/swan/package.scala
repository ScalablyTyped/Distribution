package typings.baiduApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object swan {
  
  type AccelerometerChangeCallback = js.Function1[/* res */ typings.baiduApp.swan.AccelerometerData, scala.Unit]
  
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ java.lang.String]
  
  type BuiltInEvent[T /* <: typings.baiduApp.swan.EventType */, Detail] = typings.baiduApp.swan.BaseEvent[T, Detail]
  
  type CheckSessionOption = typings.baiduApp.swan.BaseOptions[js.Any, js.Any]
  
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: typings.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = Methods with Instance
  
  type CompassChangeCallback = js.Function1[/* res */ typings.baiduApp.swan.CompassData, scala.Unit]
  
  type CompassOptions = typings.baiduApp.swan.BaseOptions[js.Any, js.Any]
  
  type CustomEvent[T /* <: java.lang.String */, Detail] = typings.baiduApp.swan.BaseEvent[T, Detail]
  
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
  
  type DefaultProps = js.Object | (typings.std.Record[java.lang.String, js.Any])
  
  type ExtendedComponent[Instance /* <: typings.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = (typings.baiduApp.swan.CombinedInstance[Instance, Data, Methods, Props]) with (typings.baiduApp.swan.Component[Data, Props])
  
  type FormEvent = typings.baiduApp.swan.BuiltInEvent[typings.baiduApp.baiduAppStrings.form, typings.baiduApp.anon.Value]
  
  /**
    * 指定focus时的光标位置
    * @version 1.5.0
    */
  type InputEvent = typings.baiduApp.swan.BuiltInEvent[typings.baiduApp.baiduAppStrings.input, typings.baiduApp.anon.Cursor]
  
  type Prop[T] = js.Function0[T] | typings.baiduApp.anon.Instantiable[T]
  
  type PropValidator[T] = typings.baiduApp.swan.PropOptions[T] | typings.baiduApp.swan.Prop[T] | js.Array[typings.baiduApp.swan.Prop[T]]
  
  type PropsDefinition[T] = typings.baiduApp.swan.ArrayPropsDefinition[T] | typings.baiduApp.swan.RecordPropsDefinition[T]
  
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: baidu-app.swan.PropValidator<T[K]>}
    */ typings.baiduApp.baiduAppStrings.RecordPropsDefinition with org.scalablytyped.runtime.TopLevel[T]
  
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ScrollEvent = typings.baiduApp.swan.BuiltInEvent[typings.baiduApp.baiduAppStrings.scroll, js.Object]
  
  type TapEvent = typings.baiduApp.swan.TouchEvent[typings.baiduApp.baiduAppStrings.tap]
  
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typings.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = js.Object with (typings.baiduApp.swan.ComponentOptions[V, Data, Methods, Props]) with (typings.std.ThisType[typings.baiduApp.swan.CombinedInstance[V, Data, Methods, Props]])
  
  type TouchCancelEvent = typings.baiduApp.swan.TouchEvent[typings.baiduApp.baiduAppStrings.touchcancel]
  
  type TouchEndEvent = typings.baiduApp.swan.TouchEvent[typings.baiduApp.baiduAppStrings.touchend]
  
  type TouchForceChangeEvent = typings.baiduApp.swan.TouchEvent[typings.baiduApp.baiduAppStrings.touchforcechange]
  
  type TouchMoveEvent = typings.baiduApp.swan.TouchEvent[typings.baiduApp.baiduAppStrings.touchmove]
  
  type TouchStartEvent = typings.baiduApp.swan.TouchEvent[typings.baiduApp.baiduAppStrings.touchstart]
}
