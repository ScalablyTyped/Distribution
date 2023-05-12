package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKTX2DecoderOptions extends StObject {
  
  /**
    * list of transcoders to bypass when looking for a suitable transcoder. The available transcoders are:
    *      UniversalTranscoder_UASTC_ASTC
    *      UniversalTranscoder_UASTC_BC7
    *      UniversalTranscoder_UASTC_RGBA_UNORM
    *      UniversalTranscoder_UASTC_RGBA_SRGB
    *      UniversalTranscoder_UASTC_R8_UNORM
    *      UniversalTranscoder_UASTC_RG8_UNORM
    *      MSCTranscoder
    */
  var bypassTranscoders: js.UndefOr[js.Array[String]] = js.undefined
  
  /** force to always use (uncompressed) R8 for transcoded format */
  var forceR8: js.UndefOr[Boolean] = js.undefined
  
  /** force to always use (uncompressed) RG8 for transcoded format */
  var forceRG8: js.UndefOr[Boolean] = js.undefined
  
  /** force to always use (uncompressed) RGBA for transcoded format */
  var forceRGBA: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom decision tree to apply after the default decision tree has selected a transcoding format.
    * Allows the user to override the default decision tree selection.
    * The decision tree can use the INode.transcodeFormat property to base its decision on the transcoding format selected by the default decision tree.
    */
  var transcodeFormatDecisionTree: js.UndefOr[IDecisionTree] = js.undefined
  
  /** use RGBA format if ASTC and BC7 are not available as transcoded format */
  var useRGBAIfASTCBC7NotAvailableWhenUASTC: js.UndefOr[Boolean] = js.undefined
}
object IKTX2DecoderOptions {
  
  inline def apply(): IKTX2DecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKTX2DecoderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKTX2DecoderOptions] (val x: Self) extends AnyVal {
    
    inline def setBypassTranscoders(value: js.Array[String]): Self = StObject.set(x, "bypassTranscoders", value.asInstanceOf[js.Any])
    
    inline def setBypassTranscodersUndefined: Self = StObject.set(x, "bypassTranscoders", js.undefined)
    
    inline def setBypassTranscodersVarargs(value: String*): Self = StObject.set(x, "bypassTranscoders", js.Array(value*))
    
    inline def setForceR8(value: Boolean): Self = StObject.set(x, "forceR8", value.asInstanceOf[js.Any])
    
    inline def setForceR8Undefined: Self = StObject.set(x, "forceR8", js.undefined)
    
    inline def setForceRG8(value: Boolean): Self = StObject.set(x, "forceRG8", value.asInstanceOf[js.Any])
    
    inline def setForceRG8Undefined: Self = StObject.set(x, "forceRG8", js.undefined)
    
    inline def setForceRGBA(value: Boolean): Self = StObject.set(x, "forceRGBA", value.asInstanceOf[js.Any])
    
    inline def setForceRGBAUndefined: Self = StObject.set(x, "forceRGBA", js.undefined)
    
    inline def setTranscodeFormatDecisionTree(value: IDecisionTree): Self = StObject.set(x, "transcodeFormatDecisionTree", value.asInstanceOf[js.Any])
    
    inline def setTranscodeFormatDecisionTreeUndefined: Self = StObject.set(x, "transcodeFormatDecisionTree", js.undefined)
    
    inline def setUseRGBAIfASTCBC7NotAvailableWhenUASTC(value: Boolean): Self = StObject.set(x, "useRGBAIfASTCBC7NotAvailableWhenUASTC", value.asInstanceOf[js.Any])
    
    inline def setUseRGBAIfASTCBC7NotAvailableWhenUASTCUndefined: Self = StObject.set(x, "useRGBAIfASTCBC7NotAvailableWhenUASTC", js.undefined)
  }
}
