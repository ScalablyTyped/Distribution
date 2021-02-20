package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions extends StObject {
  
  /**
    * Set formatter for the label on each pie piece.
    */
  var format: js.UndefOr[
    js.Function3[/* value */ Double, /* ratio */ Double, /* id */ String, String | Double]
  ] = js.native
  
  /**
    * Show or hide label on each pie piece.
    */
  var show: js.UndefOr[Boolean] = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit class LabelOptionsMutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: (/* value */ Double, /* ratio */ Double, /* id */ String) => String | Double): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
