package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigTextOptions
  extends StObject
     with BoxOptions {
  
  /**
    * foreground character. (default: ' ')
    */
  var fch: js.UndefOr[String] = js.undefined
  
  /**
    * bdf->json font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var font: js.UndefOr[String] = js.undefined
  
  /**
    * bdf->json bold font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var fontBold: js.UndefOr[String] = js.undefined
}
object BigTextOptions {
  
  inline def apply(): BigTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigTextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigTextOptions] (val x: Self) extends AnyVal {
    
    inline def setFch(value: String): Self = StObject.set(x, "fch", value.asInstanceOf[js.Any])
    
    inline def setFchUndefined: Self = StObject.set(x, "fch", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontBold(value: String): Self = StObject.set(x, "fontBold", value.asInstanceOf[js.Any])
    
    inline def setFontBoldUndefined: Self = StObject.set(x, "fontBold", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
