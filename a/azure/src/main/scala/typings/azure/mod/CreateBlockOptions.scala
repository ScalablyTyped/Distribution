package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBlockOptions
  extends StObject
     with LeaseAccessConditionsOptions {
  
  var contentMD5: js.UndefOr[String] = js.undefined
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
}
object CreateBlockOptions {
  
  inline def apply(): CreateBlockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBlockOptions]
  }
  
  extension [Self <: CreateBlockOptions](x: Self) {
    
    inline def setContentMD5(value: String): Self = StObject.set(x, "contentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "contentMD5", js.undefined)
    
    inline def setUseTransactionalMD5(value: Boolean): Self = StObject.set(x, "useTransactionalMD5", value.asInstanceOf[js.Any])
    
    inline def setUseTransactionalMD5Undefined: Self = StObject.set(x, "useTransactionalMD5", js.undefined)
  }
}
