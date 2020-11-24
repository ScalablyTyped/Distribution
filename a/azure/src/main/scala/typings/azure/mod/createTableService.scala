package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "createTableService")
@js.native
object createTableService extends js.Object {
  
  def apply(): TableService = js.native
  def apply(connectionString: String): TableService = js.native
  def apply(storageAccount: String, storageAccessKey: String): TableService = js.native
  def apply(
    storageAccount: String,
    storageAccessKey: String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: String
  ): TableService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String): TableService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String): TableService = js.native
}
