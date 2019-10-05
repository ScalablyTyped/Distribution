package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cassandraDashDriverMod {
  import typings.cassandraDashDriver.cassandraDashDriverMod.types.ResultSet
  import typings.std.Error

  type Callback = js.Function
  type ExecutionProfile = ExecutionProfileOptions
  type ResultCallback = js.Function2[/* err */ Error, /* result */ ResultSet, Unit]
}
