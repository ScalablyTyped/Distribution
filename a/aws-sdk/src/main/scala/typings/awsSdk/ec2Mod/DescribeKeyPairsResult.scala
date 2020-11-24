package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeKeyPairsResult extends js.Object {
  
  /**
    * Information about the key pairs.
    */
  var KeyPairs: js.UndefOr[KeyPairList] = js.native
}
object DescribeKeyPairsResult {
  
  @scala.inline
  def apply(): DescribeKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPairsResult]
  }
  
  @scala.inline
  implicit class DescribeKeyPairsResultOps[Self <: DescribeKeyPairsResult] (val x: Self) extends AnyVal {
    
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
    def setKeyPairsVarargs(value: KeyPairInfo*): Self = this.set("KeyPairs", js.Array(value :_*))
    
    @scala.inline
    def setKeyPairs(value: KeyPairList): Self = this.set("KeyPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairs: Self = this.set("KeyPairs", js.undefined)
  }
}
