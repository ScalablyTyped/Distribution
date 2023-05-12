package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILeaf extends StObject {
  
  /**
    * The format to use when creating the texture at the engine level after it has been transcoded to transcodeFormat
    */
  var engineFormat: EngineFormat
  
  /**
    * Whether the texture must be rounded to a multiple of 4 (should normally be the case for all compressed formats). Default: true
    */
  var roundToMultiple4: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The format to transcode to
    */
  var transcodeFormat: TranscodeTarget
}
object ILeaf {
  
  inline def apply(engineFormat: EngineFormat, transcodeFormat: TranscodeTarget): ILeaf = {
    val __obj = js.Dynamic.literal(engineFormat = engineFormat.asInstanceOf[js.Any], transcodeFormat = transcodeFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILeaf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILeaf] (val x: Self) extends AnyVal {
    
    inline def setEngineFormat(value: EngineFormat): Self = StObject.set(x, "engineFormat", value.asInstanceOf[js.Any])
    
    inline def setRoundToMultiple4(value: Boolean): Self = StObject.set(x, "roundToMultiple4", value.asInstanceOf[js.Any])
    
    inline def setRoundToMultiple4Undefined: Self = StObject.set(x, "roundToMultiple4", js.undefined)
    
    inline def setTranscodeFormat(value: TranscodeTarget): Self = StObject.set(x, "transcodeFormat", value.asInstanceOf[js.Any])
  }
}
