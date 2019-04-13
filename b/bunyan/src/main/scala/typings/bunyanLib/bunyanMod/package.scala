package typings
package bunyanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bunyanMod {
  type LogLevel = LogLevelString | scala.Double
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
  type Serializers = org.scalablytyped.runtime.StringDictionary[Serializer]
}
