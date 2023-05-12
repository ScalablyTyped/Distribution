package typings.cyclonedx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependsOn extends StObject {
  
  var dependsOn: js.UndefOr[js.Array[String]] = js.undefined
  
  var ref: String
}
object DependsOn {
  
  inline def apply(ref: String): DependsOn = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependsOn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependsOn] (val x: Self) extends AnyVal {
    
    inline def setDependsOn(value: js.Array[String]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: String*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
