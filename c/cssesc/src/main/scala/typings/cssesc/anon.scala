package typings.cssesc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Partial<cssesc.cssesc.Options>> */
  trait ReadonlyPartialOptions extends StObject {
    
    val escapeEverything: js.UndefOr[Boolean] = js.undefined
    
    val isIdentifier: js.UndefOr[Boolean] = js.undefined
    
    val quotes: js.UndefOr[String] = js.undefined
    
    val wrap: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyPartialOptions {
    
    @scala.inline
    def apply(): ReadonlyPartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialOptions]
    }
    
    @scala.inline
    implicit class ReadonlyPartialOptionsMutableBuilder[Self <: ReadonlyPartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscapeEverything(value: Boolean): Self = StObject.set(x, "escapeEverything", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeEverythingUndefined: Self = StObject.set(x, "escapeEverything", js.undefined)
      
      @scala.inline
      def setIsIdentifier(value: Boolean): Self = StObject.set(x, "isIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIdentifierUndefined: Self = StObject.set(x, "isIdentifier", js.undefined)
      
      @scala.inline
      def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
