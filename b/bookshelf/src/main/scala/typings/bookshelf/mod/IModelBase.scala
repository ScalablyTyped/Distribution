package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelBase extends StObject {
  
  /** Should be declared as a getter instead of a plain property. */
  var hasTimestamps: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /** Should be declared as a getter instead of a plain property. Should be required, but cannot have abstract properties yet. */
  var tableName: js.UndefOr[String] = js.undefined
}
object IModelBase {
  
  inline def apply(): IModelBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelBase]
  }
  
  extension [Self <: IModelBase](x: Self) {
    
    inline def setHasTimestamps(value: Boolean | js.Array[String]): Self = StObject.set(x, "hasTimestamps", value.asInstanceOf[js.Any])
    
    inline def setHasTimestampsUndefined: Self = StObject.set(x, "hasTimestamps", js.undefined)
    
    inline def setHasTimestampsVarargs(value: String*): Self = StObject.set(x, "hasTimestamps", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
