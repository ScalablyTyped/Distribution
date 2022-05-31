package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthOfFieldMergePostProcess
  extends StObject
     with PostProcess {
  
  /* private */ var blurSteps: js.Any = js.native
  
  /**
    * Updates the effect with the current post process compile time values and recompiles the shader.
    * @param defines Define statements that should be added at the beginning of the shader. (default: null)
    * @param uniforms Set of uniform variables that will be passed to the shader. (default: null)
    * @param samplers Set of Texture2D variables that will be passed to the shader. (default: null)
    * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
    * @param onCompiled Called when the shader has been compiled.
    * @param onError Called if there is an error when compiling a shader.
    */
  def updateEffect(
    defines: js.UndefOr[Nullable[String]],
    uniforms: js.UndefOr[Nullable[js.Array[String]]],
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    indexParameters: js.UndefOr[js.Any],
    onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, Unit]],
    onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]
  ): Unit = js.native
}
