package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBObjectStoreParameters extends StObject {
  
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  
  var keyPath: js.UndefOr[java.lang.String | Array[java.lang.String] | Null] = js.undefined
}
object IDBObjectStoreParameters {
  
  inline def apply(): IDBObjectStoreParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBObjectStoreParameters]
  }
  
  extension [Self <: IDBObjectStoreParameters](x: Self) {
    
    inline def setAutoIncrement(value: scala.Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    inline def setKeyPath(value: java.lang.String | Array[java.lang.String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathNull: Self = StObject.set(x, "keyPath", null)
    
    inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
  }
}
