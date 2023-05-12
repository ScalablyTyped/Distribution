package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INode extends StObject {
  
  /**
    * Checks if alpha is present in the texture
    */
  var alpha: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the capability to check. Can be one of the following:
    *      astc
    *      bptc
    *      s3tc
    *      pvrtc
    *      etc2
    *      etc1
    */
  var cap: js.UndefOr[String] = js.undefined
  
  /**
    * Checks that the texture is a power of two
    */
  var needsPowerOfTwo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The node to select if at least one check is not successful
    */
  var no: js.UndefOr[INode | ILeaf] = js.undefined
  
  /**
    * The name of the option to check from the options object passed to the KTX2 decode function. {@link IKTX2DecoderOptions}
    */
  var option: js.UndefOr[String] = js.undefined
  
  /**
    * Checks the currently selected transcoding format.
    */
  var transcodeFormat: js.UndefOr[TranscodeTarget | js.Array[TranscodeTarget]] = js.undefined
  
  /**
    * The node to select if all checks are successful
    */
  var yes: js.UndefOr[INode | ILeaf] = js.undefined
}
object INode {
  
  inline def apply(): INode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setCap(value: String): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setNeedsPowerOfTwo(value: Boolean): Self = StObject.set(x, "needsPowerOfTwo", value.asInstanceOf[js.Any])
    
    inline def setNeedsPowerOfTwoUndefined: Self = StObject.set(x, "needsPowerOfTwo", js.undefined)
    
    inline def setNo(value: INode | ILeaf): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
    
    inline def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
    
    inline def setOption(value: String): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setTranscodeFormat(value: TranscodeTarget | js.Array[TranscodeTarget]): Self = StObject.set(x, "transcodeFormat", value.asInstanceOf[js.Any])
    
    inline def setTranscodeFormatUndefined: Self = StObject.set(x, "transcodeFormat", js.undefined)
    
    inline def setTranscodeFormatVarargs(value: TranscodeTarget*): Self = StObject.set(x, "transcodeFormat", js.Array(value*))
    
    inline def setYes(value: INode | ILeaf): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
    
    inline def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
  }
}
