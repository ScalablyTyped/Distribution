package typings.canvg

import typings.canvg.documentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgfontloaderMod {
  
  @JSImport("canvg/dist/SVGFontLoader", "SVGFontLoader")
  @js.native
  open class SVGFontLoader protected () extends StObject {
    def this(document: Document) = this()
    
    /* private */ val document: Any = js.native
    
    def load(fontFamily: String, url: String): js.Promise[Unit] = js.native
    
    var loaded: Boolean = js.native
  }
}
