package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupable
  extends StObject
     with ISortable {
  
  /** Adds GroupBy clause to the query.
    @param collapse If true, only information about the groups is retrieved, otherwise items are also retrieved.
    @param groupLimit Return only first N groups */
  def GroupBy(fieldInternalName: Any): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: Any, collapse: Boolean): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: Any, collapse: Boolean, groupLimit: Double): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: Any, collapse: Unit, groupLimit: Double): IGroupedQuery = js.native
}
