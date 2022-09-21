package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdFormat extends StObject {
  
  /**
    * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
    */
  var Deadline: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of resource.
    */
  var Resource: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
    */
  var UseLongIds: js.UndefOr[Boolean] = js.undefined
}
object IdFormat {
  
  inline def apply(): IdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFormat]
  }
  
  extension [Self <: IdFormat](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "Deadline", value.asInstanceOf[js.Any])
    
    inline def setDeadlineUndefined: Self = StObject.set(x, "Deadline", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setUseLongIds(value: Boolean): Self = StObject.set(x, "UseLongIds", value.asInstanceOf[js.Any])
    
    inline def setUseLongIdsUndefined: Self = StObject.set(x, "UseLongIds", js.undefined)
  }
}
