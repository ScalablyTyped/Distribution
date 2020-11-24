package typings.crossfilter

import typings.crossfilter.CrossFilter.Bisector
import typings.crossfilter.CrossFilter.Heap
import typings.crossfilter.CrossFilter.HeapSelect
import typings.crossfilter.CrossFilter.Selector
import typings.crossfilter.CrossFilter.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait By extends js.Object {
    
    def apply[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
    
    def by[T](value: Selector[T]): Heap[T] = js.native
  }
  
  @js.native
  trait Call extends js.Object {
    
    def apply[T](array: js.Array[T], value: T, lo: Double, hi: Double): Double = js.native
    
    def by[T, U](accessor: js.Function1[/* x */ T, U]): Bisector[T, U] = js.native
  }
  
  @js.native
  trait CallArrayLoHi extends js.Object {
    
    def apply[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
    
    def by[T](value: Selector[T]): Sort[T] = js.native
  }
  
  @js.native
  trait CallBy extends js.Object {
    
    def apply[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
    
    def by[T](value: Selector[T]): HeapSelect[T] = js.native
  }
}
