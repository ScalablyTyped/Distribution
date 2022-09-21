package typings.blackEngine

import typings.blackEngine.displayObjectMod.DisplayObject
import typings.blackEngine.fontStyleMod.FontStyle
import typings.blackEngine.fontWeightMod.FontWeight
import typings.blackEngine.rectangleMod.Rectangle
import typings.blackEngine.textStyleMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("black-engine/display/text/TextField", "TextField")
  @js.native
  open class TextField protected () extends DisplayObject {
    def this(
      text: js.UndefOr[String],
      family: js.UndefOr[String],
      color: js.UndefOr[Double],
      size: js.UndefOr[Double],
      style: js.UndefOr[FontStyle],
      weight: js.UndefOr[FontWeight],
      strokeThickness: js.UndefOr[Double],
      strokeColor: js.UndefOr[Double]
    ) = this()
    
    def align: String = js.native
    def align_=(arg: String): Unit = js.native
    
    def autoSize: Boolean = js.native
    def autoSize_=(arg: Boolean): Unit = js.native
    
    def dropShadow: Boolean = js.native
    def dropShadow_=(arg: Boolean): Unit = js.native
    
    def fieldHeight: Double = js.native
    def fieldHeight_=(arg: Double): Unit = js.native
    
    def fieldWidth: Double = js.native
    def fieldWidth_=(arg: Double): Unit = js.native
    
    def font: String = js.native
    
    def fontStyle: String = js.native
    def fontStyle_=(arg: String): Unit = js.native
    
    def font_=(arg: String): Unit = js.native
    
    def getAllStyles(): js.Array[TextStyle] = js.native
    
    def getDefaultStyle(name: Any): TextStyle = js.native
    
    def getStyle(name: String): TextStyle = js.native
    
    def highQuality: Boolean = js.native
    def highQuality_=(arg: Boolean): Unit = js.native
    
    def lineHeight: Double = js.native
    def lineHeight_=(arg: Double): Unit = js.native
    
    /* private */ var mAlign: Any = js.native
    
    /* private */ var mAutoSize: Any = js.native
    
    /* private */ var mDefaultStyle: Any = js.native
    
    /* private */ var mFieldHeight: Any = js.native
    
    /* private */ var mFieldWidth: Any = js.native
    
    /* private */ var mHighQuality: Any = js.native
    
    /* private */ var mLineHeight: Any = js.native
    
    /* private */ var mMetrics: Any = js.native
    
    /* private */ var mMultiline: Any = js.native
    
    /* private */ var mPadding: Any = js.native
    
    /* private */ var mStyles: Any = js.native
    
    /* private */ var mText: Any = js.native
    
    /* private */ var mTextBounds: Any = js.native
    
    /* private */ var mTextHeight: Any = js.native
    
    /* private */ var mTextWidth: Any = js.native
    
    /* private */ var mVerticalAlign: Any = js.native
    
    def multiline: Boolean = js.native
    def multiline_=(arg: Boolean): Unit = js.native
    
    def padding: Rectangle = js.native
    def padding_=(arg: Rectangle): Unit = js.native
    
    def removeStyle(name: String): Unit = js.native
    
    def setDefaultStyle(style: TextStyle): Unit = js.native
    
    def setStyle(name: String, style: TextStyle): Unit = js.native
    
    def shadowAlpha: Double = js.native
    def shadowAlpha_=(arg: Double): Unit = js.native
    
    def shadowBlur: Double = js.native
    def shadowBlur_=(arg: Double): Unit = js.native
    
    def shadowColor: Double = js.native
    def shadowColor_=(arg: Double): Unit = js.native
    
    def shadowDistanceX: Double = js.native
    def shadowDistanceX_=(arg: Double): Unit = js.native
    
    def shadowDistanceY: Double = js.native
    def shadowDistanceY_=(arg: Double): Unit = js.native
    
    def size: Double = js.native
    def size_=(arg: Double): Unit = js.native
    
    def strokeAlpha: Double = js.native
    def strokeAlpha_=(arg: Double): Unit = js.native
    
    def strokeColor: Double = js.native
    def strokeColor_=(arg: Double): Unit = js.native
    
    def strokeThickness: Double = js.native
    def strokeThickness_=(arg: Double): Unit = js.native
    
    def text: String = js.native
    
    def textAlpha: Double = js.native
    def textAlpha_=(arg: Double): Unit = js.native
    
    def textColor: Double = js.native
    def textColor_=(arg: Double): Unit = js.native
    
    def text_=(arg: String): Unit = js.native
    
    def vAlign: String = js.native
    def vAlign_=(arg: String): Unit = js.native
    
    def weight: String = js.native
    def weight_=(arg: String): Unit = js.native
  }
}
