package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponderAdvertisement extends Advertisement {
  
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.native
}
object ResponderAdvertisement {
  
  @scala.inline
  def apply(name: String): ResponderAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponderAdvertisement]
  }
  
  @scala.inline
  implicit class ResponderAdvertisementMutableBuilder[Self <: ResponderAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRespondsTo(value: js.Array[String]): Self = StObject.set(x, "respondsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondsToUndefined: Self = StObject.set(x, "respondsTo", js.undefined)
    
    @scala.inline
    def setRespondsToVarargs(value: String*): Self = StObject.set(x, "respondsTo", js.Array(value :_*))
    
    @scala.inline
    def setSubset(value: String): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
  }
}
