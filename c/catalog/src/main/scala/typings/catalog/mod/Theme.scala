package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var background: String
  
  var baseFontSize: Double
  
  var bgDark: String
  
  var bgLight: String
  
  var brandColor: String
  
  var checkerboardPatternDark: String
  
  var checkerboardPatternLight: String
  
  var codeColor: String
  
  var codeStyles: StringDictionary[StringDictionary[String]]
  
  var fontFamily: String
  
  var fontHeading: String
  
  var fontMono: String
  
  var lightColor: String
  
  var linkColor: String
  
  var msRatio: Double
  
  var navBarBackground: String
  
  var navBarTextColor: String
  
  var pageHeadingBackground: String
  
  var pageHeadingHeight: Double
  
  var pageHeadingTextColor: String
  
  var sidebarColor: String
  
  var sidebarColorActive: String
  
  var sidebarColorHeading: String
  
  var sidebarColorLine: String
  
  var sidebarColorText: String
  
  var sidebarColorTextActive: String
  
  var textColor: String
}
object Theme {
  
  inline def apply(
    background: String,
    baseFontSize: Double,
    bgDark: String,
    bgLight: String,
    brandColor: String,
    checkerboardPatternDark: String,
    checkerboardPatternLight: String,
    codeColor: String,
    codeStyles: StringDictionary[StringDictionary[String]],
    fontFamily: String,
    fontHeading: String,
    fontMono: String,
    lightColor: String,
    linkColor: String,
    msRatio: Double,
    navBarBackground: String,
    navBarTextColor: String,
    pageHeadingBackground: String,
    pageHeadingHeight: Double,
    pageHeadingTextColor: String,
    sidebarColor: String,
    sidebarColorActive: String,
    sidebarColorHeading: String,
    sidebarColorLine: String,
    sidebarColorText: String,
    sidebarColorTextActive: String,
    textColor: String
  ): Theme = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], baseFontSize = baseFontSize.asInstanceOf[js.Any], bgDark = bgDark.asInstanceOf[js.Any], bgLight = bgLight.asInstanceOf[js.Any], brandColor = brandColor.asInstanceOf[js.Any], checkerboardPatternDark = checkerboardPatternDark.asInstanceOf[js.Any], checkerboardPatternLight = checkerboardPatternLight.asInstanceOf[js.Any], codeColor = codeColor.asInstanceOf[js.Any], codeStyles = codeStyles.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontHeading = fontHeading.asInstanceOf[js.Any], fontMono = fontMono.asInstanceOf[js.Any], lightColor = lightColor.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], msRatio = msRatio.asInstanceOf[js.Any], navBarBackground = navBarBackground.asInstanceOf[js.Any], navBarTextColor = navBarTextColor.asInstanceOf[js.Any], pageHeadingBackground = pageHeadingBackground.asInstanceOf[js.Any], pageHeadingHeight = pageHeadingHeight.asInstanceOf[js.Any], pageHeadingTextColor = pageHeadingTextColor.asInstanceOf[js.Any], sidebarColor = sidebarColor.asInstanceOf[js.Any], sidebarColorActive = sidebarColorActive.asInstanceOf[js.Any], sidebarColorHeading = sidebarColorHeading.asInstanceOf[js.Any], sidebarColorLine = sidebarColorLine.asInstanceOf[js.Any], sidebarColorText = sidebarColorText.asInstanceOf[js.Any], sidebarColorTextActive = sidebarColorTextActive.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    inline def setBgDark(value: String): Self = StObject.set(x, "bgDark", value.asInstanceOf[js.Any])
    
    inline def setBgLight(value: String): Self = StObject.set(x, "bgLight", value.asInstanceOf[js.Any])
    
    inline def setBrandColor(value: String): Self = StObject.set(x, "brandColor", value.asInstanceOf[js.Any])
    
    inline def setCheckerboardPatternDark(value: String): Self = StObject.set(x, "checkerboardPatternDark", value.asInstanceOf[js.Any])
    
    inline def setCheckerboardPatternLight(value: String): Self = StObject.set(x, "checkerboardPatternLight", value.asInstanceOf[js.Any])
    
    inline def setCodeColor(value: String): Self = StObject.set(x, "codeColor", value.asInstanceOf[js.Any])
    
    inline def setCodeStyles(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "codeStyles", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontHeading(value: String): Self = StObject.set(x, "fontHeading", value.asInstanceOf[js.Any])
    
    inline def setFontMono(value: String): Self = StObject.set(x, "fontMono", value.asInstanceOf[js.Any])
    
    inline def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
    
    inline def setMsRatio(value: Double): Self = StObject.set(x, "msRatio", value.asInstanceOf[js.Any])
    
    inline def setNavBarBackground(value: String): Self = StObject.set(x, "navBarBackground", value.asInstanceOf[js.Any])
    
    inline def setNavBarTextColor(value: String): Self = StObject.set(x, "navBarTextColor", value.asInstanceOf[js.Any])
    
    inline def setPageHeadingBackground(value: String): Self = StObject.set(x, "pageHeadingBackground", value.asInstanceOf[js.Any])
    
    inline def setPageHeadingHeight(value: Double): Self = StObject.set(x, "pageHeadingHeight", value.asInstanceOf[js.Any])
    
    inline def setPageHeadingTextColor(value: String): Self = StObject.set(x, "pageHeadingTextColor", value.asInstanceOf[js.Any])
    
    inline def setSidebarColor(value: String): Self = StObject.set(x, "sidebarColor", value.asInstanceOf[js.Any])
    
    inline def setSidebarColorActive(value: String): Self = StObject.set(x, "sidebarColorActive", value.asInstanceOf[js.Any])
    
    inline def setSidebarColorHeading(value: String): Self = StObject.set(x, "sidebarColorHeading", value.asInstanceOf[js.Any])
    
    inline def setSidebarColorLine(value: String): Self = StObject.set(x, "sidebarColorLine", value.asInstanceOf[js.Any])
    
    inline def setSidebarColorText(value: String): Self = StObject.set(x, "sidebarColorText", value.asInstanceOf[js.Any])
    
    inline def setSidebarColorTextActive(value: String): Self = StObject.set(x, "sidebarColorTextActive", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
