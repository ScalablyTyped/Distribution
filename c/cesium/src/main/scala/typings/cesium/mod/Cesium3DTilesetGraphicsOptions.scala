package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cesium3DTilesetGraphicsOptions extends StObject {
  
  /**
    * A number or Property specifying the maximum screen space error used to drive level of detail refinement.
    */
  var maximumScreenSpaceError: js.UndefOr[Double | Property] = js.undefined
  
  /**
    * A boolean Property specifying the visibility of the tilese
    * @default true
    */
  var show: js.UndefOr[Boolean | Property] = js.undefined
  
  /**
    * A string or Resource Property specifying the URI of the tileset.
    */
  var uri: js.UndefOr[String | Property] = js.undefined
}
object Cesium3DTilesetGraphicsOptions {
  
  inline def apply(): Cesium3DTilesetGraphicsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cesium3DTilesetGraphicsOptions]
  }
  
  extension [Self <: Cesium3DTilesetGraphicsOptions](x: Self) {
    
    inline def setMaximumScreenSpaceError(value: Double | Property): Self = StObject.set(x, "maximumScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setMaximumScreenSpaceErrorUndefined: Self = StObject.set(x, "maximumScreenSpaceError", js.undefined)
    
    inline def setShow(value: Boolean | Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setUri(value: String | Property): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
