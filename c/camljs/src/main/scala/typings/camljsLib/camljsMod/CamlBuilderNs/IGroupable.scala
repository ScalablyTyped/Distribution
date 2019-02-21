package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupable extends ISortable {
  /** Adds GroupBy clause to the query.
    @param collapse If true, only information about the groups is retrieved, otherwise items are also retrieved.
    @param groupLimit Return only first N groups */
  def GroupBy(fieldInternalName: js.Any): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: js.Any, collapse: scala.Boolean): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: js.Any, collapse: scala.Boolean, groupLimit: scala.Double): IGroupedQuery = js.native
}

