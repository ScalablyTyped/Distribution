package typings.bunyan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bunyanMod {
  import org.scalablytyped.runtime.StringDictionary

  type LogLevel = LogLevelString | Double
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
  type Serializers = StringDictionary[Serializer]
}
