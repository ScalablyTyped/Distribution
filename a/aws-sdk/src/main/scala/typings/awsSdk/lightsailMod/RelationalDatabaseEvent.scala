package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseEvent extends StObject {
  
  /**
    * The timestamp when the database event was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The category that the database event belongs to.
    */
  var eventCategories: js.UndefOr[StringList] = js.native
  
  /**
    * The message of the database event.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The database that the database event relates to.
    */
  var resource: js.UndefOr[ResourceName] = js.native
}
object RelationalDatabaseEvent {
  
  @scala.inline
  def apply(): RelationalDatabaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseEvent]
  }
  
  @scala.inline
  implicit class RelationalDatabaseEventMutableBuilder[Self <: RelationalDatabaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setEventCategories(value: StringList): Self = StObject.set(x, "eventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesUndefined: Self = StObject.set(x, "eventCategories", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "eventCategories", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setResource(value: ResourceName): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
