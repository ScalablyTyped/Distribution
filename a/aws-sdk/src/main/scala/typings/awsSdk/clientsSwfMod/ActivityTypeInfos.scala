package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTypeInfos extends StObject {
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * List of activity type information.
    */
  var typeInfos: ActivityTypeInfoList
}
object ActivityTypeInfos {
  
  inline def apply(typeInfos: ActivityTypeInfoList): ActivityTypeInfos = {
    val __obj = js.Dynamic.literal(typeInfos = typeInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTypeInfos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivityTypeInfos] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTypeInfos(value: ActivityTypeInfoList): Self = StObject.set(x, "typeInfos", value.asInstanceOf[js.Any])
    
    inline def setTypeInfosVarargs(value: ActivityTypeInfo*): Self = StObject.set(x, "typeInfos", js.Array(value*))
  }
}
