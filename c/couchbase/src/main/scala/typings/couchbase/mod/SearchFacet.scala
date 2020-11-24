package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchFacet")
@js.native
class SearchFacet () extends js.Object
@JSImport("couchbase", "SearchFacet")
@js.native
object SearchFacet extends js.Object {
  
  def date(field: String, size: Double): DateFacet = js.native
  
  def numeric(field: String, size: Double): NumericFacet = js.native
  
  def term(field: String, size: Double): TermFacet = js.native
  
  @js.native
  class DateFacet () extends SearchFacet {
    
    def addRange(name: String, start: String, end: String): this.type = js.native
  }
  
  @js.native
  class NumericFacet () extends SearchFacet {
    
    def addRange(name: String, min: Double, max: Double): this.type = js.native
  }
  
  @js.native
  class TermFacet () extends SearchFacet
}
