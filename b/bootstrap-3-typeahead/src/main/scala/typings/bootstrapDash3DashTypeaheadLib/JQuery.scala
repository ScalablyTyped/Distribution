package typings
package bootstrapDash3DashTypeaheadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
       * Initialize or destroy Typeahead
       */
  def typeahead(): JQuery = js.native
  /**
       * Initialize or destroy Typeahead
       */
  def typeahead(methodOrOptions: bootstrapDash3DashTypeaheadLib.Bootstrap3TypeaheadNs.Options): JQuery = js.native
  /**
       * Initialize or destroy Typeahead
       */
  @JSName("typeahead")
  def typeahead_destroy(methodOrOptions: bootstrapDash3DashTypeaheadLib.bootstrapDash3DashTypeaheadLibStrings.destroy): JQuery = js.native
  /**
       * To get the currently active item
       */
  @JSName("typeahead")
  def typeahead_getActive(method: bootstrapDash3DashTypeaheadLib.bootstrapDash3DashTypeaheadLibStrings.getActive): js.UndefOr[java.lang.String | js.Object] = js.native
  /**
       * To trigger the lookup function externally
       */
  @JSName("typeahead")
  def typeahead_lookup(method: bootstrapDash3DashTypeaheadLib.bootstrapDash3DashTypeaheadLibStrings.lookup): JQuery = js.native
  /**
       * To trigger the lookup function externally
       */
  @JSName("typeahead")
  def typeahead_lookup(
    method: bootstrapDash3DashTypeaheadLib.bootstrapDash3DashTypeaheadLibStrings.lookup,
    defaultValue: java.lang.String
  ): JQuery = js.native
}

