package typings.conventionalChangelogCore.mod.Options.Config

import typings.conventionalChangelogWriter.mod.Context
import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("conventional-changelog-core", "Options.Config.FunctionType")
@js.native
object FunctionType extends js.Object {
  
  type Callback[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = js.Function2[/* error */ js.Any, /* config */ ObjectType[TCommit, TContext], Unit]
}
