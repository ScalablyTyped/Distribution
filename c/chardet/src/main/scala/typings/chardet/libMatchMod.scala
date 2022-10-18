package typings.chardet

import typings.chardet.libEncodingMod.Context
import typings.chardet.libEncodingMod.Recogniser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatchMod {
  
  @JSImport("chardet/lib/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ctx: Context, rec: Recogniser, confidence: Double): Match = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ctx.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Match]
  
  trait Match extends StObject {
    
    var confidence: Double
    
    var lang: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Match {
    
    inline def apply(confidence: Double, name: String): Match = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
