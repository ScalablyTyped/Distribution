package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyPairResult extends js.Object {
  
  /**
    * An array of key-value pairs containing information about the key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}
object GetKeyPairResult {
  
  @scala.inline
  def apply(): GetKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPairResult]
  }
  
  @scala.inline
  implicit class GetKeyPairResultOps[Self <: GetKeyPairResult] (val x: Self) extends AnyVal {
    
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
    def setKeyPair(value: KeyPair): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPair: Self = this.set("keyPair", js.undefined)
  }
}
