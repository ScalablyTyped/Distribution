package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.character
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Character
  extends ShapeDef
     with Shape {
  
  @JSName("type")
  val type_Character: character = js.native
}
object Character {
  
  @scala.inline
  def apply(`type`: character): Character = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Character]
  }
  
  @scala.inline
  implicit class CharacterMutableBuilder[Self <: Character] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: character): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
