package typings.conventionalChangelogWriter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GeneratedContext[TCommit /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = TContext with typings.conventionalChangelogWriter.mod.TransformedCommit[TCommit] with typings.conventionalChangelogWriter.mod.GeneratedContext.ExtraContext[TCommit]
  
  type Omit[T, K /* <: java.lang.String | scala.Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, K> ]: T[P]}
    */ typings.conventionalChangelogWriter.conventionalChangelogWriterStrings.Omit with org.scalablytyped.runtime.TopLevel[T]
  
  type TransformedCommit[T /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */] = (typings.conventionalChangelogWriter.mod.Omit[T, typings.conventionalChangelogWriter.conventionalChangelogWriterStrings.raw]) with typings.conventionalChangelogWriter.anon.Raw[T]
}
