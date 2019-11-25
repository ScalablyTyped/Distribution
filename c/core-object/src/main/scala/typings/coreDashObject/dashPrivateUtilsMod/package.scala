package typings.coreDashObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dashPrivateUtilsMod {
  import org.scalablytyped.runtime.Instantiable1
  import typings.std.Exclude
  import typings.std.Pick

  type Constructor[Instance] = Instantiable1[/* args (repeated) */ js.Any, Instance]
  type MethodNames[T] = Values[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}
    */ typings.coreDashObject.coreDashObjectStrings.MethodNames with T
  ]
  type Mix[T, U] = U with (Pick[T, Exclude[String, String]])
  type Super[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in core-object.core-object/-private/utils.MethodNames<T> ]: T[K] extends (): infer Return? core-object.core-object/-private/utils.CallOrApply<T, undefined, any> : T[K] extends (a : infer A): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any], any> : T[K] extends (a : infer A, b : infer B): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C, d : infer D): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any, any], any> : T[K] extends (args : ...any): infer Return? core-object.core-object/-private/utils.CallOrApply<T, std.Array<any>, any> : never}
    */ typings.coreDashObject.coreDashObjectStrings.Super with js.Any
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
