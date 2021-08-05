package typings.chromeApps.chrome

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.instanceID
////////////////
// InstanceID //
////////////////
/**
  * Use chrome.instanceID to access the Instance ID service.
  * @requires Permissions: 'gcm'
  * @since Chrome 46
  */
object instanceID {
  
  trait DeleteTokenParams extends StObject {
    
    /**
      * The authorized entity that is used to obtain the token.
      */
    var authorizedEntity: String
    
    /**
      * The scope that is used to obtain the token.
      */
    var scope: String
  }
  object DeleteTokenParams {
    
    inline def apply(authorizedEntity: String, scope: String): DeleteTokenParams = {
      val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteTokenParams]
    }
    
    extension [Self <: DeleteTokenParams](x: Self) {
      
      inline def setAuthorizedEntity(value: String): Self = StObject.set(x, "authorizedEntity", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenParams extends StObject {
    
    /**
      * Identifies the entity that is authorized to access resources associated with this Instance ID.
      * It can be a project ID from Google developer console.
      */
    var authorizedEntity: String
    
    /**
      * Allows including a small number of string key/value pairs that will
      * be associated with the token and may be used in processing the request.
      */
    var options: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Identifies authorized actions that the authorized entity can take.
      * E.g. for sending GCM messages, GCM scope should be used.
      */
    var scope: String
  }
  object TokenParams {
    
    inline def apply(authorizedEntity: String, scope: String): TokenParams = {
      val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenParams]
    }
    
    extension [Self <: TokenParams](x: Self) {
      
      inline def setAuthorizedEntity(value: String): Self = StObject.set(x, "authorizedEntity", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
