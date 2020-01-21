package typings.consoleLogLevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Logger = typings.std.Record[
    typings.consoleLogLevel.mod.LogLevelNames, 
    js.Function1[/* repeated */ js.Any, scala.Unit]
  ]
  type PrefixFunction = js.Function1[/* level */ java.lang.String, java.lang.String]
}
