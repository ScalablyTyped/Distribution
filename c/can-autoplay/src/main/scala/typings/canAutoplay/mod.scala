package typings.canAutoplay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("can-autoplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def audio(): js.Promise[CheckResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("audio")().asInstanceOf[js.Promise[CheckResponse]]
  inline def audio(options: Options): js.Promise[CheckResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("audio")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CheckResponse]]
  
  inline def video(): js.Promise[CheckResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("video")().asInstanceOf[js.Promise[CheckResponse]]
  inline def video(options: Options): js.Promise[CheckResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("video")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CheckResponse]]
  
  trait CheckResponse extends StObject {
    
    var error: js.Error
    
    var result: Boolean
  }
  object CheckResponse {
    
    inline def apply(error: js.Error, result: Boolean): CheckResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckResponse] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
