package typings
package coreDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dashPrivateUtilsMod {
  type Constructor[Instance] = ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, Instance]
  type MethodNames[T] = Values[coreDashObjectLib.coreDashObjectLibStrings.MethodNames with js.Any]
  type Mix[T, U] = U with (stdLib.Pick[T, stdLib.Exclude[java.lang.String, java.lang.String]])
  type Super[T] = coreDashObjectLib.coreDashObjectLibStrings.Super with js.Any
  type Values[T] = /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
}
