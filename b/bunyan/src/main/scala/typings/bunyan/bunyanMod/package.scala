package typings.bunyan

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bunyanMod {
  type LogLevel = LogLevelString | Double
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
  type Serializers = StringDictionary[Serializer]
}
