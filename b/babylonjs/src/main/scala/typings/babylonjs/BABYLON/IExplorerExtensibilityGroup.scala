package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExplorerExtensibilityGroup extends StObject {
  
  /**
    * Gets the list of options added to a type
    */
  var entries: js.Array[IExplorerExtensibilityOption]
  
  /**
    * Defines a predicate to test if a given type mut be extended
    */
  def predicate(entity: Any): Boolean
}
object IExplorerExtensibilityGroup {
  
  inline def apply(entries: js.Array[IExplorerExtensibilityOption], predicate: Any => Boolean): IExplorerExtensibilityGroup = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
    __obj.asInstanceOf[IExplorerExtensibilityGroup]
  }
  
  extension [Self <: IExplorerExtensibilityGroup](x: Self) {
    
    inline def setEntries(value: js.Array[IExplorerExtensibilityOption]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: IExplorerExtensibilityOption*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setPredicate(value: Any => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
  }
}
