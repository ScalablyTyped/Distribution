package typings.conventionalChangelogCore.mod.Options

import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("conventional-changelog-core", "Options.Transform")
@js.native
object Transform extends js.Object {
  
  type Callback[T /* <: Commit[String | Double | js.Symbol] */] = js.Function2[/* error */ js.Any, /* commit */ T, Unit]
}
