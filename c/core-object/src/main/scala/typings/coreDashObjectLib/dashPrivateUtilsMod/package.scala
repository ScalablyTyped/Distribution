package typings
package coreDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dashPrivateUtilsMod {
  type Constructor[Instance] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, Instance]
  type MethodNames[T] = Values[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}
    */ coreDashObjectLib.coreDashObjectLibStrings.MethodNames with T
  ]
  type Mix[T, U] = U with (stdLib.Pick[T, stdLib.Exclude[java.lang.String, java.lang.String]])
  type Super[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in core-object.core-object/-private/utils.MethodNames<T> ]: T[K] extends (): infer Return? core-object.core-object/-private/utils.CallOrApply<T, undefined, any> : T[K] extends (a : infer A): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any], any> : T[K] extends (a : infer A, b : infer B): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C, d : infer D): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any, any], any> : T[K] extends (args : ...any): infer Return? core-object.core-object/-private/utils.CallOrApply<T, std.Array<any>, any> : never}
    */ coreDashObjectLib.coreDashObjectLibStrings.Super with js.Any
  type Values[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
