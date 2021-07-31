package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IView
  extends StObject
     with IFinalizable {
  
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @alias alias for the joined list */
  def InnerJoin(lookupFieldInternalName: String, alias: String): IJoin = js.native
  
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @alias alias for the joined list */
  def LeftJoin(lookupFieldInternalName: String, alias: String): IJoin = js.native
  
  /** Define query */
  def Query(): IQuery = js.native
  
  /** Define maximum amount of returned records */
  def RowLimit(limit: Double): IView = js.native
  def RowLimit(limit: Double, paged: Boolean): IView = js.native
  
  /** Define view scope */
  def Scope(scope: ViewScope): IView = js.native
}
