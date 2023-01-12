package typings.chenfengyuanVueQrcode

import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`0`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`1`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`2`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`3`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`4`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`5`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`6`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeInts.`7`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.H
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.L
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.M
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.Q
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.high
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.low
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.medium
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.quartile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: js.UndefOr[Dark] = js.undefined
    
    // Error correction level.
    var errorCorrectionLevel: js.UndefOr[low | medium | quartile | high | L | M | Q | H] = js.undefined
    
    // Define how much wide the quiet zone should be.
    var margin: js.UndefOr[Double] = js.undefined
    
    // Mask pattern used to mask the symbol.
    var maskPattern: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
    
    // Scale factor.
    var scale: js.UndefOr[Double] = js.undefined
    
    // QR Code version.
    var version: js.UndefOr[Double] = js.undefined
    
    // Forces a specific width for the output image.
    var width: js.UndefOr[Double] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setErrorCorrectionLevel(value: low | medium | quartile | high | L | M | Q | H): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
      
      inline def setErrorCorrectionLevelUndefined: Self = StObject.set(x, "errorCorrectionLevel", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMaskPattern(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "maskPattern", value.asInstanceOf[js.Any])
      
      inline def setMaskPatternUndefined: Self = StObject.set(x, "maskPattern", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Dark extends StObject {
    
    var dark: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[String] = js.undefined
  }
  object Dark {
    
    inline def apply(): Dark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    }
  }
}
