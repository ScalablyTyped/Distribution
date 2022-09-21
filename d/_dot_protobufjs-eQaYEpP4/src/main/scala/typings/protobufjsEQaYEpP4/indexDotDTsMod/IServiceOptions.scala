package typings.protobufjsEQaYEpP4.indexDotDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServiceOptions extends StObject {
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
}
object IServiceOptions {
  
  inline def apply(): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceOptions]
  }
  
  extension [Self <: IServiceOptions](x: Self) {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
  }
}
