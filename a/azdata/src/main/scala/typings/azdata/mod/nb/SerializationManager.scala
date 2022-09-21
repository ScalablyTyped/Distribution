package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializationManager extends StObject {
  
  /**
    * Manages reading and writing contents to/from files.
    * Files may be local or remote, with this manager giving them a chance to convert and migrate
    * from specific notebook file types to and from a standard type for this UI
    */
  val contentManager: ContentManager
}
object SerializationManager {
  
  inline def apply(contentManager: ContentManager): SerializationManager = {
    val __obj = js.Dynamic.literal(contentManager = contentManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationManager]
  }
  
  extension [Self <: SerializationManager](x: Self) {
    
    inline def setContentManager(value: ContentManager): Self = StObject.set(x, "contentManager", value.asInstanceOf[js.Any])
  }
}
