package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorSettings extends StObject {
  
  var ConnectedHome: js.UndefOr[ConnectedHomeSettings] = js.undefined
  
  /**
    * Face search settings to use on a streaming video. 
    */
  var FaceSearch: js.UndefOr[FaceSearchSettings] = js.undefined
}
object StreamProcessorSettings {
  
  inline def apply(): StreamProcessorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorSettings]
  }
  
  extension [Self <: StreamProcessorSettings](x: Self) {
    
    inline def setConnectedHome(value: ConnectedHomeSettings): Self = StObject.set(x, "ConnectedHome", value.asInstanceOf[js.Any])
    
    inline def setConnectedHomeUndefined: Self = StObject.set(x, "ConnectedHome", js.undefined)
    
    inline def setFaceSearch(value: FaceSearchSettings): Self = StObject.set(x, "FaceSearch", value.asInstanceOf[js.Any])
    
    inline def setFaceSearchUndefined: Self = StObject.set(x, "FaceSearch", js.undefined)
  }
}
