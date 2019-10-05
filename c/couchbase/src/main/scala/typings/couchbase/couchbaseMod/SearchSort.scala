package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.SearchSort.FieldSort
import typings.couchbase.couchbaseMod.SearchSort.GeoDistanceSort
import typings.couchbase.couchbaseMod.SearchSort.IdSort
import typings.couchbase.couchbaseMod.SearchSort.ScoreSort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchSort")
@js.native
class SearchSort () extends js.Object {
  /**
    * Specifies whether to sort descending or not.
    */
  def descending(descending: Boolean): this.type = js.native
}

@JSImport("couchbase", "SearchSort")
@js.native
object SearchSort extends js.Object {
  @js.native
  class FieldSort () extends SearchSort {
    def missing(missing: String): this.type = js.native
    def mode(mode: String): this.type = js.native
    def `type`(`type`: String): this.type = js.native
  }
  
  @js.native
  class GeoDistanceSort () extends SearchSort {
    def unit(unit: String): this.type = js.native
  }
  
  @js.native
  class IdSort () extends SearchSort
  
  @js.native
  class ScoreSort () extends SearchSort
  
  def field(field: String): FieldSort = js.native
  def geoDistance(field: String, lat: Double, lon: Double): GeoDistanceSort = js.native
  def id(): IdSort = js.native
  def score(): ScoreSort = js.native
}

