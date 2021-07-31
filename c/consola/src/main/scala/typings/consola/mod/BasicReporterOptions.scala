package typings.consola.mod

import typings.node.utilMod.InspectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicReporterOptions extends StObject {
  
  var dateFormat: js.UndefOr[String] = js.undefined
  
  var formatOptions: js.UndefOr[InspectOptions] = js.undefined
}
object BasicReporterOptions {
  
  @scala.inline
  def apply(): BasicReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicReporterOptions]
  }
  
  @scala.inline
  implicit class BasicReporterOptionsMutableBuilder[Self <: BasicReporterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setFormatOptions(value: InspectOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
  }
}
