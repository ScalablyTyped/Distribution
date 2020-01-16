package typings.conventionalDashChangelogDashWriter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object conventionalDashChangelogDashWriterMod {
  import typings.conventionalDashChangelogDashWriter.Anon_Raw
  import typings.conventionalDashChangelogDashWriter.conventionalDashChangelogDashWriterMod.GeneratedContext.ExtraContext
  import typings.conventionalDashChangelogDashWriter.conventionalDashChangelogDashWriterStrings.raw
  import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Commit

  type GeneratedContext[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = TContext with TransformedCommit[TCommit] with ExtraContext[TCommit]
  type Omit[T, K /* <: String | Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, K> ]: T[P]}
    */ typings.conventionalDashChangelogDashWriter.conventionalDashChangelogDashWriterStrings.Omit with T
  type Options[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias conventional-changelog-writer.conventional-changelog-writer.Options<TCommit, TContext> */ js.Object
  type TransformedCommit[T /* <: Commit[String | Double | js.Symbol] */] = (Omit[T, raw]) with Anon_Raw[T]
}
