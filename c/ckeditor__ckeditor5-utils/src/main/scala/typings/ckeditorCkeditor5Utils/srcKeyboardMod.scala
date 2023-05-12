package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.ReadonlyKeystrokeInfo
import typings.ckeditorCkeditor5Utils.srcLanguageMod.LanguageDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcKeyboardMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCode(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getCode(key: ReadonlyKeystrokeInfo): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getEnvKeystrokeText(keystroke: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvKeystrokeText")(keystroke.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLocalizedArrowKeyCodeDirection(keyCode: Double, contentLanguageDirection: LanguageDirection): js.UndefOr[ArrowKeyCodeDirection] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedArrowKeyCodeDirection")(keyCode.asInstanceOf[js.Any], contentLanguageDirection.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ArrowKeyCodeDirection]]
  
  inline def isArrowKeyCode(keyCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrowKeyCode")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isForwardArrowKeyCode(keyCode: Double, contentLanguageDirection: LanguageDirection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForwardArrowKeyCode")(keyCode.asInstanceOf[js.Any], contentLanguageDirection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseKeystroke(keystroke: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeystroke")(keystroke.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseKeystroke(keystroke: js.Array[Double | String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeystroke")(keystroke.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.left
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.up
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.right
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.down
  */
  trait ArrowKeyCodeDirection extends StObject
  object ArrowKeyCodeDirection {
    
    inline def down: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.down = "down".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.down]
    
    inline def left: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.left = "left".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.left]
    
    inline def right: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.right = "right".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.right]
    
    inline def up: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.up = "up".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.up]
  }
  
  trait KeystrokeInfo extends StObject {
    
    /**
      * Whether the <kbd>Alt</kbd> modifier was pressed.
      */
    var altKey: Boolean
    
    /**
      * Whether the <kbd>Ctrl</kbd> modifier was pressed.
      */
    var ctrlKey: Boolean
    
    /**
      * The [key code](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/keyCode).
      */
    var keyCode: Double
    
    /**
      * Whether the <kbd>Cmd</kbd> modifier was pressed.
      */
    var metaKey: Boolean
    
    /**
      * Whether the <kbd>Shift</kbd> modifier was pressed.
      */
    var shiftKey: Boolean
  }
  object KeystrokeInfo {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, keyCode: Double, metaKey: Boolean, shiftKey: Boolean): KeystrokeInfo = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeystrokeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeystrokeInfo] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
}
