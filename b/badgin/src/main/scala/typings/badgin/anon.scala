package typings.badgin

import typings.badgin.faviconMod.Options
import typings.badgin.mod.Method
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Clear extends StObject {
    
    def clear(): Unit = js.native
    
    def set(): Unit = js.native
    def set(value: Double): Unit = js.native
  }
  
  /* Inlined std.Partial<badgin.badgin/build/favicon.Options> */
  trait PartialOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var horizontalMargin: js.UndefOr[Double] = js.undefined
    
    var horizontalPadding: js.UndefOr[Double] = js.undefined
    
    var indicator: js.UndefOr[String] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var verticalMargin: js.UndefOr[Double] = js.undefined
    
    var verticalPadding: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHorizontalMargin(value: Double): Self = StObject.set(x, "horizontalMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalMarginUndefined: Self = StObject.set(x, "horizontalMargin", js.undefined)
      
      @scala.inline
      def setHorizontalPadding(value: Double): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalPaddingUndefined: Self = StObject.set(x, "horizontalPadding", js.undefined)
      
      @scala.inline
      def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVerticalMargin(value: Double): Self = StObject.set(x, "verticalMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalMarginUndefined: Self = StObject.set(x, "verticalMargin", js.undefined)
      
      @scala.inline
      def setVerticalPadding(value: Double): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPaddingUndefined: Self = StObject.set(x, "verticalPadding", js.undefined)
    }
  }
  
  /* Inlined std.Partial<badgin.badgin.Options> */
  trait PartialOptionsFavicon extends StObject {
    
    var favicon: js.UndefOr[Partial[Options]] = js.undefined
    
    var method: js.UndefOr[Method] = js.undefined
    
    var title: js.UndefOr[Partial[typings.badgin.titleMod.Options]] = js.undefined
  }
  object PartialOptionsFavicon {
    
    @scala.inline
    def apply(): PartialOptionsFavicon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsFavicon]
    }
    
    @scala.inline
    implicit class PartialOptionsFaviconMutableBuilder[Self <: PartialOptionsFavicon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFavicon(value: Partial[Options]): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setTitle(value: Partial[typings.badgin.titleMod.Options]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined std.Partial<badgin.badgin/build/title.Options> */
  trait PartialOptionsIndicator extends StObject {
    
    var indicator: js.UndefOr[String] = js.undefined
  }
  object PartialOptionsIndicator {
    
    @scala.inline
    def apply(): PartialOptionsIndicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsIndicator]
    }
    
    @scala.inline
    implicit class PartialOptionsIndicatorMutableBuilder[Self <: PartialOptionsIndicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    }
  }
}
