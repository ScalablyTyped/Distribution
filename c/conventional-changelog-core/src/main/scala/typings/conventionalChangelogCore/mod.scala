package typings.conventionalChangelogCore

import typings.conventionalChangelogCore.anon.ReadonlyPartialPackage
import typings.conventionalChangelogCore.mod.MergedContext.ExtraContext
import typings.conventionalChangelogCore.mod.Options.Config
import typings.conventionalChangelogCore.mod.Options.Config.FunctionType.Callback
import typings.conventionalChangelogCore.mod.Options.Logger
import typings.conventionalChangelogCore.mod.Options.Pkg
import typings.conventionalChangelogCore.mod.Options.Transform
import typings.conventionalCommitsParser.mod.Commit
import typings.gitRawCommits.mod.ExecOptions
import typings.gitRawCommits.mod.GitOptions
import typings.node.streamMod.Readable
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a readable stream.
    *
    * @param options
    * @param context
    * @param gitRawCommitsOpts
    * @param parserOpts
    * @param writerOpts
    */
  // tslint:disable-next-line max-line-length
  inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[Options[TCommit, TContext]],
    context: js.UndefOr[Partial[TContext]],
    gitRawCommitsOpts: js.UndefOr[GitRawCommitsOptions],
    parserOpts: js.UndefOr[ParserOptions],
    writerOpts: js.UndefOr[WriterOptions[TCommit, TContext]],
    execOpts: js.UndefOr[ExecOptions]
  ): Readable = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], gitRawCommitsOpts.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any], writerOpts.asInstanceOf[js.Any], execOpts.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Context
    extends StObject
       with typings.conventionalChangelogWriter.mod.Context {
    
    /**
      * @defaults
      * Current semver tag or `'v'` + version if no current tag.
      */
    var currentTag: js.UndefOr[String] = js.undefined
    
    /**
      * Should link to the page that compares current tag with previous tag?
      *
      * @defaults
      * `true` if `previousTag` and `currentTag` are truthy.
      */
    var linkCompare: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @defaults
      * Previous semver tag or the first commit hash if no previous tag.
      */
    var previousTag: js.UndefOr[String] = js.undefined
  }
  object Context {
    
    inline def apply(commit: String, date: String, issue: String): Context = {
      val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setCurrentTag(value: String): Self = StObject.set(x, "currentTag", value.asInstanceOf[js.Any])
      
      inline def setCurrentTagUndefined: Self = StObject.set(x, "currentTag", js.undefined)
      
      inline def setLinkCompare(value: Boolean): Self = StObject.set(x, "linkCompare", value.asInstanceOf[js.Any])
      
      inline def setLinkCompareUndefined: Self = StObject.set(x, "linkCompare", js.undefined)
      
      inline def setPreviousTag(value: String): Self = StObject.set(x, "previousTag", value.asInstanceOf[js.Any])
      
      inline def setPreviousTagUndefined: Self = StObject.set(x, "previousTag", js.undefined)
    }
  }
  
  /**
    * Please check the available options at http://git-scm.com/docs/git-log.
    *
    * There are some defaults:
    *
    * @remarks
    * Single dash arguments are not supported because of https://github.com/sindresorhus/dargs/blob/master/index.js#L5.
    *
    * @remarks
    * For `<revision range>` we can also use `<from>..<to>` pattern, and this
    * module has the following extra options for shortcut of this pattern:
    *
    * * `from`
    * * `to`
    *
    * This module also have the following additions:
    *
    * * `format`
    * * `debug`
    * * `path`
    */
  trait GitRawCommitsOptions
    extends StObject
       with GitOptions {
    
    /**
      * @defaults
      * `true` if `options.append` is truthy.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object GitRawCommitsOptions {
    
    inline def apply(): GitRawCommitsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitRawCommitsOptions]
    }
    
    extension [Self <: GitRawCommitsOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  object MergedContext {
    
    trait ExtraContext extends StObject {
      
      /**
        * All git semver tags found in the repository. You can't overwrite this value.
        */
      val gitSemverTags: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Your `package.json` data. You can't overwrite this value.
        */
      val packageData: js.UndefOr[ReadonlyPartialPackage] = js.undefined
    }
    object ExtraContext {
      
      inline def apply(): ExtraContext = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExtraContext]
      }
      
      extension [Self <: ExtraContext](x: Self) {
        
        inline def setGitSemverTags(value: js.Array[String]): Self = StObject.set(x, "gitSemverTags", value.asInstanceOf[js.Any])
        
        inline def setGitSemverTagsUndefined: Self = StObject.set(x, "gitSemverTags", js.undefined)
        
        inline def setGitSemverTagsVarargs(value: String*): Self = StObject.set(x, "gitSemverTags", js.Array(value*))
        
        inline def setPackageData(value: ReadonlyPartialPackage): Self = StObject.set(x, "packageData", value.asInstanceOf[js.Any])
        
        inline def setPackageDataUndefined: Self = StObject.set(x, "packageData", js.undefined)
      }
    }
  }
  type MergedContext[T /* <: typings.conventionalChangelogWriter.mod.Context */] = T & ExtraContext
  
  trait Options[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] extends StObject {
    
    /**
      * Should the log be appended to existing data.
      *
      * @default
      * false
      */
    var append: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This should serve as default values for other arguments of
      * `conventionalChangelogCore` so you don't need to rewrite the same or similar
      * config across your projects. Any value in this could be overwritten. If this
      * is a promise (recommended if async), it should resolve with the config. If
      * this is a function, it expects a node style callback with the config object.
      * If this is an object, it is the config object. The config object should
      * include `context`, `gitRawCommitsOpts`, `parserOpts` and `writerOpts`.
      */
    var config: js.UndefOr[Config[TCommit, TContext]] = js.undefined
    
    /**
      * A debug function. EG: `console.debug.bind(console)`.
      *
      * @default
      * function () {}
      */
    var debug: js.UndefOr[Logger] = js.undefined
    
    /**
      * Specify a package in lerna-style monorepo that the CHANGELOG should be
      * generated for.
      *
      * Lerna tags releases in the format `foo-package@1.0.0` and assumes that
      * packages are stored in the directory structure `./packages/foo-package`.
      *
      * @default
      * null
      */
    var lernaPackage: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If this value is `true` and `context.version` equals last release then
      * `context.version` will be changed to `'Unreleased'`.
      *
      * @remarks
      * You may want to combine this option with `releaseCount` set to `0` to always
      * overwrite the whole CHANGELOG. `conventional-changelog` only outputs a
      * CHANGELOG but doesn't read any existing one.
      *
      * @defaults
      * `true` if a different version than last release is given. Otherwise `false`.
      */
    var outputUnreleased: js.UndefOr[Boolean] = js.undefined
    
    var pkg: js.UndefOr[Pkg] = js.undefined
    
    /**
      * How many releases of changelog you want to generate. It counts from the
      * upcoming release. Useful when you forgot to generate any previous changelog.
      * Set to `0` to regenerate all.
      *
      * @default
      * 1
      */
    var releaseCount: js.UndefOr[Double] = js.undefined
    
    /**
      * If given, unstable tags (e.g. `x.x.x-alpha.1`, `x.x.x-rc.2`) will be skipped.
      */
    var skipUnstable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a prefix for the git tag that will be taken into account during the
      * comparison. For instance if your version tag is prefixed by `version/`
      * instead of `v` you would specify `--tagPrefix=version/`.
      */
    var tagPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * A transform function that applies after the parser and before the writer.
      *
      * This is the place to modify the parsed commits.
      */
    var transform: js.UndefOr[Transform[TCommit]] = js.undefined
    
    /**
      * A warn function. EG: `grunt.verbose.writeln`.
      *
      * @default
      * options.debug
      */
    var warn: js.UndefOr[Logger] = js.undefined
  }
  object Options {
    
    inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](): Options[TCommit, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TCommit, TContext]]
    }
    
    object Config {
      
      object FunctionType {
        
        type Callback[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = js.Function2[/* error */ Any, /* config */ ObjectType[TCommit, TContext], Unit]
      }
      type FunctionType[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = js.Function1[/* callback */ Callback[TCommit, TContext], Unit]
      
      trait ObjectType[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] extends StObject {
        
        var context: js.UndefOr[Partial[TContext]] = js.undefined
        
        var gitRawCommitsOpts: js.UndefOr[GitRawCommitsOptions] = js.undefined
        
        var parserOpts: js.UndefOr[ParserOptions] = js.undefined
        
        var recommendedBumpOpts: js.UndefOr[typings.conventionalRecommendedBump.mod.Options] = js.undefined
        
        var writerOpts: js.UndefOr[WriterOptions[TCommit, TContext]] = js.undefined
      }
      object ObjectType {
        
        inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](): ObjectType[TCommit, TContext] = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ObjectType[TCommit, TContext]]
        }
        
        extension [Self <: ObjectType[?, ?], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](x: Self & (ObjectType[TCommit, TContext])) {
          
          inline def setContext(value: Partial[TContext]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
          
          inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
          
          inline def setGitRawCommitsOpts(value: GitRawCommitsOptions): Self = StObject.set(x, "gitRawCommitsOpts", value.asInstanceOf[js.Any])
          
          inline def setGitRawCommitsOptsUndefined: Self = StObject.set(x, "gitRawCommitsOpts", js.undefined)
          
          inline def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
          
          inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
          
          inline def setRecommendedBumpOpts(value: typings.conventionalRecommendedBump.mod.Options): Self = StObject.set(x, "recommendedBumpOpts", value.asInstanceOf[js.Any])
          
          inline def setRecommendedBumpOptsUndefined: Self = StObject.set(x, "recommendedBumpOpts", js.undefined)
          
          inline def setWriterOpts(value: WriterOptions[TCommit, TContext]): Self = StObject.set(x, "writerOpts", value.asInstanceOf[js.Any])
          
          inline def setWriterOptsUndefined: Self = StObject.set(x, "writerOpts", js.undefined)
        }
      }
    }
    // tslint:disable-next-line max-line-length
    type Config[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] = js.Promise[js.Object] | js.Function | js.Object
    
    type Logger = js.Function1[/* message */ js.UndefOr[Any], Unit]
    
    extension [Self <: Options[?, ?], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](x: Self & (Options[TCommit, TContext])) {
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setConfig(value: Config[TCommit, TContext]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDebug(value: /* message */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setLernaPackage(value: String): Self = StObject.set(x, "lernaPackage", value.asInstanceOf[js.Any])
      
      inline def setLernaPackageNull: Self = StObject.set(x, "lernaPackage", null)
      
      inline def setLernaPackageUndefined: Self = StObject.set(x, "lernaPackage", js.undefined)
      
      inline def setOutputUnreleased(value: Boolean): Self = StObject.set(x, "outputUnreleased", value.asInstanceOf[js.Any])
      
      inline def setOutputUnreleasedUndefined: Self = StObject.set(x, "outputUnreleased", js.undefined)
      
      inline def setPkg(value: Pkg): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setReleaseCount(value: Double): Self = StObject.set(x, "releaseCount", value.asInstanceOf[js.Any])
      
      inline def setReleaseCountUndefined: Self = StObject.set(x, "releaseCount", js.undefined)
      
      inline def setSkipUnstable(value: Boolean): Self = StObject.set(x, "skipUnstable", value.asInstanceOf[js.Any])
      
      inline def setSkipUnstableUndefined: Self = StObject.set(x, "skipUnstable", js.undefined)
      
      inline def setTagPrefix(value: String): Self = StObject.set(x, "tagPrefix", value.asInstanceOf[js.Any])
      
      inline def setTagPrefixUndefined: Self = StObject.set(x, "tagPrefix", js.undefined)
      
      inline def setTransform(value: Transform[TCommit]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWarn(value: /* message */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
    
    trait Pkg extends StObject {
      
      /**
        * The location of your "package.json".
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * A function that takes `package.json` data as the argument and returns the
        * modified data. Note this is performed before normalizing package.json data.
        * Useful when you need to add a leading 'v' to your version or modify your
        * repository url, etc.
        *
        * @defaults
        * Pass through.
        */
      var transform: js.UndefOr[js.Function1[/* pkg */ Record[String, Any], Record[String, Any]]] = js.undefined
    }
    object Pkg {
      
      inline def apply(): Pkg = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Pkg]
      }
      
      extension [Self <: Pkg](x: Self) {
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTransform(value: /* pkg */ Record[String, Any] => Record[String, Any]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
    
    object Transform {
      
      type Callback[T /* <: Commit[String | Double | js.Symbol] */] = js.Function2[/* error */ Any, /* commit */ T, Unit]
    }
    type Transform[T /* <: Commit[String | Double | js.Symbol] */] = js.ThisFunction2[
        /* this */ typings.node.streamMod.Transform, 
        /* commit */ Commit[String | Double | js.Symbol], 
        /* cb */ typings.conventionalChangelogCore.mod.Options.Transform.Callback[T], 
        Unit
      ]
  }
  
  trait ParserOptions
    extends StObject
       with typings.conventionalCommitsParser.mod.Options
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options<TCommit, TContext> * / any */ trait WriterOptions[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] extends StObject {
    
    /**
      * A function to get debug information.
      *
      * @default
      * options.debug
      */
    var debug: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<conventional-commits-parser.conventional-commits-parser.Commit<string | number | symbol>, conventional-changelog-writer.conventional-changelog-writer.Context>['debug'] */ js.Any
      ] = js.undefined
    
    /**
      * If `true`, the stream will flush out the last bit of commits (could be empty)
      * to changelog.
      *
      * @default
      * options.outputUnreleased
      */
    var doFlush: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<conventional-commits-parser.conventional-commits-parser.Commit<string | number | symbol>, conventional-changelog-writer.conventional-changelog-writer.Context>['doFlush'] */ js.Any
      ] = js.undefined
    
    /**
      * Last chance to modify your context before generating a changelog.
      *
      * Finalize context is used for generating above context.
      *
      * @remarks
      * If you overwrite this value the above context defaults will be gone.
      */
    var finalizeContext: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<TCommit, conventional-changelog-core.conventional-changelog-core.MergedContext<TContext>>['finalizeContext'] */ js.Any
      ] = js.undefined
    
    /**
      * The normal order means reverse chronological order. `reverse` order means
      * chronological order. Are the commits from upstream in the reverse order? You
      * should only worry about this when generating more than one blocks of logs
      * based on `generateOn`. If you find the last commit is in the wrong block
      * inverse this value.
      *
      * @default
      * options.append
      */
    var reverse: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<conventional-commits-parser.conventional-commits-parser.Commit<string | number | symbol>, conventional-changelog-writer.conventional-changelog-writer.Context>['reverse'] */ js.Any
      ] = js.undefined
  }
  object WriterOptions {
    
    inline def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](): WriterOptions[TCommit, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriterOptions[TCommit, TContext]]
    }
    
    extension [Self <: WriterOptions[?, ?], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](x: Self & (WriterOptions[TCommit, TContext])) {
      
      inline def setDebug(
        value: /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<conventional-commits-parser.conventional-commits-parser.Commit<string | number | symbol>, conventional-changelog-writer.conventional-changelog-writer.Context>['debug'] */ js.Any
      ): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDoFlush(
        value: /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<conventional-commits-parser.conventional-commits-parser.Commit<string | number | symbol>, conventional-changelog-writer.conventional-changelog-writer.Context>['doFlush'] */ js.Any
      ): Self = StObject.set(x, "doFlush", value.asInstanceOf[js.Any])
      
      inline def setDoFlushUndefined: Self = StObject.set(x, "doFlush", js.undefined)
      
      inline def setFinalizeContext(
        value: /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<TCommit, conventional-changelog-core.conventional-changelog-core.MergedContext<TContext>>['finalizeContext'] */ js.Any
      ): Self = StObject.set(x, "finalizeContext", value.asInstanceOf[js.Any])
      
      inline def setFinalizeContextUndefined: Self = StObject.set(x, "finalizeContext", js.undefined)
      
      inline def setReverse(
        value: /* import warning: importer.ImportType#apply Failed type conversion: conventional-changelog-writer.conventional-changelog-writer.Options<conventional-commits-parser.conventional-commits-parser.Commit<string | number | symbol>, conventional-changelog-writer.conventional-changelog-writer.Context>['reverse'] */ js.Any
      ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
}
