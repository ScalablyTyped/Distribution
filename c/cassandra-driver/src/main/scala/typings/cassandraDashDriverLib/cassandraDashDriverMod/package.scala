package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cassandraDashDriverMod {
  type Callback = js.Function
  type ExecutionProfile = ExecutionProfileOptions
  type ResultCallback = js.Function2[
    /* err */ stdLib.Error, 
    /* result */ cassandraDashDriverLib.cassandraDashDriverMod.typesNs.ResultSet, 
    scala.Unit
  ]
}
