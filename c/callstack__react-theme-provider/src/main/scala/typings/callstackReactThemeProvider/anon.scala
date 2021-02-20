package typings.callstackReactThemeProvider

import typings.callstackReactThemeProvider.mod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[Theme] extends StObject {
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[Theme](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], Theme] (val x: Self with `0`[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait `1`[Theme] extends StObject {
    
    var theme: js.UndefOr[DeepPartial[Theme]] = js.native
  }
  object `1` {
    
    @scala.inline
    def apply[Theme](): `1`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`[Theme]]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`[_], Theme] (val x: Self with `1`[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: DeepPartial[Theme]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ThemeTheme[Theme] extends StObject {
    
    var theme: Theme = js.native
  }
  object ThemeTheme {
    
    @scala.inline
    def apply[Theme](theme: Theme): ThemeTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme[Theme]]
    }
    
    @scala.inline
    implicit class ThemeThemeMutableBuilder[Self <: ThemeTheme[_], Theme] (val x: Self with ThemeTheme[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
