package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.ValueIteratorTypeGuard
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFindFrom3x4[T] extends StObject {
  
  def apply(
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): LodashFindFrom4x5[T] = js.native
  def apply(
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply(predicate: __, fromIndex: Double): LodashFindFrom3x6[T] = js.native
  def apply[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindFrom3x5[S] = js.native
  def apply[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
}
