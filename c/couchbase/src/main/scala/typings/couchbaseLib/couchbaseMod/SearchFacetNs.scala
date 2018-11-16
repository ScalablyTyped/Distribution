package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchFacet")
@js.native
object SearchFacetNs extends js.Object {
  @js.native
  class DateFacet ()
    extends couchbaseLib.couchbaseMod.SearchFacet {
    def addRange(name: java.lang.String, start: java.lang.String, end: java.lang.String): this.type = js.native
  }
  
  @js.native
  class NumericFacet ()
    extends couchbaseLib.couchbaseMod.SearchFacet {
    def addRange(name: java.lang.String, min: scala.Double, max: scala.Double): this.type = js.native
  }
  
  @js.native
  class TermFacet ()
    extends couchbaseLib.couchbaseMod.SearchFacet
  
  def date(field: java.lang.String, size: scala.Double): DateFacet = js.native
  def numeric(field: java.lang.String, size: scala.Double): NumericFacet = js.native
  def term(field: java.lang.String, size: scala.Double): TermFacet = js.native
}

