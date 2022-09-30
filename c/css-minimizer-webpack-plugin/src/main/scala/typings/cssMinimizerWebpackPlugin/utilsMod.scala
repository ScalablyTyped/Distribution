package typings.cssMinimizerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("css-minimizer-webpack-plugin/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanCssMinify(input: Input, sourceMap: Unit, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def cleanCssMinify(input: Input, sourceMap: RawSourceMap, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def cssnanoMinify(input: Input): js.Promise[MinimizedResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinimizedResult]]
  inline def cssnanoMinify(input: Input, sourceMap: Unit, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def cssnanoMinify(input: Input, sourceMap: RawSourceMap): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def cssnanoMinify(input: Input, sourceMap: RawSourceMap, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def cssoMinify(input: Input, sourceMap: Unit, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def cssoMinify(input: Input, sourceMap: RawSourceMap, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def esbuildMinify(input: Input, sourceMap: Unit, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("esbuildMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def esbuildMinify(input: Input, sourceMap: RawSourceMap, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("esbuildMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def lightningCssMinify(input: Input, sourceMap: Unit, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("lightningCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def lightningCssMinify(input: Input, sourceMap: RawSourceMap, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("lightningCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def parcelCssMinify(input: Input, sourceMap: Unit, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("parcelCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def parcelCssMinify(input: Input, sourceMap: RawSourceMap, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("parcelCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def swcMinify(input: Input, sourceMap: Unit, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("swcMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  inline def swcMinify(input: Input, sourceMap: RawSourceMap, minimizerOptions: CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("swcMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def throttleAll[T](limit: Double, tasks: js.Array[Task[T]]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(limit.asInstanceOf[js.Any], tasks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  type CustomOptions = typings.cssMinimizerWebpackPlugin.mod.CustomOptions
  
  type Input = typings.cssMinimizerWebpackPlugin.mod.Input
  
  type MinimizedResult = typings.cssMinimizerWebpackPlugin.mod.MinimizedResult
  
  type Postcss = typings.postcss.mod.Postcss
  
  type ProcessOptions = typings.postcss.mod.ProcessOptions
  
  type RawSourceMap = typings.sourceMap.mod.RawSourceMap
  
  type SourceMapGenerator = typings.sourceMap.mod.SourceMapGenerator
  
  type Task[T] = js.Function0[js.Promise[T]]
}
