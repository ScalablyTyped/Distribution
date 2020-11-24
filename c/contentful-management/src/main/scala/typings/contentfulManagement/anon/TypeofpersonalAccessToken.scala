package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.personalAccessTokenMod.PersonalAccessToken
import typings.contentfulManagement.personalAccessTokenMod.PersonalAccessTokenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpersonalAccessToken extends js.Object {
  
  def wrapPersonalAccessToken(http: AxiosInstance, data: PersonalAccessTokenProp): PersonalAccessToken = js.native
  
  def wrapPersonalAccessTokenCollection(http: AxiosInstance, data: CollectionProp[PersonalAccessTokenProp]): Collection[PersonalAccessToken, PersonalAccessTokenProp] = js.native
}
object TypeofpersonalAccessToken {
  
  @scala.inline
  def apply(
    wrapPersonalAccessToken: (AxiosInstance, PersonalAccessTokenProp) => PersonalAccessToken,
    wrapPersonalAccessTokenCollection: (AxiosInstance, CollectionProp[PersonalAccessTokenProp]) => Collection[PersonalAccessToken, PersonalAccessTokenProp]
  ): TypeofpersonalAccessToken = {
    val __obj = js.Dynamic.literal(wrapPersonalAccessToken = js.Any.fromFunction2(wrapPersonalAccessToken), wrapPersonalAccessTokenCollection = js.Any.fromFunction2(wrapPersonalAccessTokenCollection))
    __obj.asInstanceOf[TypeofpersonalAccessToken]
  }
  
  @scala.inline
  implicit class TypeofpersonalAccessTokenOps[Self <: TypeofpersonalAccessToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWrapPersonalAccessToken(value: (AxiosInstance, PersonalAccessTokenProp) => PersonalAccessToken): Self = this.set("wrapPersonalAccessToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapPersonalAccessTokenCollection(
      value: (AxiosInstance, CollectionProp[PersonalAccessTokenProp]) => Collection[PersonalAccessToken, PersonalAccessTokenProp]
    ): Self = this.set("wrapPersonalAccessTokenCollection", js.Any.fromFunction2(value))
  }
}
