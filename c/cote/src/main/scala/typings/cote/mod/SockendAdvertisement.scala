package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cote.mod.Advertisement because Already inherited
- typings.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts */ trait SockendAdvertisement
  extends StObject
     with ResponderAdvertisement {
  
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.undefined
}
object SockendAdvertisement {
  
  inline def apply(name: String): SockendAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SockendAdvertisement]
  }
  
  extension [Self <: SockendAdvertisement](x: Self) {
    
    inline def setBroadcasts(value: js.Array[String]): Self = StObject.set(x, "broadcasts", value.asInstanceOf[js.Any])
    
    inline def setBroadcastsUndefined: Self = StObject.set(x, "broadcasts", js.undefined)
    
    inline def setBroadcastsVarargs(value: String*): Self = StObject.set(x, "broadcasts", js.Array(value :_*))
  }
}
