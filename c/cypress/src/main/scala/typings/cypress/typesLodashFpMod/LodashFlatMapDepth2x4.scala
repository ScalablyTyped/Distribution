package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ListOfRecursiveArraysOrValues
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFlatMapDepth2x4[T] extends StObject {
  
  def apply(iteratee: __, depth: Double): LodashFlatMapDepth2x6[T] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth2x5[TResult] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double
  ): js.Array[TResult] = js.native
}
