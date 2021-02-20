package typings.box2d.Box2D.Collision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2ContactID extends StObject {
  
  /**
    * Copies the Contact ID.
    * @return Copied Contact ID.
    **/
  def Copy(): b2ContactID = js.native
  
  /**
    * ID Key
    **/
  var Key: Double = js.native
  
  /**
    * Sets the Contact ID from a Contact ID.
    * @param id The Contact ID to copy values from.
    **/
  def Set(id: b2ContactID): Unit = js.native
  
  /**
    * Features
    **/
  var features: Features = js.native
}
object b2ContactID {
  
  @scala.inline
  def apply(Copy: () => b2ContactID, Key: Double, Set: b2ContactID => Unit, features: Features): b2ContactID = {
    val __obj = js.Dynamic.literal(Copy = js.Any.fromFunction0(Copy), Key = Key.asInstanceOf[js.Any], Set = js.Any.fromFunction1(Set), features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactID]
  }
  
  @scala.inline
  implicit class b2ContactIDMutableBuilder[Self <: b2ContactID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => b2ContactID): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: b2ContactID => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
  }
}
