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
  
  @scala.inline
  def apply(): Cesium3DTilesetGraphicsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cesium3DTilesetGraphicsOptions]
  }
  
  @scala.inline
  implicit class Cesium3DTilesetGraphicsOptionsMutableBuilder[Self <: Cesium3DTilesetGraphicsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumScreenSpaceError(value: Double | Property): Self = StObject.set(x, "maximumScreenSpaceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumScreenSpaceErrorUndefined: Self = StObject.set(x, "maximumScreenSpaceError", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean | Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setUri(value: String | Property): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
