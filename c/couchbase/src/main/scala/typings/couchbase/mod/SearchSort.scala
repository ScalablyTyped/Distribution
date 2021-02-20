package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchSort")
@js.native
class SearchSort () extends StObject {
  
  /**
    * Specifies whether to sort descending or not.
    */
  def descending(descending: Boolean): this.type = js.native
}
object SearchSort {
  
  @JSImport("couchbase", "SearchSort.FieldSort")
  @js.native
  class FieldSort () extends SearchSort {
    
    def missing(missing: String): this.type = js.native
    
    def mode(mode: String): this.type = js.native
    
    def `type`(`type`: String): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchSort.GeoDistanceSort")
  @js.native
  class GeoDistanceSort () extends SearchSort {
    
    def unit(unit: String): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchSort.IdSort")
  @js.native
  class IdSort () extends SearchSort
  
  @JSImport("couchbase", "SearchSort.ScoreSort")
  @js.native
  class ScoreSort () extends SearchSort
  
  @JSImport("couchbase", "SearchSort.field")
  @js.native
  def field(field: String): FieldSort = js.native
  
  @JSImport("couchbase", "SearchSort.geoDistance")
  @js.native
  def geoDistance(field: String, lat: Double, lon: Double): GeoDistanceSort = js.native
  
  @JSImport("couchbase", "SearchSort.id")
  @js.native
  def id(): IdSort = js.native
  
  @JSImport("couchbase", "SearchSort.score")
  @js.native
  def score(): ScoreSort = js.native
}
