package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelOptions extends StObject {
  
  var hasTimestamps: js.UndefOr[Boolean] = js.undefined
  
  var parse: js.UndefOr[Boolean] = js.undefined
  
  var tableName: js.UndefOr[String] = js.undefined
}
object ModelOptions {
  
  inline def apply(): ModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelOptions]
  }
  
  extension [Self <: ModelOptions](x: Self) {
    
    inline def setHasTimestamps(value: Boolean): Self = StObject.set(x, "hasTimestamps", value.asInstanceOf[js.Any])
    
    inline def setHasTimestampsUndefined: Self = StObject.set(x, "hasTimestamps", js.undefined)
    
    inline def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
