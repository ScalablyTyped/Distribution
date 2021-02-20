package typings.canAutoplay

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("can-autoplay", "audio")
  @js.native
  def audio(): js.Promise[CheckResponse] = js.native
  @JSImport("can-autoplay", "audio")
  @js.native
  def audio(options: Options): js.Promise[CheckResponse] = js.native
  
  @JSImport("can-autoplay", "video")
  @js.native
  def video(): js.Promise[CheckResponse] = js.native
  @JSImport("can-autoplay", "video")
  @js.native
  def video(options: Options): js.Promise[CheckResponse] = js.native
  
  @js.native
  trait CheckResponse extends StObject {
    
    var error: Error = js.native
    
    var result: Boolean = js.native
  }
  object CheckResponse {
    
    @scala.inline
    def apply(error: Error, result: Boolean): CheckResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckResponse]
    }
    
    @scala.inline
    implicit class CheckResponseMutableBuilder[Self <: CheckResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
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
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
