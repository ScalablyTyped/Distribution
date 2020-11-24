package typings.conventionalChangelogCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MergedContext[T /* <: typings.conventionalChangelogWriter.mod.Context */] = T with typings.conventionalChangelogCore.mod.MergedContext.ExtraContext
  
  type Options[TCommit /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = typings.conventionalChangelogCore.mod.Options_[TCommit, TContext]
}
