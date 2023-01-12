package typings.awsSdkBuildTypes.buildApiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boolean
  extends StObject
     with ShapeDef
     with Shape {
  
  @JSName("type")
  val type_Boolean: boolean
}
object Boolean {
  
  inline def apply(): Boolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[Boolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
