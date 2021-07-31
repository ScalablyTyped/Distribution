package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdFormat extends StObject {
  
  /**
    * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
    */
  var Deadline: js.UndefOr[DateTime] = js.undefined
  
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
  
  @scala.inline
  def apply(): IdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFormat]
  }
  
  @scala.inline
  implicit class IdFormatMutableBuilder[Self <: IdFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: DateTime): Self = StObject.set(x, "Deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineUndefined: Self = StObject.set(x, "Deadline", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    @scala.inline
    def setUseLongIds(value: Boolean): Self = StObject.set(x, "UseLongIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongIdsUndefined: Self = StObject.set(x, "UseLongIds", js.undefined)
  }
}
