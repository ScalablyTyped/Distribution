package typings.conventionalRecommendedBump

import typings.conventionalCommitsParser.mod.Commit
import typings.conventionalRecommendedBump.mod.Callback.Recommendation
import typings.conventionalRecommendedBump.mod.Callback.Recommendation.ReleaseType
import typings.conventionalRecommendedBump.mod.Options.WhatBump
import typings.conventionalRecommendedBump.mod.Options.WhatBump.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param options  `options` is an object with the following properties:
    *
    *                 * `ignoreReverted`
    *                 * `preset`
    *                 * `config`
    *                 * `whatBump`
    * @param callback
    */
  @scala.inline
  def apply(options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    *
    * @param options    `options` is an object with the following properties:
    *
    *                   * `ignoreReverted`
    *                   * `preset`
    *                   * `config`
    *                   * `whatBump`
    * @param parserOpts See the [conventional-commits-parser](https://github.com/conventional-changelog/conventional-commits-parser)
    *                   documentation for available options.
    * @param callback
    */
  @scala.inline
  def apply(options: Options, parserOpts: typings.conventionalCommitsParser.mod.Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("conventional-recommended-bump", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Callback {
    
    /**
      * `recommendation` is an `object` with a single property, `releaseType`.
      *
      * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
      * or `undefined` if `whatBump` does not return a valid `level` property, or
      * the `level` property is not set by `whatBump`.
      */
    trait Recommendation
      extends StObject
         with Result {
      
      /**
        * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
        * or `undefined` if `whatBump` does not return a valid `level` property, or
        * the `level` property is not set by `whatBump`.
        */
      var releaseType: js.UndefOr[ReleaseType] = js.undefined
    }
    object Recommendation {
      
      @scala.inline
      def apply(): Recommendation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Recommendation]
      }
      
      @scala.inline
      implicit class RecommendationMutableBuilder[Self <: Recommendation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReleaseType(value: ReleaseType): Self = StObject.set(x, "releaseType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReleaseTypeUndefined: Self = StObject.set(x, "releaseType", js.undefined)
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major
        - typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor
        - typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch
      */
      trait ReleaseType extends StObject
      object ReleaseType {
        
        @scala.inline
        def major: typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major = "major".asInstanceOf[typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major]
        
        @scala.inline
        def minor: typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor = "minor".asInstanceOf[typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor]
        
        @scala.inline
        def patch: typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch = "patch".asInstanceOf[typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch]
      }
    }
  }
  /**
    * `recommendation` is an `object` with a single property, `releaseType`.
    *
    * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
    * or `undefined` if `whatBump` does not return a valid `level` property, or
    * the `level` property is not set by `whatBump`.
    */
  type Callback = js.Function2[/* error */ js.Any, /* recommendation */ Recommendation, Unit]
  
  /**
    * `options` is an object with the following properties:
    * * `ignoreReverted`
    * * `preset`
    * * `config`
    * * `whatBump`
    */
  trait Options extends StObject {
    
    /**
      * This should serve as default values for other arguments of
      * `conventional-recommended-bump` so you don't need to rewrite the same or
      * similar config across your projects.
      *
      * @remarks
      * `config` option will be overwritten by the value loaded by
      * `conventional-changelog-preset-loader` if the `preset` options is set.
      */
    var config: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreOptions.Config<Commit, WriterContext> */ js.Any
      ] = js.undefined
    
    /**
      * If `true`, reverted commits will be ignored.
      *
      * @default
      * true
      */
    var ignoreReverted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the name of a package in a [Lerna](https://lernajs.io/)-managed
      * repository. The package name will be used when fetching all changes to a
      * package since the last time that package was released.
      *
      * For instance if your project contained a package named
      * `conventional-changelog`, you could have only commits that have happened
      * since the last release of `conventional-changelog` was tagged by
      * specifying `--lernaPackage=conventional-changelog` using the CLI, or
      * `conventional-changelog` as the value of the `lernaPackage` option.
      */
    var lernaPackage: js.UndefOr[String] = js.undefined
    
    /**
      * It's recommended to use a preset so you don't have to define everything
      * yourself.
      *
      * The value is passed to [`conventional-changelog-preset-loader`](https://www.npmjs.com/package/conventional-changelog-preset-loader).
      */
    var preset: js.UndefOr[String] = js.undefined
    
    /**
      * Specify a prefix for the git tag that will be taken into account during the
      * comparison.
      *
      * For instance if your version tag is prefixed by `version/` instead of `v` you
      * would specifying `--tagPrefix=version/` using the CLI, or `version/` as the
      * value of the `tagPrefix` option.
      */
    var tagPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * A function that takes parsed commits as an argument.
      *
      * ```
      * whatBump(commits) {};
      * ```
      *
      * `commits` is an array of all commits from last semver tag to `HEAD` as parsed
      * by `conventional-commits-parser`.
      *
      * This should return an object including but not limited to `level` and `reason`.
      * `level` is a `number` indicating what bump it should be and `reason` is the
      * reason of such release.
      */
    var whatBump: js.UndefOr[WhatBump] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreOptions.Config<Commit, WriterContext> */ js.Any
      ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setIgnoreReverted(value: Boolean): Self = StObject.set(x, "ignoreReverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRevertedUndefined: Self = StObject.set(x, "ignoreReverted", js.undefined)
      
      @scala.inline
      def setLernaPackage(value: String): Self = StObject.set(x, "lernaPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLernaPackageUndefined: Self = StObject.set(x, "lernaPackage", js.undefined)
      
      @scala.inline
      def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setTagPrefix(value: String): Self = StObject.set(x, "tagPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPrefixUndefined: Self = StObject.set(x, "tagPrefix", js.undefined)
      
      @scala.inline
      def setWhatBump(value: /* commits */ js.Array[Commit[String | Double | js.Symbol]] => Result): Self = StObject.set(x, "whatBump", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhatBumpUndefined: Self = StObject.set(x, "whatBump", js.undefined)
    }
    
    object WhatBump {
      
      trait Result extends StObject {
        
        var level: js.UndefOr[Double] = js.undefined
        
        var reason: js.UndefOr[String] = js.undefined
      }
      object Result {
        
        @scala.inline
        def apply(): Result = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Result]
        }
        
        @scala.inline
        implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
          
          @scala.inline
          def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        }
      }
    }
    type WhatBump = js.Function1[/* commits */ js.Array[Commit[String | Double | js.Symbol]], Result]
  }
}
