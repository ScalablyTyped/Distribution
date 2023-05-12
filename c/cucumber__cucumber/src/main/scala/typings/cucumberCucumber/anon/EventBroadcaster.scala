package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBroadcaster extends StObject {
  
  var eventBroadcaster: EventEmitter
  
  def newId(): String
  @JSName("newId")
  var newId_Original: NewId
  
  var supportCodeLibrary: ISupportCodeLibrary
}
object EventBroadcaster {
  
  inline def apply(eventBroadcaster: EventEmitter, newId: () => String, supportCodeLibrary: ISupportCodeLibrary): EventBroadcaster = {
    val __obj = js.Dynamic.literal(eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBroadcaster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBroadcaster] (val x: Self) extends AnyVal {
    
    inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
    
    inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
    
    inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
  }
}
