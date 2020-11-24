package typings.azdata.mod.connection

import typings.azdata.mod.IConnectionCompletionOptions
import typings.azdata.mod.IConnectionProfile
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "connection.openConnectionDialog")
@js.native
object openConnectionDialog extends js.Object {
  
  def apply(): Thenable[Connection] = js.native
  def apply(
    providers: js.UndefOr[scala.Nothing],
    initialConnectionProfile: js.UndefOr[scala.Nothing],
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
  def apply(providers: js.UndefOr[scala.Nothing], initialConnectionProfile: IConnectionProfile): Thenable[Connection] = js.native
  def apply(
    providers: js.UndefOr[scala.Nothing],
    initialConnectionProfile: IConnectionProfile,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
  def apply(providers: js.Array[String]): Thenable[Connection] = js.native
  def apply(
    providers: js.Array[String],
    initialConnectionProfile: js.UndefOr[scala.Nothing],
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
  def apply(providers: js.Array[String], initialConnectionProfile: IConnectionProfile): Thenable[Connection] = js.native
  def apply(
    providers: js.Array[String],
    initialConnectionProfile: IConnectionProfile,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
}
