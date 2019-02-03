package typings
package coreDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dashPrivateUtilsMod {
  type Constructor[Instance] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, Instance]
  type MethodNames[T] = Values[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: K}
    */ coreDashObjectLib.coreDashObjectLibStrings.MethodNames with js.Any
  ]
  type Mix[T, U] = U with (stdLib.Pick[T, stdLib.Exclude[java.lang.String, java.lang.String]])
  type Super[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in core-object.core-object/-private/utils.MethodNames<T> ]: core-object.core-object/-private/utils.CallOrApply<T, std.Array<any>, any> | core-object.core-object/-private/utils.CallOrApply<T, [any, any, any, any], any> | core-object.core-object/-private/utils.CallOrApply<T, [any, any, any], any> | core-object.core-object/-private/utils.CallOrApply<T, [any, any], any> | core-object.core-object/-private/utils.CallOrApply<T, [any], any> | core-object.core-object/-private/utils.CallOrApply<T, undefined, any>}
    */ coreDashObjectLib.coreDashObjectLibStrings.Super with js.Any
  type Values[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
