package typings.copyToClipboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("copy-to-clipboard", JSImport.Namespace)
  @js.native
  def apply(text: String): Boolean = js.native
  @JSImport("copy-to-clipboard", JSImport.Namespace)
  @js.native
  def apply(text: String, options: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    // MIME type
    var onCopy: js.UndefOr[js.Function1[/* clipboardData */ js.Object, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnCopy(value: /* clipboardData */ js.Object => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    }
  }
}
