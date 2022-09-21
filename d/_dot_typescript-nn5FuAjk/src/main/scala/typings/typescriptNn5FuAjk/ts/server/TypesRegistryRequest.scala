package typings.typescriptNn5FuAjk.ts.server

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.typesRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesRegistryRequest extends StObject {
  
  val kind: typesRegistry
}
object TypesRegistryRequest {
  
  inline def apply(): TypesRegistryRequest = {
    val __obj = js.Dynamic.literal(kind = "typesRegistry")
    __obj.asInstanceOf[TypesRegistryRequest]
  }
  
  extension [Self <: TypesRegistryRequest](x: Self) {
    
    inline def setKind(value: typesRegistry): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
