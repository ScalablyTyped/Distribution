package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.userMod.User
import typings.contentfulManagement.userMod.UserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofuser extends StObject {
  
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
  implicit class TypeofuserMutableBuilder[Self <: Typeofuser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapUser(value: (AxiosInstance, UserProps) => User): Self = StObject.set(x, "wrapUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapUserCollection(value: (AxiosInstance, CollectionProp[UserProps]) => Collection[User, UserProps]): Self = StObject.set(x, "wrapUserCollection", js.Any.fromFunction2(value))
  }
}
