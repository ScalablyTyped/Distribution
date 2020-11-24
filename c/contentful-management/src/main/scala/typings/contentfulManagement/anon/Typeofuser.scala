package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.userMod.User
import typings.contentfulManagement.userMod.UserProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofuser extends js.Object {
  
  def wrapUser(http: AxiosInstance, data: UserProps): User = js.native
  
  def wrapUserCollection(http: AxiosInstance, data: CollectionProp[UserProps]): Collection[User, UserProps] = js.native
}
object Typeofuser {
  
  @scala.inline
  def apply(
    wrapUser: (AxiosInstance, UserProps) => User,
    wrapUserCollection: (AxiosInstance, CollectionProp[UserProps]) => Collection[User, UserProps]
  ): Typeofuser = {
    val __obj = js.Dynamic.literal(wrapUser = js.Any.fromFunction2(wrapUser), wrapUserCollection = js.Any.fromFunction2(wrapUserCollection))
    __obj.asInstanceOf[Typeofuser]
  }
  
  @scala.inline
  implicit class TypeofuserOps[Self <: Typeofuser] (val x: Self) extends AnyVal {
    
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
    def setWrapUser(value: (AxiosInstance, UserProps) => User): Self = this.set("wrapUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapUserCollection(value: (AxiosInstance, CollectionProp[UserProps]) => Collection[User, UserProps]): Self = this.set("wrapUserCollection", js.Any.fromFunction2(value))
  }
}
