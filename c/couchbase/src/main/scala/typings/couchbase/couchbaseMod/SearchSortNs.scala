package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.SearchSortNs.FieldSort
import typings.couchbase.couchbaseMod.SearchSortNs.GeoDistanceSort
import typings.couchbase.couchbaseMod.SearchSortNs.IdSort
import typings.couchbase.couchbaseMod.SearchSortNs.ScoreSort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchSort")
@js.native
object SearchSortNs extends js.Object {
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

