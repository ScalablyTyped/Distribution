package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerOptions extends StObject {
  
  var copyright: js.UndefOr[Copyright] = js.undefined
  
  var tileUrlTemplate: js.UndefOr[String] = js.undefined
  
  var transparentPng: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object TileLayerOptions {
  
  inline def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  extension [Self <: TileLayerOptions](x: Self) {
    
    inline def setCopyright(value: Copyright): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setTileUrlTemplate(value: String): Self = StObject.set(x, "tileUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setTileUrlTemplateUndefined: Self = StObject.set(x, "tileUrlTemplate", js.undefined)
    
    inline def setTransparentPng(value: Boolean): Self = StObject.set(x, "transparentPng", value.asInstanceOf[js.Any])
    
    inline def setTransparentPngUndefined: Self = StObject.set(x, "transparentPng", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
