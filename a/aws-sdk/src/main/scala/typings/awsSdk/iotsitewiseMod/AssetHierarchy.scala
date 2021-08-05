package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetHierarchy extends StObject {
  
  /**
    * The ID of the hierarchy. This ID is a hierarchyId.
    */
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * The hierarchy name provided in the CreateAssetModel or UpdateAssetModel API operation.
    */
  var name: Name
}
object AssetHierarchy {
  
  inline def apply(name: Name): AssetHierarchy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetHierarchy]
  }
  
  extension [Self <: AssetHierarchy](x: Self) {
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
