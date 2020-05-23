package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IShaderMaterialOptions> */
trait PartialIShaderMaterialOpt extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  var needAlphaBlending: js.UndefOr[Boolean] = js.undefined
  var needAlphaTesting: js.UndefOr[Boolean] = js.undefined
  var samplers: js.UndefOr[js.Array[String]] = js.undefined
  var uniformBuffers: js.UndefOr[js.Array[String]] = js.undefined
  var uniforms: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialIShaderMaterialOpt {
  @scala.inline
  def apply(
    attributes: js.Array[String] = null,
    defines: js.Array[String] = null,
    needAlphaBlending: js.UndefOr[Boolean] = js.undefined,
    needAlphaTesting: js.UndefOr[Boolean] = js.undefined,
    samplers: js.Array[String] = null,
    uniformBuffers: js.Array[String] = null,
    uniforms: js.Array[String] = null
  ): PartialIShaderMaterialOpt = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (defines != null) __obj.updateDynamic("defines")(defines.asInstanceOf[js.Any])
    if (!js.isUndefined(needAlphaBlending)) __obj.updateDynamic("needAlphaBlending")(needAlphaBlending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needAlphaTesting)) __obj.updateDynamic("needAlphaTesting")(needAlphaTesting.get.asInstanceOf[js.Any])
    if (samplers != null) __obj.updateDynamic("samplers")(samplers.asInstanceOf[js.Any])
    if (uniformBuffers != null) __obj.updateDynamic("uniformBuffers")(uniformBuffers.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIShaderMaterialOpt]
  }
}

