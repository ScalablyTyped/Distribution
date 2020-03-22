package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataProvider extends DataProvider {
  def getDatabases(connectionUri: String): Thenable[js.Array[String]]
  def getMetadata(connectionUri: String): Thenable[ProviderMetadata]
  def getTableInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]]
  def getViewInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]]
}

object MetadataProvider {
  @scala.inline
  def apply(
    getDatabases: String => Thenable[js.Array[String]],
    getMetadata: String => Thenable[ProviderMetadata],
    getTableInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    getViewInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    providerId: String,
    handle: Int | Double = null
  ): MetadataProvider = {
    val __obj = js.Dynamic.literal(getDatabases = js.Any.fromFunction1(getDatabases), getMetadata = js.Any.fromFunction1(getMetadata), getTableInfo = js.Any.fromFunction2(getTableInfo), getViewInfo = js.Any.fromFunction2(getViewInfo), providerId = providerId.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataProvider]
  }
}

