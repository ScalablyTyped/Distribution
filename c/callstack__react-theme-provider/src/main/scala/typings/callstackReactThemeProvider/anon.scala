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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], Theme] (val x: Self & `0`[Theme]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`[?], Theme] (val x: Self & `1`[Theme]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeTheme[?], Theme] (val x: Self & ThemeTheme[Theme]) extends AnyVal {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
