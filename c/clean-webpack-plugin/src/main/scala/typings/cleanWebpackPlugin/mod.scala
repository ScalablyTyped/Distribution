package typings.cleanWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    /* private */ val cleanAfterEveryBuildPatterns: js.Any = js.native
    
    /* private */ val cleanOnceBeforeBuildPatterns: js.Any = js.native
    
    /* private */ val cleanStaleWebpackAssets: js.Any = js.native
    
    /* private */ var currentAssets: js.Any = js.native
    
    /* private */ val dangerouslyAllowCleanPatternsOutsideProject: js.Any = js.native
    
    /* private */ val dry: js.Any = js.native
    
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
    
    /* private */ var initialClean: js.Any = js.native
    
    /* private */ var outputPath: js.Any = js.native
    
    /* private */ val protectWebpackAssets: js.Any = js.native
    
    def removeFiles(patterns: js.Array[String]): Unit = js.native
    
    /* private */ val verbose: js.Any = js.native
  }
  
  type Compilation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilationType.Compilation */ js.Any
  
  trait Options extends StObject {
    
    /**
      * Removes files after every build (including watch mode) that match this pattern.
      * Used for files that are not created directly by Webpack.
      *
      * Use !negative patterns to exclude files
      *
      * default: []
      */
    var cleanAfterEveryBuildPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Removes files once prior to Webpack compilation
      *   Not included in rebuilds (watch mode)
      *
      * Use !negative patterns to exclude files
      *
      * default: ['**\/ *']
      */
    var cleanOnceBeforeBuildPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Automatically remove all unused webpack assets on rebuild
      *
      * default: true
      */
    var cleanStaleWebpackAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow clean patterns outside of process.cwd()
      *
      * requires dry option to be explicitly set
      *
      * default: false
      */
    var dangerouslyAllowCleanPatternsOutsideProject: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Simulate the removal of files
      *
      * default: false
      */
    var dry: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not allow removal of current webpack assets
      *
      * default: true
      */
    var protectWebpackAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write Logs to Console
      * (Always enabled when dry is true)
      *
      * default: false
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCleanAfterEveryBuildPatterns(value: js.Array[String]): Self = StObject.set(x, "cleanAfterEveryBuildPatterns", value.asInstanceOf[js.Any])
      
      inline def setCleanAfterEveryBuildPatternsUndefined: Self = StObject.set(x, "cleanAfterEveryBuildPatterns", js.undefined)
      
      inline def setCleanAfterEveryBuildPatternsVarargs(value: String*): Self = StObject.set(x, "cleanAfterEveryBuildPatterns", js.Array(value :_*))
      
      inline def setCleanOnceBeforeBuildPatterns(value: js.Array[String]): Self = StObject.set(x, "cleanOnceBeforeBuildPatterns", value.asInstanceOf[js.Any])
      
      inline def setCleanOnceBeforeBuildPatternsUndefined: Self = StObject.set(x, "cleanOnceBeforeBuildPatterns", js.undefined)
      
      inline def setCleanOnceBeforeBuildPatternsVarargs(value: String*): Self = StObject.set(x, "cleanOnceBeforeBuildPatterns", js.Array(value :_*))
      
      inline def setCleanStaleWebpackAssets(value: Boolean): Self = StObject.set(x, "cleanStaleWebpackAssets", value.asInstanceOf[js.Any])
      
      inline def setCleanStaleWebpackAssetsUndefined: Self = StObject.set(x, "cleanStaleWebpackAssets", js.undefined)
      
      inline def setDangerouslyAllowCleanPatternsOutsideProject(value: Boolean): Self = StObject.set(x, "dangerouslyAllowCleanPatternsOutsideProject", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyAllowCleanPatternsOutsideProjectUndefined: Self = StObject.set(x, "dangerouslyAllowCleanPatternsOutsideProject", js.undefined)
      
      inline def setDry(value: Boolean): Self = StObject.set(x, "dry", value.asInstanceOf[js.Any])
      
      inline def setDryUndefined: Self = StObject.set(x, "dry", js.undefined)
      
      inline def setProtectWebpackAssets(value: Boolean): Self = StObject.set(x, "protectWebpackAssets", value.asInstanceOf[js.Any])
      
      inline def setProtectWebpackAssetsUndefined: Self = StObject.set(x, "protectWebpackAssets", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
