package typings.cypress.typesLodashFpMod

import typings.cypress.cypressStrings.asc
import typings.cypress.cypressStrings.desc
import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.NotVoid
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy extends StObject {
  
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x2 = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x1[T] = js.native
  def apply[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]]): LodashOrderBy1x1[T] = js.native
  def apply[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: Many[Boolean | asc | desc]): LodashOrderBy1x3[T] = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]], orders: Many[Boolean | asc | desc]): LodashOrderBy2x3[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: Many[Boolean | asc | desc],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: Many[Boolean | asc | desc],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](
    iteratees: Many[ValueIteratee[T]],
    orders: Many[Boolean | asc | desc],
    collection: typings.cypress.typesLodashMod.List[T]
  ): js.Array[T] = js.native
  def apply[T](
    iteratees: Many[js.Function1[/* value */ T, NotVoid]],
    orders: Many[Boolean | asc | desc],
    collection: typings.cypress.typesLodashMod.List[T]
  ): js.Array[T] = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]], orders: __): LodashOrderBy2x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: __
  ): LodashOrderBy3x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy3x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy4x5[T] = js.native
  def apply[T](
    iteratees: Many[js.Function1[/* value */ T, NotVoid]],
    orders: __,
    collection: typings.cypress.typesLodashMod.List[T]
  ): LodashOrderBy1x5[T] = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]], orders: __, collection: typings.cypress.typesLodashMod.List[T]): LodashOrderBy2x5[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: Many[Boolean | asc | desc], collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](
    iteratees: __,
    orders: Many[Boolean | asc | desc],
    collection: typings.cypress.typesLodashMod.List[T]
  ): LodashOrderBy1x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: __): LodashOrderBy3x4[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: __, collection: T): LodashOrderBy3x4[T] = js.native
  def apply[T](iteratees: __, orders: __, collection: typings.cypress.typesLodashMod.List[T]): LodashOrderBy1x4[T] = js.native
}
