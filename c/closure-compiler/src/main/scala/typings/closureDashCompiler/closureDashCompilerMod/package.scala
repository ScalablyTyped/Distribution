package typings.closureDashCompiler

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object closureDashCompilerMod {
  type Callback = js.Function3[/* err */ Error, /* stdout */ String, /* stderr */ String, js.Any]
}
