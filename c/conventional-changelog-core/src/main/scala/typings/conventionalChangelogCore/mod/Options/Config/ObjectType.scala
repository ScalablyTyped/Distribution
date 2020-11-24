package typings.conventionalChangelogCore.mod.Options.Config

import typings.conventionalChangelogCore.mod.GitRawCommitsOptions
import typings.conventionalChangelogCore.mod.ParserOptions
import typings.conventionalChangelogCore.mod.WriterOptions
import typings.conventionalChangelogWriter.mod.Context
import typings.conventionalCommitsParser.mod.Commit
import typings.conventionalRecommendedBump.mod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectType[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] extends js.Object {
  
  var context: js.UndefOr[Partial[TContext]] = js.native
  
  var gitRawCommitsOpts: js.UndefOr[GitRawCommitsOptions] = js.native
  
  var parserOpts: js.UndefOr[ParserOptions] = js.native
  
  var recommendedBumpOpts: js.UndefOr[Options] = js.native
  
  var writerOpts: js.UndefOr[WriterOptions[TCommit, TContext]] = js.native
}
object ObjectType {
  
  @scala.inline
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](): ObjectType[TCommit, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectType[TCommit, TContext]]
  }
  
  @scala.inline
  implicit class ObjectTypeOps[Self <: ObjectType[_, _], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] (val x: Self with (ObjectType[TCommit, TContext])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: Partial[TContext]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setGitRawCommitsOpts(value: GitRawCommitsOptions): Self = this.set("gitRawCommitsOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitRawCommitsOpts: Self = this.set("gitRawCommitsOpts", js.undefined)
    
    @scala.inline
    def setParserOpts(value: ParserOptions): Self = this.set("parserOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParserOpts: Self = this.set("parserOpts", js.undefined)
    
    @scala.inline
    def setRecommendedBumpOpts(value: Options): Self = this.set("recommendedBumpOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendedBumpOpts: Self = this.set("recommendedBumpOpts", js.undefined)
    
    @scala.inline
    def setWriterOpts(value: WriterOptions[TCommit, TContext]): Self = this.set("writerOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriterOpts: Self = this.set("writerOpts", js.undefined)
  }
}
