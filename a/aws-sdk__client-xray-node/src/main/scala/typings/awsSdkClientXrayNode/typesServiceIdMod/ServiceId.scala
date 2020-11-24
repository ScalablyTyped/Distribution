package typings.awsSdkClientXrayNode.typesServiceIdMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceId extends js.Object {
  
  /**
    * <p/>
    */
  var AccountId: js.UndefOr[String] = js.native
  
  /**
    * <p/>
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * <p/>
    */
  var Names: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  
  /**
    * <p/>
    */
  var Type: js.UndefOr[String] = js.native
}
object ServiceId {
  
  @scala.inline
  def apply(): ServiceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceId]
  }
  
  @scala.inline
  implicit class ServiceIdOps[Self <: ServiceId] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String] | Iterable[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
