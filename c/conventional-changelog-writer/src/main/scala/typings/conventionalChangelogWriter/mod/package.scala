package typings.conventionalChangelogWriter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeneratedContext[TCommit /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = TContext with typings.conventionalChangelogWriter.mod.TransformedCommit[TCommit] with typings.conventionalChangelogWriter.mod.GeneratedContext.ExtraContext[TCommit]
  type Omit[T, K /* <: java.lang.String | scala.Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, K> ]: T[P]}
    */ typings.conventionalChangelogWriter.conventionalChangelogWriterStrings.Omit with T
  type Options[TCommit /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias conventional-changelog-writer.conventional-changelog-writer.Options<TCommit, TContext> */ js.Object
  type TransformedCommit[T /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */] = (typings.conventionalChangelogWriter.mod.Omit[T, typings.conventionalChangelogWriter.conventionalChangelogWriterStrings.raw]) with typings.conventionalChangelogWriter.AnonRaw[T]
}
