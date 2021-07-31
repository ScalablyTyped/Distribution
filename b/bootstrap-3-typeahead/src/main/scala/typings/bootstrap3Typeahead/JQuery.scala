package typings.bootstrap3Typeahead

import typings.bootstrap3Typeahead.Bootstrap3Typeahead.Options
import typings.bootstrap3Typeahead.bootstrap3TypeaheadStrings.destroy
import typings.bootstrap3Typeahead.bootstrap3TypeaheadStrings.getActive
import typings.bootstrap3Typeahead.bootstrap3TypeaheadStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Initialize or destroy Typeahead
    */
  def typeahead(): JQuery = js.native
  def typeahead(methodOrOptions: Options): JQuery = js.native
  @JSName("typeahead")
  def typeahead_destroy(methodOrOptions: destroy): JQuery = js.native
  /**
    * To get the currently active item
    */
  @JSName("typeahead")
  def typeahead_getActive(method: getActive): js.UndefOr[String | js.Object] = js.native
  /**
    * To trigger the lookup function externally
    */
  @JSName("typeahead")
  def typeahead_lookup(method: lookup): JQuery = js.native
  @JSName("typeahead")
  def typeahead_lookup(method: lookup, defaultValue: String): JQuery = js.native
}
