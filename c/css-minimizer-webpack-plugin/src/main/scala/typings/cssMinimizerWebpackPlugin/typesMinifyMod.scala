package typings.cssMinimizerWebpackPlugin

import typings.cssMinimizerWebpackPlugin.mod.InternalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMinifyMod {
  
  @JSImport("css-minimizer-webpack-plugin/types/minify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def minify[T](options: InternalOptions[T]): js.Promise[InternalResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InternalResult]]
  
  inline def transform(options: String): js.Promise[InternalResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InternalResult]]
  
  type InternalResult = typings.cssMinimizerWebpackPlugin.mod.InternalResult
  
  type MinimizedResult = typings.cssMinimizerWebpackPlugin.mod.MinimizedResult
  
  type RawSourceMap = typings.sourceMap.mod.RawSourceMap
}
