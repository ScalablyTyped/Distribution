package typings.calq.Calq

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  def clear(): Unit = js.native
  
  def identify(userId: String): Unit = js.native
  
  def profile(params: StringDictionary[js.Any]): Unit = js.native
}
object User {
  
  @scala.inline
  def apply(clear: () => Unit, identify: String => Unit, profile: StringDictionary[js.Any] => Unit): User = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), identify = js.Any.fromFunction1(identify), profile = js.Any.fromFunction1(profile))
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdentify(value: String => Unit): Self = this.set("identify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProfile(value: StringDictionary[js.Any] => Unit): Self = this.set("profile", js.Any.fromFunction1(value))
  }
}
