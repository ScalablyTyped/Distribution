package typings.vegaLite8ozrbXDH.dataDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBase extends StObject {
  
  /**
    * An object that specifies the format for parsing the data.
    */
  var format: js.UndefOr[DataFormat] = js.undefined
  
  /**
    * Provide a placeholder name and bind data at runtime.
    */
  var name: js.UndefOr[String] = js.undefined
}
object DataBase {
  
  inline def apply(): DataBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBase]
  }
  
  extension [Self <: DataBase](x: Self) {
    
    inline def setFormat(value: DataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
