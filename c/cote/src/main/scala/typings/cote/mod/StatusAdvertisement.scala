package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cote.mod.Advertisement because Already inherited
- typings.cote.mod.SubscriberAdvertisement because var conflicts: key, name, namespace. Inlined subscribesTo
- typings.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts
- typings.cote.mod.ResponderAdvertisement because var conflicts: key, name, namespace. Inlined respondsTo, subset */ @js.native
trait StatusAdvertisement extends RequesterAdvertisement {
  
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.native
}
object StatusAdvertisement {
  
  @scala.inline
  def apply(name: String): StatusAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusAdvertisement]
  }
  
  @scala.inline
  implicit class StatusAdvertisementMutableBuilder[Self <: StatusAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcasts(value: js.Array[String]): Self = StObject.set(x, "broadcasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastsUndefined: Self = StObject.set(x, "broadcasts", js.undefined)
    
    @scala.inline
    def setBroadcastsVarargs(value: String*): Self = StObject.set(x, "broadcasts", js.Array(value :_*))
    
    @scala.inline
    def setRespondsTo(value: js.Array[String]): Self = StObject.set(x, "respondsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondsToUndefined: Self = StObject.set(x, "respondsTo", js.undefined)
    
    @scala.inline
    def setRespondsToVarargs(value: String*): Self = StObject.set(x, "respondsTo", js.Array(value :_*))
    
    @scala.inline
    def setSubscribesTo(value: js.Array[String]): Self = StObject.set(x, "subscribesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribesToUndefined: Self = StObject.set(x, "subscribesTo", js.undefined)
    
    @scala.inline
    def setSubscribesToVarargs(value: String*): Self = StObject.set(x, "subscribesTo", js.Array(value :_*))
    
    @scala.inline
    def setSubset(value: String): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
  }
}
