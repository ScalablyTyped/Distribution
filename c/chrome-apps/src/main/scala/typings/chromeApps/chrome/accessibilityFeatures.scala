package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// | 'double';
// #endregion internal
// #region chrome.accessibilityFeatures
////////////////////////////
// Accessibility Features //
////////////////////////////
/**
  * @requires Important: This API works only on Chrome OS.
  * @requires Permissions:
  *      'accessibilityFeatures.read' (For read access)
  *      'accessibilityFeatures.modify' (For modifications)
  *      Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
  * @since Chrome 37.
  * @description
  * Use the chrome.accessibilityFeatures API to manage Chrome's accessibility features.
  * This API relies on the ChromeSetting prototype of the type API for getting and setting individual accessibility features.
  * In order to get feature states the extension must request accessibilityFeatures.read permission.
  * For modifying feature state, the extension needs accessibilityFeatures.modify permission.
  * Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
  */
object accessibilityFeatures {
  
  trait AccessibilityFeaturesCallbackArg extends StObject {
    
    /** Whether the effective value is specific to the incognito session. This property will only be present if the incognito property in the details parameter of get() was true.  */
    var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One of
      * • not_controllable: cannot be controlled by any extension
      * • controlled_by_other_extensions: controlled by extensions with higher precedence
      * • controllable_by_this_extension: can be controlled by this app
      * • controlled_by_this_extension: controlled by this app
      */
    var levelOfControl: LevelOfControl
    
    /** The value of the setting. */
    var value: Any
  }
  object AccessibilityFeaturesCallbackArg {
    
    inline def apply(levelOfControl: LevelOfControl, value: Any): AccessibilityFeaturesCallbackArg = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessibilityFeaturesCallbackArg]
    }
    
    extension [Self <: AccessibilityFeaturesCallbackArg](x: Self) {
      
      inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      inline def setLevelOfControl(value: LevelOfControl): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccessibilityFeaturesClearArg extends StObject {
    
    /**
      * The scope of the ChromeSetting. One of
      * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
      * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
      * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
      * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
      */
    var scope: js.UndefOr[Scope] = js.undefined
  }
  object AccessibilityFeaturesClearArg {
    
    inline def apply(): AccessibilityFeaturesClearArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilityFeaturesClearArg]
    }
    
    extension [Self <: AccessibilityFeaturesClearArg](x: Self) {
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait AccessibilityFeaturesGetArg extends StObject {
    
    /** Whether to return the value that applies to the incognito session (default false).  */
    var incognito: js.UndefOr[Boolean] = js.undefined
  }
  object AccessibilityFeaturesGetArg {
    
    inline def apply(): AccessibilityFeaturesGetArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilityFeaturesGetArg]
    }
    
    extension [Self <: AccessibilityFeaturesGetArg](x: Self) {
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    }
  }
  
  trait AccessibilityFeaturesSetArg extends StObject {
    
    /**
      * The scope of the ChromeSetting. One of
      * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
      * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
      * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
      * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
      */
    var scope: js.UndefOr[Scope] = js.undefined
    
    /**
      * The value of the setting.
      * Note that every setting has a specific value type, which is described together with the setting. An extension should not set a value of a different type.
      */
    var value: Any
  }
  object AccessibilityFeaturesSetArg {
    
    inline def apply(value: Any): AccessibilityFeaturesSetArg = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessibilityFeaturesSetArg]
    }
    
    extension [Self <: AccessibilityFeaturesSetArg](x: Self) {
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccessibilityFeaturesSetting extends StObject {
    
    /**
      * Clears the setting, restoring any default value.
      * @param details Which setting to clear.
      * @param callback Called at the completion of the clear operation.
      * If you specify the callback parameter, it should be a function that looks like this:
      * function() {...};
      */
    def clear(details: AccessibilityFeaturesClearArg): Unit = js.native
    def clear(details: AccessibilityFeaturesClearArg, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      * @param callback The callback parameter should be a function that looks like this:
      * function(object details) {...};
      */
    def get(
      details: AccessibilityFeaturesGetArg,
      callback: js.Function1[/* details */ AccessibilityFeaturesCallbackArg, Unit]
    ): Unit = js.native
    
    /**
      * Sets the value of a setting.
      * @param details Which setting to change.
      * @param callback Called at the completion of the set operation.
      * If you specify the callback parameter, it should be a function that looks like this:
      * function() {...};
      */
    def set(details: AccessibilityFeaturesSetArg): Unit = js.native
    def set(details: AccessibilityFeaturesSetArg, callback: js.Function0[Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.not_controllable
    - typings.chromeApps.chromeAppsStrings.controlled_by_other_extensions
    - typings.chromeApps.chromeAppsStrings.controllable_by_this_extension
    - typings.chromeApps.chromeAppsStrings.controlled_by_this_extension
  */
  trait LevelOfControl extends StObject
  object LevelOfControl {
    
    inline def controllable_by_this_extension: typings.chromeApps.chromeAppsStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typings.chromeApps.chromeAppsStrings.controllable_by_this_extension]
    
    inline def controlled_by_other_extensions: typings.chromeApps.chromeAppsStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typings.chromeApps.chromeAppsStrings.controlled_by_other_extensions]
    
    inline def controlled_by_this_extension: typings.chromeApps.chromeAppsStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typings.chromeApps.chromeAppsStrings.controlled_by_this_extension]
    
    inline def not_controllable: typings.chromeApps.chromeAppsStrings.not_controllable = "not_controllable".asInstanceOf[typings.chromeApps.chromeAppsStrings.not_controllable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.regular
    - typings.chromeApps.chromeAppsStrings.regular_only
    - typings.chromeApps.chromeAppsStrings.incognito_persistent
    - typings.chromeApps.chromeAppsStrings.incognito_session_only
  */
  trait Scope extends StObject
  object Scope {
    
    inline def incognito_persistent: typings.chromeApps.chromeAppsStrings.incognito_persistent = "incognito_persistent".asInstanceOf[typings.chromeApps.chromeAppsStrings.incognito_persistent]
    
    inline def incognito_session_only: typings.chromeApps.chromeAppsStrings.incognito_session_only = "incognito_session_only".asInstanceOf[typings.chromeApps.chromeAppsStrings.incognito_session_only]
    
    inline def regular: typings.chromeApps.chromeAppsStrings.regular = "regular".asInstanceOf[typings.chromeApps.chromeAppsStrings.regular]
    
    inline def regular_only: typings.chromeApps.chromeAppsStrings.regular_only = "regular_only".asInstanceOf[typings.chromeApps.chromeAppsStrings.regular_only]
  }
}
