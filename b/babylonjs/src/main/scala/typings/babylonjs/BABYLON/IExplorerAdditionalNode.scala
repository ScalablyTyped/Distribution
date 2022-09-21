package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExplorerAdditionalNode extends StObject {
  
  /**
    * Function used to return the list of child entries
    */
  def getContent(): js.Array[IExplorerAdditionalChild]
  
  /**
    * Gets the name of the additional node
    */
  var name: String
}
object IExplorerAdditionalNode {
  
  inline def apply(getContent: () => js.Array[IExplorerAdditionalChild], name: String): IExplorerAdditionalNode = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerAdditionalNode]
  }
  
  extension [Self <: IExplorerAdditionalNode](x: Self) {
    
    inline def setGetContent(value: () => js.Array[IExplorerAdditionalChild]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
