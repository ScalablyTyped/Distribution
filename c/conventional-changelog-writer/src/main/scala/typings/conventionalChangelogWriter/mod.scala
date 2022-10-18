package typings.conventionalChangelogWriter

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
  inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: Unit, options: Options[TCommit, TContext]): Transform = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: Partial[TContext]): Transform = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: Partial[TContext], options: Options[TCommit, TContext]): Transform = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @JSImport("conventional-changelog-writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CommitGroup[T /* <: Commit[String | Double | js.Symbol] */] extends StObject {
    
    var commits: js.Array[TransformedCommit[T]]
    
    var title: String | `false`
  }
  object CommitGroup {
    
    inline def apply[T /* <: Commit[String | Double | js.Symbol] */](commits: js.Array[TransformedCommit[T]], title: String | `false`): CommitGroup[T] = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitGroup[T]]
    }
    
    extension [Self <: CommitGroup[?], T /* <: Commit[String | Double | js.Symbol] */](x: Self & CommitGroup[T]) {
      
      inline def setCommits(value: js.Array[TransformedCommit[T]]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      inline def setCommitsVarargs(value: TransformedCommit[T]*): Self = StObject.set(x, "commits", js.Array(value*))
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    /**
      * Commit keyword in the url if `context.linkReferences === true`.
      *
      * @default
      * 'commits'
      */
    var commit: String
    
    /**
      * Default to formatted (`'yyyy-mm-dd'`) today's date. [dateformat](https://github.com/felixge/node-dateformat)
      * is used for formatting the date. If `version` is found in the last commit,
      * `committerDate` will overwrite this.
      *
      * @default
      * dateFormat(new Date(), 'yyyy-mm-dd', true)
      */
    var date: String
    
    /**
      * The hosting website. Eg: `'https://github.com'` or `'https://bitbucket.org'`.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * By default, this value is true if `version`'s patch is `0`.
      *
      * @default
      * semver.patch(context.version) !== 0
      */
    var isPatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Issue or pull request keyword in the url if `context.linkReferences === true`.
      *
      * @default
      * 'issues'
      */
    var issue: String
    
    /**
      * Should all references be linked?
      *
      * @defaults
      * `true` if (`context.repository` or `context.repoUrl`), `context.commit` and
      * `context.issue` are truthy.
      */
    var linkReferences: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The owner of the repository. Eg: `'stevemao'`.
      */
    var owner: js.UndefOr[String] = js.undefined
    
    /**
      * The whole repository url. Eg: `'https://github.com/conventional-changelog/conventional-changelog-writer'`.
      * The should be used as a fallback when `context.repository` doesn't exist.
      */
    var repoUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The repository name on `host`. Eg: `'conventional-changelog-writer'`.
      */
    var repository: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Version number of the up-coming release. If `version` is found in the last
      * commit before generating logs, it will be overwritten.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object Context {
    
    inline def apply(commit: String, date: String, issue: String): Context = {
      val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIsPatch(value: Boolean): Self = StObject.set(x, "isPatch", value.asInstanceOf[js.Any])
      
      inline def setIsPatchUndefined: Self = StObject.set(x, "isPatch", js.undefined)
      
      inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setLinkReferences(value: Boolean): Self = StObject.set(x, "linkReferences", value.asInstanceOf[js.Any])
      
      inline def setLinkReferencesUndefined: Self = StObject.set(x, "linkReferences", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setRepoUrl(value: String): Self = StObject.set(x, "repoUrl", value.asInstanceOf[js.Any])
      
      inline def setRepoUrlUndefined: Self = StObject.set(x, "repoUrl", js.undefined)
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  object GeneratedContext {
    
    trait ExtraContext[T /* <: Commit[String | Double | js.Symbol] */] extends StObject {
      
      /**
        * @default
        * []
        */
      var commitGroups: js.Array[CommitGroup[T]]
      
      /**
        * @default
        * []
        */
      var noteGroups: js.Array[NoteGroup]
    }
    object ExtraContext {
      
      inline def apply[T /* <: Commit[String | Double | js.Symbol] */](commitGroups: js.Array[CommitGroup[T]], noteGroups: js.Array[NoteGroup]): ExtraContext[T] = {
        val __obj = js.Dynamic.literal(commitGroups = commitGroups.asInstanceOf[js.Any], noteGroups = noteGroups.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtraContext[T]]
      }
      
      extension [Self <: ExtraContext[?], T /* <: Commit[String | Double | js.Symbol] */](x: Self & ExtraContext[T]) {
        
        inline def setCommitGroups(value: js.Array[CommitGroup[T]]): Self = StObject.set(x, "commitGroups", value.asInstanceOf[js.Any])
        
        inline def setCommitGroupsVarargs(value: CommitGroup[T]*): Self = StObject.set(x, "commitGroups", js.Array(value*))
        
        inline def setNoteGroups(value: js.Array[NoteGroup]): Self = StObject.set(x, "noteGroups", value.asInstanceOf[js.Any])
        
        inline def setNoteGroupsVarargs(value: NoteGroup*): Self = StObject.set(x, "noteGroups", js.Array(value*))
      }
    }
  }
  type GeneratedContext[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] = TContext & TransformedCommit[TCommit] & ExtraContext[TCommit]
  
  trait NoteGroup extends StObject {
    
    var commits: js.Array[Note]
    
    var title: String | `false`
  }
  object NoteGroup {
    
    inline def apply(commits: js.Array[Note], title: String | `false`): NoteGroup = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoteGroup]
    }
    
    extension [Self <: NoteGroup](x: Self) {
      
      inline def setCommits(value: js.Array[Note]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      inline def setCommitsVarargs(value: Note*): Self = StObject.set(x, "commits", js.Array(value*))
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ P in std.Exclude<keyof T, K> ]: T[P]}
    }}}
    */
  type Omit[T, K /* <: String | Double | js.Symbol */] = T
  
  trait Options[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] extends StObject {
    
    /**
      * A compare function used to sort commit groups. If it's a string or array, it
      * sorts on the property(ies) by `localeCompare`. Will not sort if this is a
      * falsy value.
      *
      * The string can be a dot path to a nested object property.
      */
    var commitGroupsSort: js.UndefOr[Sort[CommitGroup[TCommit]]] = js.undefined
    
    /**
      * @defaults
      * [commit.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/commit.hbs)
      */
    var commitPartial: js.UndefOr[String] = js.undefined
    
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
    var commitsSort: js.UndefOr[Sort[TransformedCommit[TCommit]]] = js.undefined
    
    /**
      * A function to get debug information.
      *
      * @default
      * function () {}
      */
    var debug: js.UndefOr[js.Function1[/* message */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * If `true`, the stream will flush out the last bit of commits (could be empty)
      * to changelog.
      *
      * @default
      * true
      */
    var doFlush: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Last chance to modify your context before generating a changelog.
      *
      * @defaults
      * Pass through.
      */
    var finalizeContext: js.UndefOr[FinalizeContext[TContext, TCommit]] = js.undefined
    
    /**
      * @defaults
      * [footer.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/footer.hbs)
      */
    var footerPartial: js.UndefOr[String] = js.undefined
    
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
    var generateOn: js.UndefOr[GenerateOn[TContext, TCommit]] = js.undefined
    
    /**
      * How to group the commits. EG: based on the same type. If this value is falsy,
      * commits are not grouped.
      *
      * @default
      * 'type'
      */
    var groupBy: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * @defaults
      * [header.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/header.hbs)
      */
    var headerPartial: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, reverted commits will be ignored.
      *
      * @default
      * true
      */
    var ignoreReverted: js.UndefOr[Boolean] = js.undefined
    
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
    var includeDetails: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The main handlebars template.
      *
      * @defaults
      * [template.hbs](https://github.com/conventional-changelog/conventional-changelog/blob/master/packages/conventional-changelog-writer/templates/template.hbs)
      */
    var mainTemplate: js.UndefOr[String] = js.undefined
    
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
    var noteGroupsSort: js.UndefOr[Sort[NoteGroup]] = js.undefined
    
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
    var notesSort: js.UndefOr[Sort[Note]] = js.undefined
    
    /**
      * Partials that used in the main template, if any. The key should be the
      * partial name and the value should be handlebars template strings. If you are
      * using handlebars template files, read files by yourself.
      */
    var partials: js.UndefOr[Record[String, String]] = js.undefined
    
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
    var reverse: js.UndefOr[Boolean] = js.undefined
    
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
    var transform: js.UndefOr[typings.conventionalChangelogWriter.mod.Options.Transform[TCommit, TContext]] = js.undefined
  }
  object Options {
    
    inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](): Options[TCommit, TContext] = {
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
    
    extension [Self <: Options[?, ?], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](x: Self & (Options[TCommit, TContext])) {
      
      inline def setCommitGroupsSort(value: Sort[CommitGroup[TCommit]]): Self = StObject.set(x, "commitGroupsSort", value.asInstanceOf[js.Any])
      
      inline def setCommitGroupsSortUndefined: Self = StObject.set(x, "commitGroupsSort", js.undefined)
      
      inline def setCommitGroupsSortVarargs(value: String*): Self = StObject.set(x, "commitGroupsSort", js.Array(value*))
      
      inline def setCommitPartial(value: String): Self = StObject.set(x, "commitPartial", value.asInstanceOf[js.Any])
      
      inline def setCommitPartialUndefined: Self = StObject.set(x, "commitPartial", js.undefined)
      
      inline def setCommitsSort(value: Sort[TransformedCommit[TCommit]]): Self = StObject.set(x, "commitsSort", value.asInstanceOf[js.Any])
      
      inline def setCommitsSortUndefined: Self = StObject.set(x, "commitsSort", js.undefined)
      
      inline def setCommitsSortVarargs(value: String*): Self = StObject.set(x, "commitsSort", js.Array(value*))
      
      inline def setDebug(value: /* message */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDoFlush(value: Boolean): Self = StObject.set(x, "doFlush", value.asInstanceOf[js.Any])
      
      inline def setDoFlushUndefined: Self = StObject.set(x, "doFlush", js.undefined)
      
      inline def setFinalizeContext(
        value: (/* context */ GeneratedContext[TCommit, TContext], /* options */ Options[TCommit, TContext], /* commits */ js.Array[TransformedCommit[TCommit]], /* keyCommit */ TransformedCommit[TCommit]) => GeneratedContext[TCommit, TContext]
      ): Self = StObject.set(x, "finalizeContext", js.Any.fromFunction4(value))
      
      inline def setFinalizeContextUndefined: Self = StObject.set(x, "finalizeContext", js.undefined)
      
      inline def setFooterPartial(value: String): Self = StObject.set(x, "footerPartial", value.asInstanceOf[js.Any])
      
      inline def setFooterPartialUndefined: Self = StObject.set(x, "footerPartial", js.undefined)
      
      inline def setGenerateOn(value: GenerateOn[TContext, TCommit]): Self = StObject.set(x, "generateOn", value.asInstanceOf[js.Any])
      
      inline def setGenerateOnUndefined: Self = StObject.set(x, "generateOn", js.undefined)
      
      inline def setGroupBy(value: String | `false`): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setHeaderPartial(value: String): Self = StObject.set(x, "headerPartial", value.asInstanceOf[js.Any])
      
      inline def setHeaderPartialUndefined: Self = StObject.set(x, "headerPartial", js.undefined)
      
      inline def setIgnoreReverted(value: Boolean): Self = StObject.set(x, "ignoreReverted", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRevertedUndefined: Self = StObject.set(x, "ignoreReverted", js.undefined)
      
      inline def setIncludeDetails(value: Boolean): Self = StObject.set(x, "includeDetails", value.asInstanceOf[js.Any])
      
      inline def setIncludeDetailsUndefined: Self = StObject.set(x, "includeDetails", js.undefined)
      
      inline def setMainTemplate(value: String): Self = StObject.set(x, "mainTemplate", value.asInstanceOf[js.Any])
      
      inline def setMainTemplateUndefined: Self = StObject.set(x, "mainTemplate", js.undefined)
      
      inline def setNoteGroupsSort(value: Sort[NoteGroup]): Self = StObject.set(x, "noteGroupsSort", value.asInstanceOf[js.Any])
      
      inline def setNoteGroupsSortUndefined: Self = StObject.set(x, "noteGroupsSort", js.undefined)
      
      inline def setNoteGroupsSortVarargs(value: String*): Self = StObject.set(x, "noteGroupsSort", js.Array(value*))
      
      inline def setNotesSort(value: Sort[Note]): Self = StObject.set(x, "notesSort", value.asInstanceOf[js.Any])
      
      inline def setNotesSortUndefined: Self = StObject.set(x, "notesSort", js.undefined)
      
      inline def setNotesSortVarargs(value: String*): Self = StObject.set(x, "notesSort", js.Array(value*))
      
      inline def setPartials(value: Record[String, String]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTransform(value: typings.conventionalChangelogWriter.mod.Options.Transform[TCommit, TContext]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
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
  
  type TransformedCommit[T /* <: Commit[String | Double | js.Symbol] */] = (Omit[T, raw]) & Raw[T]
}
