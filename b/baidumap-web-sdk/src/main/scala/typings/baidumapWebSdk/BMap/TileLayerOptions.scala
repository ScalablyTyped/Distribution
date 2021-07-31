package typings.baidumapWebSdk.BMap

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
  
  @scala.inline
  def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  @scala.inline
  implicit class TileLayerOptionsMutableBuilder[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: Copyright): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setTileUrlTemplate(value: String): Self = StObject.set(x, "tileUrlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUrlTemplateUndefined: Self = StObject.set(x, "tileUrlTemplate", js.undefined)
    
    @scala.inline
    def setTransparentPng(value: Boolean): Self = StObject.set(x, "transparentPng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentPngUndefined: Self = StObject.set(x, "transparentPng", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
