package typings.cassandraDashDriver

import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.ResultSet
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cassandraDashDriverMod {
  type Callback = js.Function
  type ExecutionProfile = ExecutionProfileOptions
  type ResultCallback = js.Function2[/* err */ Error, /* result */ ResultSet, Unit]
}
