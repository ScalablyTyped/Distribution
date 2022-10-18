package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasType extends StObject {
  
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The paths for an alias.
    */
  var paths: js.UndefOr[js.Array[AliasPathType]] = js.undefined
}
object AliasType {
  
  inline def apply(): AliasType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasType]
  }
  
  extension [Self <: AliasType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaths(value: js.Array[AliasPathType]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: AliasPathType*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
