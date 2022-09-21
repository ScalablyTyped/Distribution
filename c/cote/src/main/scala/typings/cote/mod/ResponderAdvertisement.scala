package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponderAdvertisement
  extends StObject
     with Advertisement {
  
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.undefined
}
object ResponderAdvertisement {
  
  inline def apply(name: String): ResponderAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponderAdvertisement]
  }
  
  extension [Self <: ResponderAdvertisement](x: Self) {
    
    inline def setRespondsTo(value: js.Array[String]): Self = StObject.set(x, "respondsTo", value.asInstanceOf[js.Any])
    
    inline def setRespondsToUndefined: Self = StObject.set(x, "respondsTo", js.undefined)
    
    inline def setRespondsToVarargs(value: String*): Self = StObject.set(x, "respondsTo", js.Array(value*))
    
    inline def setSubset(value: String): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
  }
}
