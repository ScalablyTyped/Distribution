package typings.datatablesNetColreorder

import typings.datatablesNetColreorder.DataTables.Api
import typings.datatablesNetColreorder.datatablesNetColreorderStrings.fromCurrent
import typings.datatablesNetColreorder.datatablesNetColreorderStrings.fromOriginal
import typings.datatablesNetColreorder.datatablesNetColreorderStrings.toCurrent
import typings.datatablesNetColreorder.datatablesNetColreorderStrings.toOriginal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Move extends StObject {
    
    /*
      * Programmatically reorder columns
      */
    def move(from: Double, to: Double, drop: Boolean, invalidate: Boolean): Api = js.native
    
    /*
      * Get / set column order
      */
    def order(): Api = js.native
    def order(newOrder: js.Array[Double]): Api = js.native
    def order(newOrder: js.Array[Double], originalIndexes: Boolean): Api = js.native
    def order(newOrder: Unit, originalIndexes: Boolean): Api = js.native
    
    /*
      * Restore the loaded column order
      */
    def reset(): Api = js.native
    
    /*
      * Convert one or more column indexes to and from current and original indexes
      */
    def transpose(): Api = js.native
    def transpose(idx: js.Array[Double]): Api = js.native
    def transpose(idx: js.Array[Double], direction: toCurrent | toOriginal | fromOriginal | fromCurrent): Api = js.native
    def transpose(idx: Double): Api = js.native
    def transpose(idx: Double, direction: toCurrent | toOriginal | fromOriginal | fromCurrent): Api = js.native
    def transpose(idx: Unit, direction: toCurrent | toOriginal | fromOriginal | fromCurrent): Api = js.native
  }
}
