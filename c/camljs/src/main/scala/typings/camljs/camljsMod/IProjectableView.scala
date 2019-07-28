package typings.camljs.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectableView extends IJoinable {
  /** Define query */
  def Query(): IQuery = js.native
  /** Define maximum amount of returned records */
  def RowLimit(limit: Double): IView = js.native
  def RowLimit(limit: Double, paged: Boolean): IView = js.native
  /** Define view scope */
  def Scope(scope: ViewScope): IView = js.native
  /** Select projected field for using in the main Query body
    @param remoteFieldAlias By this alias, the field can be used in the main Query body. */
  def Select(remoteFieldInternalName: String, remoteFieldAlias: String): IProjectableView = js.native
}

