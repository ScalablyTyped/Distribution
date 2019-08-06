package typings.deepDashFreeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object deepDashFreezeMod {
  type DeepReadonly[T] = (/* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: object}
    */ typings.deepDashFreeze.deepDashFreezeStrings.DeepReadonly with js.Any) | T
}
