package typings.chromeApps.chrome

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait DeleteTokenParams extends StObject {
    
    /**
      * The authorized entity that is used to obtain the token.
      */
    var authorizedEntity: String = js.native
    
    /**
      * The scope that is used to obtain the token.
      */
    var scope: String = js.native
  }
  object DeleteTokenParams {
    
    @scala.inline
    def apply(authorizedEntity: String, scope: String): DeleteTokenParams = {
      val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteTokenParams]
    }
    
    @scala.inline
    implicit class DeleteTokenParamsMutableBuilder[Self <: DeleteTokenParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizedEntity(value: String): Self = StObject.set(x, "authorizedEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenParams extends StObject {
    
    /**
      * Identifies the entity that is authorized to access resources associated with this Instance ID.
      * It can be a project ID from Google developer console.
      */
    var authorizedEntity: String = js.native
    
    /**
      * Allows including a small number of string key/value pairs that will
      * be associated with the token and may be used in processing the request.
      */
    var options: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Identifies authorized actions that the authorized entity can take.
      * E.g. for sending GCM messages, GCM scope should be used.
      */
    var scope: String = js.native
  }
  object TokenParams {
    
    @scala.inline
    def apply(authorizedEntity: String, scope: String): TokenParams = {
      val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenParams]
    }
    
    @scala.inline
    implicit class TokenParamsMutableBuilder[Self <: TokenParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizedEntity(value: String): Self = StObject.set(x, "authorizedEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
