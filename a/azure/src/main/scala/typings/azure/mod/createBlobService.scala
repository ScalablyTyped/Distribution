package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "createBlobService")
@js.native
object createBlobService extends js.Object {
  
  def apply(): BlobService = js.native
  def apply(connectionString: String): BlobService = js.native
  def apply(storageAccount: String, storageAccessKey: String): BlobService = js.native
  def apply(
    storageAccount: String,
    storageAccessKey: String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: String
  ): BlobService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String): BlobService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String): BlobService = js.native
}
