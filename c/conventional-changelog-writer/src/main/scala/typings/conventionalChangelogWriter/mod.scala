package typings.conventionalChangelogWriter

import org.scalablytyped.runtime.TopLevel
import typings.conventionalChangelogWriter.anon.Raw
import typings.conventionalChangelogWriter.conventionalChangelogWriterBooleans.`false`
import typings.conventionalChangelogWriter.conventionalChangelogWriterStrings.raw
import typings.conventionalChangelogWriter.mod.GeneratedContext.ExtraContext
import typings.conventionalChangelogWriter.mod.Options.FinalizeContext
import typings.conventionalChangelogWriter.mod.Options.GenerateOn
import typings.conventionalChangelogWriter.mod.Options.Sort
import typings.conventionalCommitsParser.mod.Commit
import typings.conventionalCommitsParser.mod.Commit.Note
import typings.node.streamMod.Transform
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a transform stream.
    *
    * @param context Variables that will be interpolated to the template. This
    *                object contains, but not limits to the following fields.
    * @param options
    */
  // tslint:disable-next-line no-unnecessary-generics
  @JSImport("conventional-changelog-writer", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](): Transform = js.native
  @JSImport("conventional-changelog-writer", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: js.UndefOr[scala.Nothing], options: Options[TCommit, TContext]): Transform = js.native
  @JSImport("conventional-changelog-writer", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: Partial[TContext]): Transform = js.native
  @JSImport("conventional-changelog-writer", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: Partial[TContext], options: Options[TCommit, TContext]): Transform = js.native
  
  @js.native
  trait CommitGroup[T /* <: Commit[String | Double | js.Symbol] */] extends StObject {
    
    var commits: js.Array[TransformedCommit[T]] = js.native
    
    var title: String | `false` = js.native
  }
  object CommitGroup {
    
    @scala.inline
    def apply[T /* <: Commit[String | Double | js.Symbol] */](commits: js.Array[TransformedCommit[T]], title: String | `false`): CommitGroup[T] = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitGroup[T]]
    }
    
    @scala.inline
    implicit class CommitGroupMutableBuilder[Self <: CommitGroup[_], T /* <: Commit[String | Double | js.Symbol] */] (val x: Self with CommitGroup[T]) extends AnyVal {
      
      @scala.inline
      def setCommits(value: js.Array[TransformedCommit[T]]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitsVarargs(value: TransformedCommit[T]*): Self = StObject.set(x, "commits", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    /**
      * Commit keyword in the url if `context.linkReferences === true`.
      *
      * @default
      * 'commits'
      */
    var commit: String = js.native
    
    /**
      * Default to formatted (`'yyyy-mm-dd'`) today's date. [dateformat](https://github.com/felixge/node-dateformat)
      * is used for formatting the date. If `version` is found in the last commit,
      * `committerDate` will overwrite this.
      *
      * @default
      * dateFormat(new Date(), 'yyyy-mm-dd', true)
      */
    var date: String = js.native
    
    /**
      * The hosting website. Eg: `'https://github.com'` or `'https://bitbucket.org'`.
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * By default, this value is true if `version`'s patch is `0`.
      *
      * @default
      * semver.patch(context.version) !== 0
      */
    var isPatch: js.UndefOr[Boolean] = js.native
    
    /**
      * Issue or pull request keyword in the url if `context.linkReferences === true`.
      *
      * @default
      * 'issues'
      */
    var issue: String = js.native
    
    /**
      * Should all references be linked?
      *
      * @defaults
      * `true` if (`context.repository` or `context.repoUrl`), `context.commit` and
      * `context.issue` are truthy.
      */
    var linkReferences: js.UndefOr[Boolean] = js.native
    
    /**
      * The owner of the repository. Eg: `'stevemao'`.
      */
    var owner: js.UndefOr[String] = js.native
    
    /**
      * The whole repository url. Eg: `'https://github.com/conventional-changelog/conventional-changelog-writer'`.
      * The should be used as a fallback when `context.repository` doesn't exist.
      */
    var repoUrl: js.UndefOr[String] = js.native
    
    /**
      * The repository name on `host`. Eg: `'conventional-changelog-writer'`.
      */
    var repository: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    /**
      * Version number of the up-coming release. If `version` is found in the last
      * commit before generating logs, it will be overwritten.
      */
    var version: js.UndefOr[String] = js.native
  }
  object Context {
    
    @scala.inline
    def apply(commit: String, date: String, issue: String): Context = {
      val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIsPatch(value: Boolean): Self = StObject.set(x, "isPatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPatchUndefined: Self = StObject.set(x, "isPatch", js.undefined)
      
      @scala.inline
      def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkReferences(value: Boolean): Self = StObject.set(x, "linkReferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkReferencesUndefined: Self = StObject.set(x, "linkReferences", js.undefined)
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setRepoUrl(value: String): Self = StObject.set(x, "repoUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepoUrlUndefined: Self = StObject.set(x, "repoUrl", js.undefined)
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  object GeneratedContext {
    
    @js.native
    trait ExtraContext[T /* <: Commit[String | Double | js.Symbol] */] extends StObject {
      
      /**
        * @default
        * []
        */
      var commitGroups: js.Array[CommitGroup[T]] = js.native
      
      /**
        * @default
        * []
        */
      var noteGroups: js.Array[NoteGroup] = js.native
    }
    object ExtraContext {
      
      @scala.inline
      def apply[T /* <: Commit[String | Double | js.Symbol] */](commitGroups: js.Array[CommitGroup[T]], noteGroups: js.Array[NoteGroup]): ExtraContext[T] = {
        val __obj = js.Dynamic.literal(commitGroups = commitGroups.asInstanceOf[js.Any], noteGroups = noteGroups.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtraContext[T]]
      }
      
      @scala.inline
      implicit class ExtraContextMutableBuilder[Self <: ExtraContext[_], T /* <: Commit[String | Double | js.Symbol] */] (val x: Self with ExtraContext[T]) extends AnyVal {
        
        @scala.inline
        def setCommitGroups(value: js.Array[CommitGroup[T]]): Self = StObject.set(x, "commitGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommitGroupsVarargs(value: CommitGroup[T]*): Self = StObject.set(x, "commitGroups", js.Array(value :_*))
        
        @scala.inline
        def setNoteGroups(value: js.Array[NoteGroup]): Self = StObject.set(x, "noteGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteGroupsVarargs(value: NoteGroup*): Self = StObject.set(x, "noteGroups", js.Array(value :_*))
      }
    }
  }
  type GeneratedContext[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = TContext with TransformedCommit[TCommit] with ExtraContext[TCommit]
  
  @js.native
  trait NoteGroup extends StObject {
    
    var commits: js.Array[Note] = js.native
    
    var title: String | `false` = js.native
  }
  object NoteGroup {
    
    @scala.inline
    def apply(commits: js.Array[Note], title: String | `false`): NoteGroup = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoteGroup]
    }
    
    @scala.inline
    implicit class NoteGroupMutableBuilder[Self <: NoteGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommits(value: js.Array[Note]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitsVarargs(value: Note*): Self = StObject.set(x, "commits", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Omit[T, K /* <: String | Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, K> ]: T[P]}
    */ typings.conventionalChangelogWriter.conventionalChangelogWriterStrings.Omit with TopLevel[T]
  
  @js.native
  trait Options[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] extends StObject {
    
    /**
      * A compare function used to sort commit groups. If it's a string or array, it
      * sorts on the property(ies) by `localeCompare`. Will not sort if this is a
      * falsy value.
      *
      * The string can be a dot path to a nested object property.
      */
    var commitGroupsSort: js.UndefOr[Sort[CommitGroup[TCommit]]] = js.native
    
    /**
      * @defaults
      * [commit.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/commit.hbs)
      */
    var commitPartial: js.UndefOr[String] = js.native
    
    /**
      * A compare function used to sort commits. If it's a string or array, it sorts
      * on the property(ies) by `localeCompare`. Will not sort if this is a falsy
      * value.
      *
      * The string can be a dot path to a nested object property.
      *
      * @default
      * 'header'
      */
    var commitsSort: js.UndefOr[Sort[TransformedCommit[TCommit]]] = js.native
    
    /**
      * A function to get debug information.
      *
      * @default
      * function () {}
      */
    var debug: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], Unit]] = js.native
    
    /**
      * If `true`, the stream will flush out the last bit of commits (could be empty)
      * to changelog.
      *
      * @default
      * true
      */
    var doFlush: js.UndefOr[Boolean] = js.native
    
    /**
      * Last chance to modify your context before generating a changelog.
      *
      * @defaults
      * Pass through.
      */
    var finalizeContext: js.UndefOr[FinalizeContext[TContext, TCommit]] = js.native
    
    /**
      * @defaults
      * [footer.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/footer.hbs)
      */
    var footerPartial: js.UndefOr[String] = js.native
    
    /**
      * When the upstream finishes pouring the commits it will generate a block of
      * logs if `doFlush` is `true`. However, you can generate more than one block
      * based on this criteria (usually a version) even if there are still commits
      * from the upstream.
      *
      * @remarks
      * It checks on the transformed commit chunk instead of the original one (you
      * can check on the original by access the `raw` object on the `commit`).
      * However, if the transformed commit is ignored it falls back to the original
      * commit.
      *
      * @remarks
      * If this value is a `string`, it checks the existence of the field. Set to
      * other type to disable it.
      *
      * @defaults
      * If `commit.version` is a valid semver.
      */
    var generateOn: js.UndefOr[GenerateOn[TContext, TCommit]] = js.native
    
    /**
      * How to group the commits. EG: based on the same type. If this value is falsy,
      * commits are not grouped.
      *
      * @default
      * 'type'
      */
    var groupBy: js.UndefOr[String | `false`] = js.native
    
    /**
      * @defaults
      * [header.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/header.hbs)
      */
    var headerPartial: js.UndefOr[String] = js.native
    
    /**
      * If `true`, reverted commits will be ignored.
      *
      * @default
      * true
      */
    var ignoreReverted: js.UndefOr[Boolean] = js.native
    
    /**
      * If this value is `true`, instead of emitting strings of changelog, it emits
      * objects containing the details the block.
      *
      * @remarks
      * The downstream must be in object mode if this is `true`.
      *
      * @default
      * false
      */
    var includeDetails: js.UndefOr[Boolean] = js.native
    
    /**
      * The main handlebars template.
      *
      * @defaults
      * [template.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/template.hbs)
      */
    var mainTemplate: js.UndefOr[String] = js.native
    
    /**
      * A compare function used to sort note groups. If it's a string or array, it
      * sorts on the property(ies) by `localeCompare`. Will not sort if this is a
      * falsy value.
      *
      * The string can be a dot path to a nested object property.
      *
      * @default
      * 'title'
      */
    var noteGroupsSort: js.UndefOr[Sort[NoteGroup]] = js.native
    
    /**
      * A compare function used to sort note groups. If it's a string or array, it
      * sorts on the property(ies) by `localeCompare`. Will not sort if this is a
      * falsy value.
      *
      * The string can be a dot path to a nested object property.
      *
      * @default
      * 'text'
      */
    var notesSort: js.UndefOr[Sort[Note]] = js.native
    
    /**
      * Partials that used in the main template, if any. The key should be the
      * partial name and the value should be handlebars template strings. If you are
      * using handlebars template files, read files by yourself.
      */
    var partials: js.UndefOr[Record[String, String]] = js.native
    
    /**
      * The normal order means reverse chronological order. `reverse` order means
      * chronological order. Are the commits from upstream in the reverse order? You
      * should only worry about this when generating more than one blocks of logs
      * based on `generateOn`. If you find the last commit is in the wrong block
      * inverse this value.
      *
      * @default
      * false
      */
    var reverse: js.UndefOr[Boolean] = js.native
    
    /**
      * Replace with new values in each commit.
      *
      * If this is an object, the keys are paths to a nested object property. the
      * values can be a string (static) and a function (dynamic) with the old value
      * and path passed as arguments. This value is merged with your own transform
      * object.
      *
      * If this is a function, the commit chunk will be passed as the argument and
      * the returned value would be the new commit object. This is a handy function
      * if you can't provide a transform stream as an upstream of this one. If
      * returns a falsy value this commit is ignored.
      *
      * A `raw` object that is originally poured form upstream is attached to `commit`.
      */
    var transform: js.UndefOr[typings.conventionalChangelogWriter.mod.Options.Transform[TCommit, TContext]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](): Options[TCommit, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TCommit, TContext]]
    }
    
    type FinalizeContext[TContext /* <: Context */, TCommit /* <: Commit[String | Double | js.Symbol] */] = js.Function4[
        /* context */ GeneratedContext[TCommit, TContext], 
        /* options */ Options[TCommit, TContext], 
        /* commits */ js.Array[TransformedCommit[TCommit]], 
        /* keyCommit */ TransformedCommit[TCommit], 
        GeneratedContext[TCommit, TContext]
      ]
    
    object GenerateOn {
      
      type FunctionType[TContext /* <: Context */, TCommit /* <: Commit[String | Double | js.Symbol] */] = js.Function4[
            /* commit */ TransformedCommit[TCommit], 
            /* commits */ js.Array[TransformedCommit[TCommit]], 
            /* context */ GeneratedContext[TCommit, TContext], 
            /* options */ Options[TCommit, TContext], 
            Boolean
          ]
    }
    type GenerateOn[TContext /* <: Context */, TCommit /* <: Commit[String | Double | js.Symbol] */] = js.Function | String | js.Object
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] (val x: Self with (Options[TCommit, TContext])) extends AnyVal {
      
      @scala.inline
      def setCommitGroupsSort(value: Sort[CommitGroup[TCommit]]): Self = StObject.set(x, "commitGroupsSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitGroupsSortUndefined: Self = StObject.set(x, "commitGroupsSort", js.undefined)
      
      @scala.inline
      def setCommitGroupsSortVarargs(value: String*): Self = StObject.set(x, "commitGroupsSort", js.Array(value :_*))
      
      @scala.inline
      def setCommitPartial(value: String): Self = StObject.set(x, "commitPartial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitPartialUndefined: Self = StObject.set(x, "commitPartial", js.undefined)
      
      @scala.inline
      def setCommitsSort(value: Sort[TransformedCommit[TCommit]]): Self = StObject.set(x, "commitsSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitsSortUndefined: Self = StObject.set(x, "commitsSort", js.undefined)
      
      @scala.inline
      def setCommitsSortVarargs(value: String*): Self = StObject.set(x, "commitsSort", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: /* message */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDoFlush(value: Boolean): Self = StObject.set(x, "doFlush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoFlushUndefined: Self = StObject.set(x, "doFlush", js.undefined)
      
      @scala.inline
      def setFinalizeContext(
        value: (/* context */ GeneratedContext[TCommit, TContext], /* options */ Options[TCommit, TContext], /* commits */ js.Array[TransformedCommit[TCommit]], /* keyCommit */ TransformedCommit[TCommit]) => GeneratedContext[TCommit, TContext]
      ): Self = StObject.set(x, "finalizeContext", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFinalizeContextUndefined: Self = StObject.set(x, "finalizeContext", js.undefined)
      
      @scala.inline
      def setFooterPartial(value: String): Self = StObject.set(x, "footerPartial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterPartialUndefined: Self = StObject.set(x, "footerPartial", js.undefined)
      
      @scala.inline
      def setGenerateOn(value: GenerateOn[TContext, TCommit]): Self = StObject.set(x, "generateOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateOnUndefined: Self = StObject.set(x, "generateOn", js.undefined)
      
      @scala.inline
      def setGroupBy(value: String | `false`): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setHeaderPartial(value: String): Self = StObject.set(x, "headerPartial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPartialUndefined: Self = StObject.set(x, "headerPartial", js.undefined)
      
      @scala.inline
      def setIgnoreReverted(value: Boolean): Self = StObject.set(x, "ignoreReverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRevertedUndefined: Self = StObject.set(x, "ignoreReverted", js.undefined)
      
      @scala.inline
      def setIncludeDetails(value: Boolean): Self = StObject.set(x, "includeDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDetailsUndefined: Self = StObject.set(x, "includeDetails", js.undefined)
      
      @scala.inline
      def setMainTemplate(value: String): Self = StObject.set(x, "mainTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainTemplateUndefined: Self = StObject.set(x, "mainTemplate", js.undefined)
      
      @scala.inline
      def setNoteGroupsSort(value: Sort[NoteGroup]): Self = StObject.set(x, "noteGroupsSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoteGroupsSortUndefined: Self = StObject.set(x, "noteGroupsSort", js.undefined)
      
      @scala.inline
      def setNoteGroupsSortVarargs(value: String*): Self = StObject.set(x, "noteGroupsSort", js.Array(value :_*))
      
      @scala.inline
      def setNotesSort(value: Sort[Note]): Self = StObject.set(x, "notesSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesSortUndefined: Self = StObject.set(x, "notesSort", js.undefined)
      
      @scala.inline
      def setNotesSortVarargs(value: String*): Self = StObject.set(x, "notesSort", js.Array(value :_*))
      
      @scala.inline
      def setPartials(value: Record[String, String]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setTransform(value: typings.conventionalChangelogWriter.mod.Options.Transform[TCommit, TContext]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
    
    object Sort {
      
      type FunctionType[T] = js.Function2[/* a */ T, /* b */ T, Double]
    }
    type Sort[T] = js.Function | String | js.Array[String] | `false`
    
    object Transform {
      
      type FunctionType[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = js.Function2[
            /* commit */ Commit[String | Double | js.Symbol], 
            /* context */ TContext, 
            TCommit | `false`
          ]
      
      object ObjectType {
        
        type FunctionType[T] = js.Function2[/* value */ T, /* path */ String, T]
      }
      type ObjectType = Record[String, js.Object | js.Function]
    }
    type Transform[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = js.Object | js.Function
  }
  
  type TransformedCommit[T /* <: Commit[String | Double | js.Symbol] */] = (Omit[T, raw]) with Raw[T]
}
