package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cassandraDashDriverMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type ArrayOrObject = js.Array[js.Any] | StringDictionary[js.Any]
  type EmptyCallback = js.Function1[/* err */ Error, Unit]
  type ValueCallback[T] = js.Function2[/* err */ Error, /* val */ T, Unit]
}
