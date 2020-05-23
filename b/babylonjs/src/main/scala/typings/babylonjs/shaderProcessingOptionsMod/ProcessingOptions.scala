package typings.babylonjs.shaderProcessingOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.iShaderProcessorMod.IShaderProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingOptions extends js.Object {
  var defines: js.Array[String]
  var includesShadersStore: StringDictionary[String]
  var indexParameters: js.Any
  var isFragment: Boolean
  var lookForClosingBracketForUniformBuffer: js.UndefOr[Boolean] = js.undefined
  var platformName: String
  var processor: js.UndefOr[IShaderProcessor] = js.undefined
  var shadersRepository: String
  var shouldUseHighPrecisionShader: Boolean
  var supportsUniformBuffers: Boolean
  var version: String
}

object ProcessingOptions {
  @scala.inline
  def apply(
    defines: js.Array[String],
    includesShadersStore: StringDictionary[String],
    indexParameters: js.Any,
    isFragment: Boolean,
    platformName: String,
    shadersRepository: String,
    shouldUseHighPrecisionShader: Boolean,
    supportsUniformBuffers: Boolean,
    version: String,
    lookForClosingBracketForUniformBuffer: js.UndefOr[Boolean] = js.undefined,
    processor: IShaderProcessor = null
  ): ProcessingOptions = {
    val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], includesShadersStore = includesShadersStore.asInstanceOf[js.Any], indexParameters = indexParameters.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], shadersRepository = shadersRepository.asInstanceOf[js.Any], shouldUseHighPrecisionShader = shouldUseHighPrecisionShader.asInstanceOf[js.Any], supportsUniformBuffers = supportsUniformBuffers.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(lookForClosingBracketForUniformBuffer)) __obj.updateDynamic("lookForClosingBracketForUniformBuffer")(lookForClosingBracketForUniformBuffer.get.asInstanceOf[js.Any])
    if (processor != null) __obj.updateDynamic("processor")(processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOptions]
  }
}

