package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView
  extends IFinalizable
     with IJoinable {
  def Query(): IQuery = js.native
  def RowLimit(limit: scala.Double): IView = js.native
  def RowLimit(limit: scala.Double, paged: scala.Boolean): IView = js.native
  def Scope(scope: ViewScope): IView = js.native
}

