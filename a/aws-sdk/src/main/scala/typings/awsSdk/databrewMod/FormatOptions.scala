package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatOptions extends StObject {
  
  /**
    * Options that define how Excel input is to be interpreted by DataBrew.
    */
  var Excel: js.UndefOr[ExcelOptions] = js.undefined
  
  /**
    * Options that define how JSON input is to be interpreted by DataBrew.
    */
  var Json: js.UndefOr[JsonOptions] = js.undefined
}
object FormatOptions {
  
  inline def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  extension [Self <: FormatOptions](x: Self) {
    
    inline def setExcel(value: ExcelOptions): Self = StObject.set(x, "Excel", value.asInstanceOf[js.Any])
    
    inline def setExcelUndefined: Self = StObject.set(x, "Excel", js.undefined)
    
    inline def setJson(value: JsonOptions): Self = StObject.set(x, "Json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "Json", js.undefined)
  }
}
