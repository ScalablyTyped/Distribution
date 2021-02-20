package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Types
////////////////////
/**
  * The chrome.types API contains type declarations for Chrome.
  * @since Chrome 13.
  */
object types {
  
  @js.native
  trait ChromeSetting extends StObject {
    
    /**
      * Clears the setting, restoring any default value.
      * @param details Which setting to clear.
      * @param callback Optional. Called at the completion of the clear operation.
      */
    def clear(details: ChromeSettingClearDetails): Unit = js.native
    def clear(details: ChromeSettingClearDetails, callback: js.Function): Unit = js.native
    
    /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      */
    def get(details: ChromeSettingGetDetails): Unit = js.native
    def get(details: ChromeSettingGetDetails, callback: DetailsCallback): Unit = js.native
    
    /** Fired after the setting changes. */
    var onChange: ChromeSettingChangedEvent = js.native
    
    /**
      * Sets the value of a setting.
      * @param details Which setting to change.
      * @param callback Optional. Called at the completion of the set operation.
      */
    def set(details: ChromeSettingSetDetails): Unit = js.native
    def set(details: ChromeSettingSetDetails, callback: js.Function): Unit = js.native
  }
  
  type ChromeSettingChangedEvent = Event[DetailsCallback]
  
  @js.native
  trait ChromeSettingClearDetails extends StObject {
    
    /**
      * Optional.
      * The scope of the ChromeSetting. One of
      * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
      * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
      * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
      * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
      */
    var scope: js.UndefOr[String] = js.native
  }
  object ChromeSettingClearDetails {
    
    @scala.inline
    def apply(): ChromeSettingClearDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeSettingClearDetails]
    }
    
    @scala.inline
    implicit class ChromeSettingClearDetailsMutableBuilder[Self <: ChromeSettingClearDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait ChromeSettingGetDetails extends StObject {
    
    /** Optional. Whether to return the value that applies to the incognito session (default false). */
    var incognito: js.UndefOr[Boolean] = js.native
  }
  object ChromeSettingGetDetails {
    
    @scala.inline
    def apply(): ChromeSettingGetDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeSettingGetDetails]
    }
    
    @scala.inline
    implicit class ChromeSettingGetDetailsMutableBuilder[Self <: ChromeSettingGetDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    }
  }
  
  @js.native
  trait ChromeSettingGetResultDetails extends StObject {
    
    /**
      * Optional.
      * Whether the effective value is specific to the incognito session.
      * This property will only be present if the incognito property in the details parameter of get() was true.
      */
    var incognitoSpecific: js.UndefOr[Boolean] = js.native
    
    /**
      * One of
      * • not_controllable: cannot be controlled by any extension
      * • controlled_by_other_extensions: controlled by extensions with higher precedence
      * • controllable_by_this_extension: can be controlled by this extension
      * • controlled_by_this_extension: controlled by this extension
      */
    var levelOfControl: String = js.native
    
    /** The value of the setting. */
    var value: js.Any = js.native
  }
  object ChromeSettingGetResultDetails {
    
    @scala.inline
    def apply(levelOfControl: String, value: js.Any): ChromeSettingGetResultDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromeSettingGetResultDetails]
    }
    
    @scala.inline
    implicit class ChromeSettingGetResultDetailsMutableBuilder[Self <: ChromeSettingGetResultDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      @scala.inline
      def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChromeSettingSetDetails extends ChromeSettingClearDetails {
    
    /**
      * The value of the setting.
      * Note that every setting has a specific value type, which is described together with the setting. An extension should not set a value of a different type.
      */
    var value: js.Any = js.native
  }
  object ChromeSettingSetDetails {
    
    @scala.inline
    def apply(value: js.Any): ChromeSettingSetDetails = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromeSettingSetDetails]
    }
    
    @scala.inline
    implicit class ChromeSettingSetDetailsMutableBuilder[Self <: ChromeSettingSetDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
}
