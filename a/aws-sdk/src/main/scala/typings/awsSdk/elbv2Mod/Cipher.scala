package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cipher extends js.Object {
  
  /**
    * The name of the cipher.
    */
  var Name: js.UndefOr[CipherName] = js.native
  
  /**
    * The priority of the cipher.
    */
  var Priority: js.UndefOr[CipherPriority] = js.native
}
object Cipher {
  
  @scala.inline
  def apply(): Cipher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cipher]
  }
  
  @scala.inline
  implicit class CipherOps[Self <: Cipher] (val x: Self) extends AnyVal {
    
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
    def setName(value: CipherName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPriority(value: CipherPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
  }
}
