package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSourceLocationRequest extends StObject {
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
}
object DeleteSourceLocationRequest {
  
  inline def apply(SourceLocationName: string): DeleteSourceLocationRequest = {
    val __obj = js.Dynamic.literal(SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSourceLocationRequest]
  }
  
  extension [Self <: DeleteSourceLocationRequest](x: Self) {
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
