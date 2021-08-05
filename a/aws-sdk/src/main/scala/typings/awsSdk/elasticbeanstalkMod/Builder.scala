package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Builder extends StObject {
  
  /**
    * The ARN of the builder.
    */
  var ARN: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ARN] = js.undefined
}
object Builder {
  
  inline def apply(): Builder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Builder]
  }
  
  extension [Self <: Builder](x: Self) {
    
    inline def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
  }
}
