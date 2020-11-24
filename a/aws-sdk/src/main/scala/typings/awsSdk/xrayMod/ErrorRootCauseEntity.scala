package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorRootCauseEntity extends js.Object {
  
  /**
    * The types and messages of the exceptions.
    */
  var Exceptions: js.UndefOr[RootCauseExceptions] = js.native
  
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.native
}
object ErrorRootCauseEntity {
  
  @scala.inline
  def apply(): ErrorRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorRootCauseEntity]
  }
  
  @scala.inline
  implicit class ErrorRootCauseEntityOps[Self <: ErrorRootCauseEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExceptionsVarargs(value: RootCauseException*): Self = this.set("Exceptions", js.Array(value :_*))
    
    @scala.inline
    def setExceptions(value: RootCauseExceptions): Self = this.set("Exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptions: Self = this.set("Exceptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRemote(value: NullableBoolean): Self = this.set("Remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("Remote", js.undefined)
  }
}
