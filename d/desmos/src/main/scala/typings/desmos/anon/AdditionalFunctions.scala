package typings.desmos.anon

import typings.desmos.desmosStrings.exponent
import typings.desmos.desmosStrings.fraction
import typings.desmos.desmosStrings.nemeth
import typings.desmos.desmosStrings.none_
import typings.desmos.desmosStrings.percent
import typings.desmos.desmosStrings.sqrt
import typings.desmos.desmosStrings.ueb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalFunctions extends StObject {
  
  /**
    * Picks the extra function(s) that appear in the top bar. Maximum 2, minimum 1.
    * @default ["sqrt"]
    */
  var additionalFunctions: js.UndefOr[
    exponent | percent | fraction | sqrt | (js.Array[exponent | percent | fraction | sqrt])
  ] = js.undefined
  
  /**
    * Set the input and output Braille code for persons using refreshable Braille displays.
    * @default "none"
    */
  var brailleMode: js.UndefOr[nemeth | ueb | none_] = js.undefined
  
  /**
    * Limit the size of an expression to 100 characters.
    * @default false
    */
  var capExpressionSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, users are able to toggle between decimal and fraction output in evaluations if Desmos detects a good rational approximation.
    * @default false
    */
  var decimalToFraction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Base font size.
    * @default 16
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Display the calculator with an inverted color scheme.
    * @default false
    */
  var invertedColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Language. See the Languages section for more information.
    * @default "en"
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Allow external hyperlinks (e.g. to braille examples)
    * @default true
    */
  var links: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display the calculator in a larger font.
    * @default false
    */
  var projectorMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display the settings menu.
    * @default true
    */
  var settingsMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow users to write six-dot Braille characters using the Home Row keys (S, D, F, J, K, and L). Requires that brailleMode be 'nemeth' or 'ueb'.
    * @default false
    */
  var sixKeyInput: js.UndefOr[Boolean] = js.undefined
}
object AdditionalFunctions {
  
  inline def apply(): AdditionalFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalFunctions]
  }
  
  extension [Self <: AdditionalFunctions](x: Self) {
    
    inline def setAdditionalFunctions(value: exponent | percent | fraction | sqrt | (js.Array[exponent | percent | fraction | sqrt])): Self = StObject.set(x, "additionalFunctions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFunctionsUndefined: Self = StObject.set(x, "additionalFunctions", js.undefined)
    
    inline def setAdditionalFunctionsVarargs(value: (exponent | percent | fraction | sqrt)*): Self = StObject.set(x, "additionalFunctions", js.Array(value*))
    
    inline def setBrailleMode(value: nemeth | ueb | none_): Self = StObject.set(x, "brailleMode", value.asInstanceOf[js.Any])
    
    inline def setBrailleModeUndefined: Self = StObject.set(x, "brailleMode", js.undefined)
    
    inline def setCapExpressionSize(value: Boolean): Self = StObject.set(x, "capExpressionSize", value.asInstanceOf[js.Any])
    
    inline def setCapExpressionSizeUndefined: Self = StObject.set(x, "capExpressionSize", js.undefined)
    
    inline def setDecimalToFraction(value: Boolean): Self = StObject.set(x, "decimalToFraction", value.asInstanceOf[js.Any])
    
    inline def setDecimalToFractionUndefined: Self = StObject.set(x, "decimalToFraction", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setInvertedColors(value: Boolean): Self = StObject.set(x, "invertedColors", value.asInstanceOf[js.Any])
    
    inline def setInvertedColorsUndefined: Self = StObject.set(x, "invertedColors", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLinks(value: Boolean): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setProjectorMode(value: Boolean): Self = StObject.set(x, "projectorMode", value.asInstanceOf[js.Any])
    
    inline def setProjectorModeUndefined: Self = StObject.set(x, "projectorMode", js.undefined)
    
    inline def setSettingsMenu(value: Boolean): Self = StObject.set(x, "settingsMenu", value.asInstanceOf[js.Any])
    
    inline def setSettingsMenuUndefined: Self = StObject.set(x, "settingsMenu", js.undefined)
    
    inline def setSixKeyInput(value: Boolean): Self = StObject.set(x, "sixKeyInput", value.asInstanceOf[js.Any])
    
    inline def setSixKeyInputUndefined: Self = StObject.set(x, "sixKeyInput", js.undefined)
  }
}
