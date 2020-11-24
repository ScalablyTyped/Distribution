package typings.conventionalChangelogCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Options {
  
  // tslint:disable-next-line max-line-length
  type Config[TCommit /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = js.Promise[js.Object] | js.Function | js.Object
  
  type Logger = js.Function1[/* message */ js.UndefOr[js.Any], scala.Unit]
  
  type Transform[T /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */] = js.ThisFunction2[
    /* this */ typings.node.streamMod.Transform, 
    /* commit */ typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol], 
    /* cb */ typings.conventionalChangelogCore.mod.Options.Transform.Callback[T], 
    scala.Unit
  ]
}
