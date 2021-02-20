package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigTextOptions extends BoxOptions {
  
  /**
    * foreground character. (default: ' ')
    */
  var fch: js.UndefOr[String] = js.native
  
  /**
    * bdf->json font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var font: js.UndefOr[String] = js.native
  
  /**
    * bdf->json bold font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var fontBold: js.UndefOr[String] = js.native
}
object BigTextOptions {
  
  @scala.inline
  def apply(): BigTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigTextOptions]
  }
  
  @scala.inline
  implicit class BigTextOptionsMutableBuilder[Self <: BigTextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFch(value: String): Self = StObject.set(x, "fch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFchUndefined: Self = StObject.set(x, "fch", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBold(value: String): Self = StObject.set(x, "fontBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBoldUndefined: Self = StObject.set(x, "fontBold", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
