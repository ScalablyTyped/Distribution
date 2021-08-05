package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cote.mod.Advertisement because Already inherited
- typings.cote.mod.SubscriberAdvertisement because var conflicts: key, name, namespace. Inlined subscribesTo
- typings.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts
- typings.cote.mod.ResponderAdvertisement because var conflicts: key, name, namespace. Inlined respondsTo, subset */ trait StatusAdvertisement
  extends StObject
     with RequesterAdvertisement {
  
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.undefined
}
object StatusAdvertisement {
  
  inline def apply(name: String): StatusAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusAdvertisement]
  }
  
  extension [Self <: StatusAdvertisement](x: Self) {
    
    inline def setBroadcasts(value: js.Array[String]): Self = StObject.set(x, "broadcasts", value.asInstanceOf[js.Any])
    
    inline def setBroadcastsUndefined: Self = StObject.set(x, "broadcasts", js.undefined)
    
    inline def setBroadcastsVarargs(value: String*): Self = StObject.set(x, "broadcasts", js.Array(value :_*))
    
    inline def setRespondsTo(value: js.Array[String]): Self = StObject.set(x, "respondsTo", value.asInstanceOf[js.Any])
    
    inline def setRespondsToUndefined: Self = StObject.set(x, "respondsTo", js.undefined)
    
    inline def setRespondsToVarargs(value: String*): Self = StObject.set(x, "respondsTo", js.Array(value :_*))
    
    inline def setSubscribesTo(value: js.Array[String]): Self = StObject.set(x, "subscribesTo", value.asInstanceOf[js.Any])
    
    inline def setSubscribesToUndefined: Self = StObject.set(x, "subscribesTo", js.undefined)
    
    inline def setSubscribesToVarargs(value: String*): Self = StObject.set(x, "subscribesTo", js.Array(value :_*))
    
    inline def setSubset(value: String): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
  }
}
