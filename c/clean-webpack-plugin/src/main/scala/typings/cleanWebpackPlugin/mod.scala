package typings.cleanWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clean-webpack-plugin", "CleanWebpackPlugin")
  @js.native
  class CleanWebpackPlugin () extends StObject {
    def this(options: Options) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
    
    val cleanAfterEveryBuildPatterns: js.Any = js.native
    
    val cleanOnceBeforeBuildPatterns: js.Any = js.native
    
    val cleanStaleWebpackAssets: js.Any = js.native
    
    var currentAssets: js.Any = js.native
    
    val dangerouslyAllowCleanPatternsOutsideProject: js.Any = js.native
    
    val dry: js.Any = js.native
    
    def handleDone(
      stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats */ js.Any
    ): Unit = js.native
    
    /**
      * Initially remove files from output directory prior to build.
      *
      * Only happens once.
      *
      * Warning: It is recommended to initially clean your build directory outside of webpack to minimize unexpected behavior.
      */
    def handleInitial(compilation: Compilation): Unit = js.native
    
    var initialClean: js.Any = js.native
    
    var outputPath: js.Any = js.native
    
    val protectWebpackAssets: js.Any = js.native
    
    def removeFiles(patterns: js.Array[String]): Unit = js.native
    
    val verbose: js.Any = js.native
  }
  
  type Compilation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilationType.Compilation */ js.Any
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Removes files after every build (including watch mode) that match this pattern.
      * Used for files that are not created directly by Webpack.
      *
      * Use !negative patterns to exclude files
      *
      * default: []
      */
    var cleanAfterEveryBuildPatterns: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Removes files once prior to Webpack compilation
      *   Not included in rebuilds (watch mode)
      *
      * Use !negative patterns to exclude files
      *
      * default: ['**\/ *']
      */
    var cleanOnceBeforeBuildPatterns: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Automatically remove all unused webpack assets on rebuild
      *
      * default: true
      */
    var cleanStaleWebpackAssets: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow clean patterns outside of process.cwd()
      *
      * requires dry option to be explicitly set
      *
      * default: false
      */
    var dangerouslyAllowCleanPatternsOutsideProject: js.UndefOr[Boolean] = js.native
    
    /**
      * Simulate the removal of files
      *
      * default: false
      */
    var dry: js.UndefOr[Boolean] = js.native
    
    /**
      * Do not allow removal of current webpack assets
      *
      * default: true
      */
    var protectWebpackAssets: js.UndefOr[Boolean] = js.native
    
    /**
      * Write Logs to Console
      * (Always enabled when dry is true)
      *
      * default: false
      */
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setCleanAfterEveryBuildPatterns(value: js.Array[String]): Self = StObject.set(x, "cleanAfterEveryBuildPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanAfterEveryBuildPatternsUndefined: Self = StObject.set(x, "cleanAfterEveryBuildPatterns", js.undefined)
      
      @scala.inline
      def setCleanAfterEveryBuildPatternsVarargs(value: String*): Self = StObject.set(x, "cleanAfterEveryBuildPatterns", js.Array(value :_*))
      
      @scala.inline
      def setCleanOnceBeforeBuildPatterns(value: js.Array[String]): Self = StObject.set(x, "cleanOnceBeforeBuildPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanOnceBeforeBuildPatternsUndefined: Self = StObject.set(x, "cleanOnceBeforeBuildPatterns", js.undefined)
      
      @scala.inline
      def setCleanOnceBeforeBuildPatternsVarargs(value: String*): Self = StObject.set(x, "cleanOnceBeforeBuildPatterns", js.Array(value :_*))
      
      @scala.inline
      def setCleanStaleWebpackAssets(value: Boolean): Self = StObject.set(x, "cleanStaleWebpackAssets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanStaleWebpackAssetsUndefined: Self = StObject.set(x, "cleanStaleWebpackAssets", js.undefined)
      
      @scala.inline
      def setDangerouslyAllowCleanPatternsOutsideProject(value: Boolean): Self = StObject.set(x, "dangerouslyAllowCleanPatternsOutsideProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyAllowCleanPatternsOutsideProjectUndefined: Self = StObject.set(x, "dangerouslyAllowCleanPatternsOutsideProject", js.undefined)
      
      @scala.inline
      def setDry(value: Boolean): Self = StObject.set(x, "dry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryUndefined: Self = StObject.set(x, "dry", js.undefined)
      
      @scala.inline
      def setProtectWebpackAssets(value: Boolean): Self = StObject.set(x, "protectWebpackAssets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectWebpackAssetsUndefined: Self = StObject.set(x, "protectWebpackAssets", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
