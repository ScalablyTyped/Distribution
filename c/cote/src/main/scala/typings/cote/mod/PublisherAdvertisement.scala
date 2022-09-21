package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherAdvertisement
  extends StObject
     with Advertisement {
  
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.undefined
}
object PublisherAdvertisement {
  
  inline def apply(name: String): PublisherAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherAdvertisement]
  }
  
  extension [Self <: PublisherAdvertisement](x: Self) {
    
    inline def setBroadcasts(value: js.Array[String]): Self = StObject.set(x, "broadcasts", value.asInstanceOf[js.Any])
    
    inline def setBroadcastsUndefined: Self = StObject.set(x, "broadcasts", js.undefined)
    
    inline def setBroadcastsVarargs(value: String*): Self = StObject.set(x, "broadcasts", js.Array(value*))
  }
}
