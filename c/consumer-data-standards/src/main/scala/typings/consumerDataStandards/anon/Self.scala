package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Self
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Fully qualified link that generated the current response document
    */
  var self: String
}
object Self {
  
  inline def apply(self: String): Self = {
    val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Self]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self_ <: Self] (val x: Self_) extends AnyVal {
    
    inline def setSelf(value: String): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
