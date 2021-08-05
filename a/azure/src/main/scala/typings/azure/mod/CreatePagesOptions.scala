package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePagesOptions
  extends StObject
     with LeaseAccessConditionsOptions {
  
  var contentMD5: js.UndefOr[String] = js.undefined
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
}
object CreatePagesOptions {
  
  inline def apply(): CreatePagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePagesOptions]
  }
  
  extension [Self <: CreatePagesOptions](x: Self) {
    
    inline def setContentMD5(value: String): Self = StObject.set(x, "contentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "contentMD5", js.undefined)
    
    inline def setUseTransactionalMD5(value: Boolean): Self = StObject.set(x, "useTransactionalMD5", value.asInstanceOf[js.Any])
    
    inline def setUseTransactionalMD5Undefined: Self = StObject.set(x, "useTransactionalMD5", js.undefined)
  }
}
