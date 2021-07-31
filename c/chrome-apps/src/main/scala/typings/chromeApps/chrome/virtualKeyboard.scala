package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.virtualKeyboard
//////////////////////
// Virtual Keyboard //
//////////////////////
/**
  * @requires(CrOS Kiosk) Important: This API works only in Chrome OS apps.
  * @requires Permissions: 'virtualKeyboard'
  * @since Chrome 58
  * @description
  * The *chrome.virtualKeybaord* API is a kiosk only API used
  * to configure virtual keyboard layout and behavior in kiosk sessions.
  */
object virtualKeyboard {
  
  /**
    * Determines whether advanced virtual keyboard features should be enabled or not.
    * They are enabled by default.
    *
    * On **Chrome 58** all properties are expected to have the same value.
    *
    * From **Chrome 63** the properties can be distinct and are optional.
    * If omitted, the current value is preserved.
    */
  trait FeatureRestrictions extends StObject {
    
    /** Whether virtual keyboards can provide auto-complete. */
    var autoCompleteEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether virtual keyboards can provide auto-correct. */
    var autoCorrectEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether virtual keyboards can provide input via handwriting recognition. */
    var handwritingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether virtual keyboards can provide spell-check. */
    var spellCheckEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether virtual keyboards can provide voice input. */
    var voiceInputEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object FeatureRestrictions {
    
    @scala.inline
    def apply(): FeatureRestrictions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureRestrictions]
    }
    
    @scala.inline
    implicit class FeatureRestrictionsMutableBuilder[Self <: FeatureRestrictions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCompleteEnabled(value: Boolean): Self = StObject.set(x, "autoCompleteEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteEnabledUndefined: Self = StObject.set(x, "autoCompleteEnabled", js.undefined)
      
      @scala.inline
      def setAutoCorrectEnabled(value: Boolean): Self = StObject.set(x, "autoCorrectEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectEnabledUndefined: Self = StObject.set(x, "autoCorrectEnabled", js.undefined)
      
      @scala.inline
      def setHandwritingEnabled(value: Boolean): Self = StObject.set(x, "handwritingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandwritingEnabledUndefined: Self = StObject.set(x, "handwritingEnabled", js.undefined)
      
      @scala.inline
      def setSpellCheckEnabled(value: Boolean): Self = StObject.set(x, "spellCheckEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckEnabledUndefined: Self = StObject.set(x, "spellCheckEnabled", js.undefined)
      
      @scala.inline
      def setVoiceInputEnabled(value: Boolean): Self = StObject.set(x, "voiceInputEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoiceInputEnabledUndefined: Self = StObject.set(x, "voiceInputEnabled", js.undefined)
    }
  }
}
