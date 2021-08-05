package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.personalAccessTokenMod.PersonalAccessToken
import typings.contentfulManagement.personalAccessTokenMod.PersonalAccessTokenProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpersonalAccessToken extends StObject {
  
  def wrapPersonalAccessToken(http: AxiosInstance, data: PersonalAccessTokenProp): PersonalAccessToken
  
  def wrapPersonalAccessTokenCollection(http: AxiosInstance, data: CollectionProp[PersonalAccessTokenProp]): Collection[PersonalAccessToken, PersonalAccessTokenProp]
}
object TypeofpersonalAccessToken {
  
  inline def apply(
    wrapPersonalAccessToken: (AxiosInstance, PersonalAccessTokenProp) => PersonalAccessToken,
    wrapPersonalAccessTokenCollection: (AxiosInstance, CollectionProp[PersonalAccessTokenProp]) => Collection[PersonalAccessToken, PersonalAccessTokenProp]
  ): TypeofpersonalAccessToken = {
    val __obj = js.Dynamic.literal(wrapPersonalAccessToken = js.Any.fromFunction2(wrapPersonalAccessToken), wrapPersonalAccessTokenCollection = js.Any.fromFunction2(wrapPersonalAccessTokenCollection))
    __obj.asInstanceOf[TypeofpersonalAccessToken]
  }
  
  extension [Self <: TypeofpersonalAccessToken](x: Self) {
    
    inline def setWrapPersonalAccessToken(value: (AxiosInstance, PersonalAccessTokenProp) => PersonalAccessToken): Self = StObject.set(x, "wrapPersonalAccessToken", js.Any.fromFunction2(value))
    
    inline def setWrapPersonalAccessTokenCollection(
      value: (AxiosInstance, CollectionProp[PersonalAccessTokenProp]) => Collection[PersonalAccessToken, PersonalAccessTokenProp]
    ): Self = StObject.set(x, "wrapPersonalAccessTokenCollection", js.Any.fromFunction2(value))
  }
}
