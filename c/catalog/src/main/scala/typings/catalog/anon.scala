package typings.catalog

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: ComponentType[js.Object]
  }
  object Default {
    
    inline def apply(default: ComponentType[js.Object]): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: ComponentType[js.Object]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<catalog.catalog.Theme> */
  trait PartialTheme extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var baseFontSize: js.UndefOr[Double] = js.undefined
    
    var bgDark: js.UndefOr[String] = js.undefined
    
    var bgLight: js.UndefOr[String] = js.undefined
    
    var brandColor: js.UndefOr[String] = js.undefined
    
    var checkerboardPatternDark: js.UndefOr[String] = js.undefined
    
    var checkerboardPatternLight: js.UndefOr[String] = js.undefined
    
    var codeColor: js.UndefOr[String] = js.undefined
    
    var codeStyles: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontHeading: js.UndefOr[String] = js.undefined
    
    var fontMono: js.UndefOr[String] = js.undefined
    
    var lightColor: js.UndefOr[String] = js.undefined
    
    var linkColor: js.UndefOr[String] = js.undefined
    
    var msRatio: js.UndefOr[Double] = js.undefined
    
    var navBarBackground: js.UndefOr[String] = js.undefined
    
    var navBarTextColor: js.UndefOr[String] = js.undefined
    
    var pageHeadingBackground: js.UndefOr[String] = js.undefined
    
    var pageHeadingHeight: js.UndefOr[Double] = js.undefined
    
    var pageHeadingTextColor: js.UndefOr[String] = js.undefined
    
    var sidebarColor: js.UndefOr[String] = js.undefined
    
    var sidebarColorActive: js.UndefOr[String] = js.undefined
    
    var sidebarColorHeading: js.UndefOr[String] = js.undefined
    
    var sidebarColorLine: js.UndefOr[String] = js.undefined
    
    var sidebarColorText: js.UndefOr[String] = js.undefined
    
    var sidebarColorTextActive: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
  }
  object PartialTheme {
    
    inline def apply(): PartialTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTheme]
    }
    
    extension [Self <: PartialTheme](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      inline def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
      
      inline def setBgDark(value: String): Self = StObject.set(x, "bgDark", value.asInstanceOf[js.Any])
      
      inline def setBgDarkUndefined: Self = StObject.set(x, "bgDark", js.undefined)
      
      inline def setBgLight(value: String): Self = StObject.set(x, "bgLight", value.asInstanceOf[js.Any])
      
      inline def setBgLightUndefined: Self = StObject.set(x, "bgLight", js.undefined)
      
      inline def setBrandColor(value: String): Self = StObject.set(x, "brandColor", value.asInstanceOf[js.Any])
      
      inline def setBrandColorUndefined: Self = StObject.set(x, "brandColor", js.undefined)
      
      inline def setCheckerboardPatternDark(value: String): Self = StObject.set(x, "checkerboardPatternDark", value.asInstanceOf[js.Any])
      
      inline def setCheckerboardPatternDarkUndefined: Self = StObject.set(x, "checkerboardPatternDark", js.undefined)
      
      inline def setCheckerboardPatternLight(value: String): Self = StObject.set(x, "checkerboardPatternLight", value.asInstanceOf[js.Any])
      
      inline def setCheckerboardPatternLightUndefined: Self = StObject.set(x, "checkerboardPatternLight", js.undefined)
      
      inline def setCodeColor(value: String): Self = StObject.set(x, "codeColor", value.asInstanceOf[js.Any])
      
      inline def setCodeColorUndefined: Self = StObject.set(x, "codeColor", js.undefined)
      
      inline def setCodeStyles(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "codeStyles", value.asInstanceOf[js.Any])
      
      inline def setCodeStylesUndefined: Self = StObject.set(x, "codeStyles", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontHeading(value: String): Self = StObject.set(x, "fontHeading", value.asInstanceOf[js.Any])
      
      inline def setFontHeadingUndefined: Self = StObject.set(x, "fontHeading", js.undefined)
      
      inline def setFontMono(value: String): Self = StObject.set(x, "fontMono", value.asInstanceOf[js.Any])
      
      inline def setFontMonoUndefined: Self = StObject.set(x, "fontMono", js.undefined)
      
      inline def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
      
      inline def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      inline def setLinkColorUndefined: Self = StObject.set(x, "linkColor", js.undefined)
      
      inline def setMsRatio(value: Double): Self = StObject.set(x, "msRatio", value.asInstanceOf[js.Any])
      
      inline def setMsRatioUndefined: Self = StObject.set(x, "msRatio", js.undefined)
      
      inline def setNavBarBackground(value: String): Self = StObject.set(x, "navBarBackground", value.asInstanceOf[js.Any])
      
      inline def setNavBarBackgroundUndefined: Self = StObject.set(x, "navBarBackground", js.undefined)
      
      inline def setNavBarTextColor(value: String): Self = StObject.set(x, "navBarTextColor", value.asInstanceOf[js.Any])
      
      inline def setNavBarTextColorUndefined: Self = StObject.set(x, "navBarTextColor", js.undefined)
      
      inline def setPageHeadingBackground(value: String): Self = StObject.set(x, "pageHeadingBackground", value.asInstanceOf[js.Any])
      
      inline def setPageHeadingBackgroundUndefined: Self = StObject.set(x, "pageHeadingBackground", js.undefined)
      
      inline def setPageHeadingHeight(value: Double): Self = StObject.set(x, "pageHeadingHeight", value.asInstanceOf[js.Any])
      
      inline def setPageHeadingHeightUndefined: Self = StObject.set(x, "pageHeadingHeight", js.undefined)
      
      inline def setPageHeadingTextColor(value: String): Self = StObject.set(x, "pageHeadingTextColor", value.asInstanceOf[js.Any])
      
      inline def setPageHeadingTextColorUndefined: Self = StObject.set(x, "pageHeadingTextColor", js.undefined)
      
      inline def setSidebarColor(value: String): Self = StObject.set(x, "sidebarColor", value.asInstanceOf[js.Any])
      
      inline def setSidebarColorActive(value: String): Self = StObject.set(x, "sidebarColorActive", value.asInstanceOf[js.Any])
      
      inline def setSidebarColorActiveUndefined: Self = StObject.set(x, "sidebarColorActive", js.undefined)
      
      inline def setSidebarColorHeading(value: String): Self = StObject.set(x, "sidebarColorHeading", value.asInstanceOf[js.Any])
      
      inline def setSidebarColorHeadingUndefined: Self = StObject.set(x, "sidebarColorHeading", js.undefined)
      
      inline def setSidebarColorLine(value: String): Self = StObject.set(x, "sidebarColorLine", value.asInstanceOf[js.Any])
      
      inline def setSidebarColorLineUndefined: Self = StObject.set(x, "sidebarColorLine", js.undefined)
      
      inline def setSidebarColorText(value: String): Self = StObject.set(x, "sidebarColorText", value.asInstanceOf[js.Any])
      
      inline def setSidebarColorTextActive(value: String): Self = StObject.set(x, "sidebarColorTextActive", value.asInstanceOf[js.Any])
      
      inline def setSidebarColorTextActiveUndefined: Self = StObject.set(x, "sidebarColorTextActive", js.undefined)
      
      inline def setSidebarColorTextUndefined: Self = StObject.set(x, "sidebarColorText", js.undefined)
      
      inline def setSidebarColorUndefined: Self = StObject.set(x, "sidebarColor", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
}
