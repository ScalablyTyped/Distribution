package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStudioResponse extends StObject {
  
  /**
    * Information about a studio.
    */
  var studio: Studio
}
object DeleteStudioResponse {
  
  inline def apply(studio: Studio): DeleteStudioResponse = {
    val __obj = js.Dynamic.literal(studio = studio.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStudioResponse]
  }
  
  extension [Self <: DeleteStudioResponse](x: Self) {
    
    inline def setStudio(value: Studio): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
  }
}
