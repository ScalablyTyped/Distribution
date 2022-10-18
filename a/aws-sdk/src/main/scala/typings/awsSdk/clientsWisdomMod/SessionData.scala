package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionData extends StObject {
  
  /**
    * The description of the session.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the session.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) of the session.
    */
  var sessionArn: Arn
  
  /**
    * The identifier of the session.
    */
  var sessionId: Uuid
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object SessionData {
  
  inline def apply(name: Name, sessionArn: Arn, sessionId: Uuid): SessionData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sessionArn = sessionArn.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionData]
  }
  
  extension [Self <: SessionData](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSessionArn(value: Arn): Self = StObject.set(x, "sessionArn", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: Uuid): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
