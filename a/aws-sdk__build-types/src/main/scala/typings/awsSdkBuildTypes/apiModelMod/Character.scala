package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.character
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Character
  extends StObject
     with ShapeDef
     with Shape {
  
  @JSName("type")
  val type_Character: character
}
object Character {
  
  inline def apply(): Character = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("character")
    __obj.asInstanceOf[Character]
  }
  
  extension [Self <: Character](x: Self) {
    
    inline def setType(value: character): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
