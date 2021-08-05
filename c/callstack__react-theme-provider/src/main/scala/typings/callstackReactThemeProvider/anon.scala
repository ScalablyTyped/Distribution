package typings.callstackReactThemeProvider

import typings.callstackReactThemeProvider.mod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Theme] extends StObject {
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object `0` {
    
    inline def apply[Theme](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    extension [Self <: `0`[?], Theme](x: Self & `0`[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait `1`[Theme] extends StObject {
    
    var theme: js.UndefOr[DeepPartial[Theme]] = js.undefined
  }
  object `1` {
    
    inline def apply[Theme](): `1`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`[Theme]]
    }
    
    extension [Self <: `1`[?], Theme](x: Self & `1`[Theme]) {
      
      inline def setTheme(value: DeepPartial[Theme]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ThemeTheme[Theme] extends StObject {
    
    var theme: Theme
  }
  object ThemeTheme {
    
    inline def apply[Theme](theme: Theme): ThemeTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme[Theme]]
    }
    
    extension [Self <: ThemeTheme[?], Theme](x: Self & ThemeTheme[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
