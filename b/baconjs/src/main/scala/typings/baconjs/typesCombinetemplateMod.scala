package typings.baconjs

import typings.baconjs.typesCombinetemplateMod.ArrayTemplate
import typings.baconjs.typesCombinetemplateMod.CombinedTemplate
import typings.baconjs.typesCombinetemplateMod.ObjectTemplate
import typings.baconjs.typesObservableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/combinetemplate", JSImport.Namespace)
@js.native
object typesCombinetemplateMod extends js.Object {
  def default[T](template: T): Property[CombinedTemplate[T]] = js.native
  type ArrayTemplate[A] = js.Array[A | ObjectTemplate[A]]
  type CombinedTemplate[O] = O | ArrayTemplate[js.Any] | ObjectTemplate[O]
  type ObjectTemplate[O] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: O[K] extends baconjs.baconjs/types/observable.default<infer I>? any : O[K] extends std.Record<any, any>? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias baconjs.baconjs/types/combinetemplate.ObjectTemplate<O[K]> * / object : O[K] extends std.Array<infer I2>? baconjs.baconjs/types/combinetemplate.ArrayTemplate<any> : O[K]}
    */ typings.baconjs.baconjsStrings.ObjectTemplate with js.Any
}

