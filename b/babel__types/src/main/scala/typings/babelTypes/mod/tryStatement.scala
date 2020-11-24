package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "tryStatement")
@js.native
object tryStatement extends js.Object {
  
  def apply(block: BlockStatement_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: js.UndefOr[scala.Nothing], finalizer: BlockStatement_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: Null, finalizer: BlockStatement_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: CatchClause_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
}
