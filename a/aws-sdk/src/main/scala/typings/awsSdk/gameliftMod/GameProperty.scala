package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameProperty extends StObject {
  
  /**
    * The game property identifier.
    */
  var Key: GamePropertyKey
  
  /**
    * The game property value.
    */
  var Value: GamePropertyValue
}
object GameProperty {
  
  @scala.inline
  def apply(Key: GamePropertyKey, Value: GamePropertyValue): GameProperty = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameProperty]
  }
  
  @scala.inline
  implicit class GamePropertyMutableBuilder[Self <: GameProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: GamePropertyKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: GamePropertyValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
