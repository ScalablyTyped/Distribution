package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortable extends IFinalizable {
  /** Adds OrderBy clause to the query
    @param fieldInternalName Internal field of the first field by that the data will be sorted (ascending)
    @param override This is only necessary for large lists. DON'T use it unless you know what it is for!
    @param useIndexForOrderBy This is only necessary for large lists. DON'T use it unless you know what it is for!
    */
  def OrderBy(fieldInternalName: java.lang.String): ISortedQuery = js.native
  def OrderBy(fieldInternalName: java.lang.String, `override`: scala.Boolean): ISortedQuery = js.native
  def OrderBy(fieldInternalName: java.lang.String, `override`: scala.Boolean, useIndexForOrderBy: scala.Boolean): ISortedQuery = js.native
  /** Adds OrderBy clause to the query (using descending order for the first field).
    @param fieldInternalName Internal field of the first field by that the data will be sorted (descending)
    @param override This is only necessary for large lists. DON'T use it unless you know what it is for!
    @param useIndexForOrderBy This is only necessary for large lists. DON'T use it unless you know what it is for!
    */
  def OrderByDesc(fieldInternalName: java.lang.String): ISortedQuery = js.native
  def OrderByDesc(fieldInternalName: java.lang.String, `override`: scala.Boolean): ISortedQuery = js.native
  def OrderByDesc(fieldInternalName: java.lang.String, `override`: scala.Boolean, useIndexForOrderBy: scala.Boolean): ISortedQuery = js.native
}

