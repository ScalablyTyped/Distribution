package typings
package dbDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DbJsNs {
  type ErrorListener = js.Function1[/* err */ stdLib.Error, scala.Unit]
  type Server = IndexAccessibleServer with ObjectStoreServer with BaseServer
}
