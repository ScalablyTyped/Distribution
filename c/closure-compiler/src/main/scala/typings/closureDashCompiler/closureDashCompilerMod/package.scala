package typings.closureDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object closureDashCompilerMod {
  import typings.std.Error

  type Callback = js.Function3[/* err */ Error, /* stdout */ String, /* stderr */ String, js.Any]
}
