package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  /**
    * The canonical name of the alias.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of names for the alias, including the canonical name.
    */
  var Names: js.UndefOr[AliasNames] = js.undefined
  
  /**
    * The type of the alias.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object Alias {
  
  inline def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  extension [Self <: Alias](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNames(value: AliasNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
