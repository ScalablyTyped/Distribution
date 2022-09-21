package typings.blackEngine

import org.scalablytyped.runtime.NumberDictionary
import typings.blackEngine.assetMod.Asset
import typings.blackEngine.textureMod.Texture
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitmapFontAssetMod {
  
  @JSImport("black-engine/assets/BitmapFontAsset", "BitmapFontAsset")
  @js.native
  open class BitmapFontAsset protected () extends Asset {
    def this(name: String, imageUrl: String, xmlUrl: String) = this()
    
    /* private */ var mImageLoader: Any = js.native
    
    /* private */ var mImageUrl: Any = js.native
    
    var mScale: Double = js.native
    
    /* private */ var mXHR: Any = js.native
    
    /* private */ var mXmlUrl: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
  /* static members */
  object BitmapFontAsset {
    
    @JSImport("black-engine/assets/BitmapFontAsset", "BitmapFontAsset")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(xml: Document, texture: Texture): BitmapFontData = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any], texture.asInstanceOf[js.Any])).asInstanceOf[BitmapFontData]
  }
  
  @JSImport("black-engine/assets/BitmapFontAsset", "BitmapFontCharData")
  @js.native
  open class BitmapFontCharData () extends StObject {
    
    var height: Double = js.native
    
    var kerning: NumberDictionary[Double] = js.native
    
    var texture: Texture = js.native
    
    var width: Double = js.native
    
    var xAdvance: Double = js.native
    
    var xOffset: Double = js.native
    
    var yOffset: Double = js.native
  }
  
  @JSImport("black-engine/assets/BitmapFontAsset", "BitmapFontData")
  @js.native
  open class BitmapFontData () extends StObject {
    
    var baseline: Double = js.native
    
    var chars: NumberDictionary[BitmapFontCharData] = js.native
    
    var lineHeight: Double = js.native
    
    var name: String = js.native
    
    var size: Double = js.native
    
    var texture: Texture = js.native
    
    var xml: Document = js.native
  }
}
