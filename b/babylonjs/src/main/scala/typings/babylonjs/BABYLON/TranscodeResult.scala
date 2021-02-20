package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of transcoding a basis file
  */
@js.native
trait TranscodeResult extends StObject {
  
  /**
    * Info about the .basis file
    */
  var fileInfo: BasisFileInfo = js.native
  
  /**
    * Format to use when loading the file
    */
  var format: Double = js.native
}
object TranscodeResult {
  
  @scala.inline
  def apply(fileInfo: BasisFileInfo, format: Double): TranscodeResult = {
    val __obj = js.Dynamic.literal(fileInfo = fileInfo.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodeResult]
  }
  
  @scala.inline
  implicit class TranscodeResultMutableBuilder[Self <: TranscodeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileInfo(value: BasisFileInfo): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
