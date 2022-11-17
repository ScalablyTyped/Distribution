package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeOptions extends StObject {
  
  var includeOptions: Boolean
  
  var sharedOptions: Any
}
object IncludeOptions {
  
  inline def apply(includeOptions: Boolean, sharedOptions: Any): IncludeOptions = {
    val __obj = js.Dynamic.literal(includeOptions = includeOptions.asInstanceOf[js.Any], sharedOptions = sharedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeOptions]
  }
  
  extension [Self <: IncludeOptions](x: Self) {
    
    inline def setIncludeOptions(value: Boolean): Self = StObject.set(x, "includeOptions", value.asInstanceOf[js.Any])
    
    inline def setSharedOptions(value: Any): Self = StObject.set(x, "sharedOptions", value.asInstanceOf[js.Any])
  }
}
