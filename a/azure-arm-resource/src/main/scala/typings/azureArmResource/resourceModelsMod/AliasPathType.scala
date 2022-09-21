package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasPathType extends StObject {
  
  /**
    * The API versions.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The path of an alias.
    */
  var path: js.UndefOr[String] = js.undefined
}
object AliasPathType {
  
  inline def apply(): AliasPathType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasPathType]
  }
  
  extension [Self <: AliasPathType](x: Self) {
    
    inline def setApiVersions(value: js.Array[String]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    inline def setApiVersionsVarargs(value: String*): Self = StObject.set(x, "apiVersions", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
