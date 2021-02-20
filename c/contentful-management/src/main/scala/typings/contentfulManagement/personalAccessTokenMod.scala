package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.content_management_manage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personalAccessTokenMod {
  
  @JSImport("contentful-management/dist/typings/entities/personal-access-token", "wrapPersonalAccessToken")
  @js.native
  def wrapPersonalAccessToken(http: AxiosInstance, data: PersonalAccessTokenProp): PersonalAccessToken = js.native
  
  @JSImport("contentful-management/dist/typings/entities/personal-access-token", "wrapPersonalAccessTokenCollection")
  @js.native
  def wrapPersonalAccessTokenCollection(http: AxiosInstance, data: CollectionProp[PersonalAccessTokenProp]): Collection[PersonalAccessToken, PersonalAccessTokenProp] = js.native
  
  /* Inlined std.Pick<contentful-management.contentful-management/dist/typings/entities/personal-access-token.PersonalAccessToken, 'name' | 'scopes'> */
  @js.native
  trait CreatePersonalAccessTokenProps extends StObject {
    
    var name: String = js.native
    
    var scopes: js.Array[content_management_manage] = js.native
  }
  object CreatePersonalAccessTokenProps {
    
    @scala.inline
    def apply(name: String, scopes: js.Array[content_management_manage]): CreatePersonalAccessTokenProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatePersonalAccessTokenProps]
    }
    
    @scala.inline
    implicit class CreatePersonalAccessTokenPropsMutableBuilder[Self <: CreatePersonalAccessTokenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: js.Array[content_management_manage]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: content_management_manage*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PersonalAccessToken
    extends PersonalAccessTokenProp
       with DefaultElements[PersonalAccessTokenProp] {
    
    /**
      * Revokes a personal access token
      * @return Object the revoked personal access token
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *  accessToken: <content_management_api_key>
      * })
      *
      * client.getPersonalAccessToken('<token-id>')
      *  .then((personalAccessToken) => {
      *    return personalAccessToken.revoke()
      *  })
      *  .catch(console.error)
      * ```
      */
    def revoke(): js.Promise[PersonalAccessToken] = js.native
  }
  object PersonalAccessToken {
    
    @scala.inline
    def apply(
      name: String,
      revoke: () => js.Promise[PersonalAccessToken],
      scopes: js.Array[content_management_manage],
      sys: MetaSysProps,
      toPlainObject: () => PersonalAccessTokenProp
    ): PersonalAccessToken = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke), scopes = scopes.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[PersonalAccessToken]
    }
    
    @scala.inline
    implicit class PersonalAccessTokenMutableBuilder[Self <: PersonalAccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRevoke(value: () => js.Promise[PersonalAccessToken]): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PersonalAccessTokenProp extends StObject {
    
    var name: String = js.native
    
    var revokedAt: Null | String = js.native
    
    var scopes: js.Array[content_management_manage] = js.native
    
    var sys: MetaSysProps = js.native
    
    var token: js.UndefOr[String] = js.native
  }
  object PersonalAccessTokenProp {
    
    @scala.inline
    def apply(name: String, scopes: js.Array[content_management_manage], sys: MetaSysProps): PersonalAccessTokenProp = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonalAccessTokenProp]
    }
    
    @scala.inline
    implicit class PersonalAccessTokenPropMutableBuilder[Self <: PersonalAccessTokenProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokedAt(value: String): Self = StObject.set(x, "revokedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokedAtNull: Self = StObject.set(x, "revokedAt", null)
      
      @scala.inline
      def setScopes(value: js.Array[content_management_manage]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: content_management_manage*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
