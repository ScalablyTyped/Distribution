package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchSort")
@js.native
object SearchSortNs extends js.Object {
  @js.native
  class FieldSort ()
    extends couchbaseLib.couchbaseMod.SearchSort {
    def missing(missing: java.lang.String): this.type = js.native
    def mode(mode: java.lang.String): this.type = js.native
    def `type`(`type`: java.lang.String): this.type = js.native
  }
  
  @js.native
  class GeoDistanceSort ()
    extends couchbaseLib.couchbaseMod.SearchSort {
    def unit(unit: java.lang.String): this.type = js.native
  }
  
  @js.native
  class IdSort ()
    extends couchbaseLib.couchbaseMod.SearchSort
  
  @js.native
  class ScoreSort ()
    extends couchbaseLib.couchbaseMod.SearchSort
  
  def field(field: java.lang.String): FieldSort = js.native
  def geoDistance(field: java.lang.String, lat: scala.Double, lon: scala.Double): GeoDistanceSort = js.native
  def id(): IdSort = js.native
  def score(): ScoreSort = js.native
}

