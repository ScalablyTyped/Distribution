package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chromeStrings.cursive
import typings.chrome.chromeStrings.fantasy
import typings.chrome.chromeStrings.fixed
import typings.chrome.chromeStrings.sansserif
import typings.chrome.chromeStrings.serif
import typings.chrome.chromeStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Font Settings
////////////////////
/**
  * Use the chrome.fontSettings API to manage Chrome's font settings.
  * Availability: Since Chrome 22.
  * Permissions:  "fontSettings"
  */
object fontSettings {
  
  type DefaultFixedFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
  
  type DefaultFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
  
  trait DefaultFontSizeDetails extends StObject {
    
    /** The font size in pixels. */
    var pixelSize: Double
  }
  object DefaultFontSizeDetails {
    
    inline def apply(pixelSize: Double): DefaultFontSizeDetails = {
      val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultFontSizeDetails]
    }
    
    extension [Self <: DefaultFontSizeDetails](x: Self) {
      
      inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    }
  }
  
  type FontChangedEvent = Event[js.Function1[/* details */ FullFontDetails, Unit]]
  
  trait FontDetails extends StObject {
    
    /** The generic font family for the font. */
    var genericFamily: cursive | fantasy | fixed | sansserif | serif | standard
    
    /** Optional. The script for the font. If omitted, the global script font setting is affected.  */
    var script: js.UndefOr[String] = js.undefined
  }
  object FontDetails {
    
    inline def apply(genericFamily: cursive | fantasy | fixed | sansserif | serif | standard): FontDetails = {
      val __obj = js.Dynamic.literal(genericFamily = genericFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontDetails]
    }
    
    extension [Self <: FontDetails](x: Self) {
      
      inline def setGenericFamily(value: cursive | fantasy | fixed | sansserif | serif | standard): Self = StObject.set(x, "genericFamily", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  trait FontDetailsResult extends StObject {
    
    /** The font ID. Rather than the literal font ID preference value, this may be the ID of the font that the system resolves the preference value to. So, fontId can differ from the font passed to setFont, if, for example, the font is not available on the system. The empty string signifies fallback to the global script font setting. */
    var fontId: String
    
    /** The level of control this extension has over the setting. */
    var levelOfControl: String
  }
  object FontDetailsResult {
    
    inline def apply(fontId: String, levelOfControl: String): FontDetailsResult = {
      val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], levelOfControl = levelOfControl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontDetailsResult]
    }
    
    extension [Self <: FontDetailsResult](x: Self) {
      
      inline def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
      
      inline def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontName extends StObject {
    
    /** The display name of the font. */
    var displayName: String
    
    /** The font ID. */
    var fontId: String
  }
  object FontName {
    
    inline def apply(displayName: String, fontId: String): FontName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fontId = fontId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontName]
    }
    
    extension [Self <: FontName](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontSizeDetails extends StObject {
    
    /** The level of control this extension has over the setting. */
    var levelOfControl: String
    
    /** The font size in pixels. */
    var pixelSize: Double
  }
  object FontSizeDetails {
    
    inline def apply(levelOfControl: String, pixelSize: Double): FontSizeDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontSizeDetails]
    }
    
    extension [Self <: FontSizeDetails](x: Self) {
      
      inline def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullFontDetails extends StObject {
    
    /** The font ID. See the description in getFont. */
    var fontId: String
    
    /** The generic font family for which the font setting has changed. */
    var genericFamily: String
    
    /** The level of control this extension has over the setting. */
    var levelOfControl: String
    
    /** Optional. The script code for which the font setting has changed.  */
    var script: js.UndefOr[String] = js.undefined
  }
  object FullFontDetails {
    
    inline def apply(fontId: String, genericFamily: String, levelOfControl: String): FullFontDetails = {
      val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], genericFamily = genericFamily.asInstanceOf[js.Any], levelOfControl = levelOfControl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullFontDetails]
    }
    
    extension [Self <: FullFontDetails](x: Self) {
      
      inline def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
      
      inline def setGenericFamily(value: String): Self = StObject.set(x, "genericFamily", value.asInstanceOf[js.Any])
      
      inline def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  type MinimumFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
  
  trait SetFontDetails
    extends StObject
       with FontDetails {
    
    /** The font ID. The empty string means to fallback to the global script font setting. */
    var fontId: String
  }
  object SetFontDetails {
    
    inline def apply(fontId: String, genericFamily: cursive | fantasy | fixed | sansserif | serif | standard): SetFontDetails = {
      val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], genericFamily = genericFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetFontDetails]
    }
    
    extension [Self <: SetFontDetails](x: Self) {
      
      inline def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetFontSizeDetails extends StObject {
    
    /** The font size in pixels. */
    var pixelSize: Double
  }
  object SetFontSizeDetails {
    
    inline def apply(pixelSize: Double): SetFontSizeDetails = {
      val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetFontSizeDetails]
    }
    
    extension [Self <: SetFontSizeDetails](x: Self) {
      
      inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    }
  }
}
