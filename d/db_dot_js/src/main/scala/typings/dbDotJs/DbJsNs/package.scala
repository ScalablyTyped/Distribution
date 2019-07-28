package typings.dbDotJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DbJsNs {
  type ErrorListener = js.Function1[/* err */ Error, Unit]
  type IndexAccessibleServer = StringDictionary[TypedObjectStoreServer[js.Any]]
  type Server = IndexAccessibleServer with ObjectStoreServer with BaseServer
}
