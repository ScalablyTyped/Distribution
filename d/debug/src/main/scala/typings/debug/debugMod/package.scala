package typings.debug

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object debugMod {
  type Formatters = StringDictionary[js.Function1[/* v */ js.Any, String]]
  type IDebug = Debug
  type IDebugger = Debugger
}
