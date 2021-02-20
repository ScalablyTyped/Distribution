package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchFacet")
@js.native
class SearchFacet () extends StObject
object SearchFacet {
  
  @JSImport("couchbase", "SearchFacet.DateFacet")
  @js.native
  class DateFacet () extends SearchFacet {
    
    def addRange(name: String, start: String, end: String): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchFacet.NumericFacet")
  @js.native
  class NumericFacet () extends SearchFacet {
    
    def addRange(name: String, min: Double, max: Double): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchFacet.TermFacet")
  @js.native
  class TermFacet () extends SearchFacet
  
  @JSImport("couchbase", "SearchFacet.date")
  @js.native
  def date(field: String, size: Double): DateFacet = js.native
  
  @JSImport("couchbase", "SearchFacet.numeric")
  @js.native
  def numeric(field: String, size: Double): NumericFacet = js.native
  
  @JSImport("couchbase", "SearchFacet.term")
  @js.native
  def term(field: String, size: Double): TermFacet = js.native
}
