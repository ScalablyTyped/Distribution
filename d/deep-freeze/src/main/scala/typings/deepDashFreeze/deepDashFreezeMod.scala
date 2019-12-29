package typings.deepDashFreeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-freeze", JSImport.Namespace)
@js.native
object deepDashFreezeMod extends js.Object {
  def apply[T](a: js.Array[T]): js.Array[DeepReadonly[T]] = js.native
  def apply[T /* <: js.Function */](f: T): T = js.native
  type DeepReadonly[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias deep-freeze.deep-freeze.DeepReadonly<T[P]> * / object}
    */ typings.deepDashFreeze.deepDashFreezeStrings.DeepReadonly with js.Any) | T
}

