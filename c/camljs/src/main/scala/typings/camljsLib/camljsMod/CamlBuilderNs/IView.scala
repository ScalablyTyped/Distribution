package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends IFinalizable {
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @alias alias for the joined list */
  def InnerJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String): IJoin = js.native
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @alias alias for the joined list */
  def LeftJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String): IJoin = js.native
  /** Define query */
  def Query(): IQuery = js.native
  /** Define maximum amount of returned records */
  def RowLimit(limit: scala.Double): IView = js.native
  def RowLimit(limit: scala.Double, paged: scala.Boolean): IView = js.native
  /** Define view scope */
  def Scope(scope: ViewScope): IView = js.native
}

