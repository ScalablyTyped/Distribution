package typings
package dbDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DbJsNs {
  type ErrorListener = js.Function1[/* err */ stdLib.Error, scala.Unit]
  type IndexAccessibleServer = org.scalablytyped.runtime.StringDictionary[TypedObjectStoreServer[js.Any]]
  type Server = IndexAccessibleServer with ObjectStoreServer with BaseServer
}
