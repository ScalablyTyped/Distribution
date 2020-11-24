package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-types/ts3.6", "tryStatement")
@js.native
object tryStatement extends js.Object {
  
  def apply(): TryStatement_ = js.native
  def apply(block: js.UndefOr[scala.Nothing], handler: js.UndefOr[scala.Nothing], finalizer: BlockStatement_): TryStatement_ = js.native
  def apply(block: js.UndefOr[scala.Nothing], handler: CatchClause_): TryStatement_ = js.native
  def apply(block: js.UndefOr[scala.Nothing], handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
  def apply(block: BlockStatement_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: js.UndefOr[scala.Nothing], finalizer: BlockStatement_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: CatchClause_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
}
