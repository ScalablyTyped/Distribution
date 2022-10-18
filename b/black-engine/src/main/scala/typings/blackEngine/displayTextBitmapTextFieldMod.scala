package typings.blackEngine

import typings.blackEngine.assetsBitmapFontAssetMod.BitmapFontData
import typings.blackEngine.displayDisplayObjectMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayTextBitmapTextFieldMod {
  
  @JSImport("black-engine/display/text/BitmapTextField", "BitmapTextField")
  @js.native
  open class BitmapTextField protected () extends DisplayObject {
    def this(font: String) = this()
    def this(font: BitmapFontData) = this()
    def this(font: String, text: String) = this()
    def this(font: BitmapFontData, text: String) = this()
    
    def autoSize: Boolean = js.native
    def autoSize_=(arg: Boolean): Unit = js.native
    
    def fieldHeight: Double = js.native
    def fieldHeight_=(arg: Double): Unit = js.native
    
    def fieldWidth: Double = js.native
    def fieldWidth_=(arg: Double): Unit = js.native
    
    def lineHeight: Double = js.native
    def lineHeight_=(arg: Double): Unit = js.native
    
    /* private */ var mAutoSize: Any = js.native
    
    /* private */ var mBounds: Any = js.native
    
    var mData: Any = js.native
    
    /* private */ var mFieldHeight: Any = js.native
    
    /* private */ var mFieldWidth: Any = js.native
    
    /* private */ var mLineHeight: Any = js.native
    
    /* private */ var mMultiline: Any = js.native
    
    /* private */ var mText: Any = js.native
    
    /* private */ var mTextBounds: Any = js.native
    
    def multiline: Boolean = js.native
    def multiline_=(arg: Boolean): Unit = js.native
    
    def text: String = js.native
    def text_=(arg: String): Unit = js.native
  }
}
