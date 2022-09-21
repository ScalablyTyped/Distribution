package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeywordResult extends StObject {
  
  /**
    * The keyword that was deleted.
    */
  var Keyword: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.Keyword] = js.undefined
  
  /**
    * The action that was associated with the deleted keyword.
    */
  var KeywordAction: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.KeywordAction] = js.undefined
  
  /**
    * The message that was associated with the deleted keyword.
    */
  var KeywordMessage: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.KeywordMessage] = js.undefined
  
  /**
    * The PhoneNumberId or PoolId that the keyword was associated with.
    */
  var OriginationIdentity: js.UndefOr[String] = js.undefined
  
  /**
    * The PhoneNumberArn or PoolArn that the keyword was associated with.
    */
  var OriginationIdentityArn: js.UndefOr[String] = js.undefined
}
object DeleteKeywordResult {
  
  inline def apply(): DeleteKeywordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteKeywordResult]
  }
  
  extension [Self <: DeleteKeywordResult](x: Self) {
    
    inline def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordAction(value: KeywordAction): Self = StObject.set(x, "KeywordAction", value.asInstanceOf[js.Any])
    
    inline def setKeywordActionUndefined: Self = StObject.set(x, "KeywordAction", js.undefined)
    
    inline def setKeywordMessage(value: KeywordMessage): Self = StObject.set(x, "KeywordMessage", value.asInstanceOf[js.Any])
    
    inline def setKeywordMessageUndefined: Self = StObject.set(x, "KeywordMessage", js.undefined)
    
    inline def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
    
    inline def setOriginationIdentity(value: String): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArn(value: String): Self = StObject.set(x, "OriginationIdentityArn", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArnUndefined: Self = StObject.set(x, "OriginationIdentityArn", js.undefined)
    
    inline def setOriginationIdentityUndefined: Self = StObject.set(x, "OriginationIdentity", js.undefined)
  }
}
