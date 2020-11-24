package typings.babelJest

import typings.babelCore.mod.TransformOptions
import typings.babelJest.babelJestBooleans.`true`
import typings.jestTransform.typesMod.CacheKeyOptions
import typings.jestTransform.typesMod.TransformedSource
import typings.jestTransform.typesMod.Transformer
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-jest", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var canInstrument: `true` = js.native
  
  def createTransformer(): BabelJestTransformer = js.native
  def createTransformer(options: TransformOptions): BabelJestTransformer = js.native
  @JSName("createTransformer")
  var createTransformer_Fmod: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.native
  
  var getCacheKey: js.UndefOr[
    js.Function4[
      /* fileData */ String, 
      /* filePath */ Path, 
      /* configStr */ String, 
      /* options */ CacheKeyOptions, 
      String
    ]
  ] = js.native
  
  def process(sourceText: String, sourcePath: Path, config: ProjectConfig): TransformedSource = js.native
  def process(
    sourceText: String,
    sourcePath: Path,
    config: ProjectConfig,
    options: typings.jestTransform.typesMod.TransformOptions
  ): TransformedSource = js.native
  
  @js.native
  trait BabelJestTransformer extends Transformer {
    
    @JSName("canInstrument")
    var canInstrument_BabelJestTransformer: `true` = js.native
  }
}
