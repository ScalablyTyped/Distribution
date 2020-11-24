package typings.conventionalChangelogCore.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Config {
  
  type FunctionType[TCommit /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = js.Function1[
    /* callback */ typings.conventionalChangelogCore.mod.Options.Config.FunctionType.Callback[TCommit, TContext], 
    scala.Unit
  ]
}
