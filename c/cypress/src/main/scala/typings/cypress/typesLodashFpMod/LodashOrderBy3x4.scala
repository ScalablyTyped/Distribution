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
trait LodashOrderBy3x4[T] extends StObject {
  
  def apply(
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ): LodashOrderBy4x5[T] = js.native
  def apply(
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ]
  ): LodashOrderBy3x5[T] = js.native
  def apply(
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply(
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy3x6[T] = js.native
}
