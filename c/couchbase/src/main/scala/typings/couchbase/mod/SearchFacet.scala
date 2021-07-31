package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchFacet")
@js.native
class SearchFacet () extends StObject
object SearchFacet {
  
  @JSImport("couchbase", "SearchFacet")
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def date(field: String, size: Double): DateFacet = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(field.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[DateFacet]
  
  @scala.inline
  def numeric(field: String, size: Double): NumericFacet = (^.asInstanceOf[js.Dynamic].applyDynamic("numeric")(field.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[NumericFacet]
  
  @scala.inline
  def term(field: String, size: Double): TermFacet = (^.asInstanceOf[js.Dynamic].applyDynamic("term")(field.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[TermFacet]
}
