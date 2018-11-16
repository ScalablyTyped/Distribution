package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupable extends ISortable {
  /** Adds GroupBy clause to the query.
              @param collapse If true, only information about the groups is retrieved, otherwise items are also retrieved. */
  def GroupBy(fieldInternalName: js.Any): IGroupedQuery = js.native
}

