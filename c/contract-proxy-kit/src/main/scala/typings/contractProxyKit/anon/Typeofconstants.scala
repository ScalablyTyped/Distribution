package typings.contractProxyKit.anon

import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofconstants extends js.Object {
  
  val AddressZero: /* "0x0000000000000000000000000000000000000000" */ String = js.native
  
  val EtherSymbol: /* "\\u039E" */ String = js.native
  
  val HashZero: /* "0x0000000000000000000000000000000000000000000000000000000000000000" */ String = js.native
  
  val MaxUint256: BigNumber = js.native
  
  val NegativeOne: BigNumber = js.native
  
  val One: BigNumber = js.native
  
  val Two: BigNumber = js.native
  
  val WeiPerEther: BigNumber = js.native
  
  val Zero: BigNumber = js.native
}
object Typeofconstants {
  
  @scala.inline
  def apply(
    AddressZero: /* "0x0000000000000000000000000000000000000000" */ String,
    EtherSymbol: /* "\\u039E" */ String,
    HashZero: /* "0x0000000000000000000000000000000000000000000000000000000000000000" */ String,
    MaxUint256: BigNumber,
    NegativeOne: BigNumber,
    One: BigNumber,
    Two: BigNumber,
    WeiPerEther: BigNumber,
    Zero: BigNumber
  ): Typeofconstants = {
    val __obj = js.Dynamic.literal(AddressZero = AddressZero.asInstanceOf[js.Any], EtherSymbol = EtherSymbol.asInstanceOf[js.Any], HashZero = HashZero.asInstanceOf[js.Any], MaxUint256 = MaxUint256.asInstanceOf[js.Any], NegativeOne = NegativeOne.asInstanceOf[js.Any], One = One.asInstanceOf[js.Any], Two = Two.asInstanceOf[js.Any], WeiPerEther = WeiPerEther.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofconstants]
  }
  
  @scala.inline
  implicit class TypeofconstantsOps[Self <: Typeofconstants] (val x: Self) extends AnyVal {
    
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
    def setAddressZero(value: /* "0x0000000000000000000000000000000000000000" */ String): Self = this.set("AddressZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtherSymbol(value: /* "\\u039E" */ String): Self = this.set("EtherSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashZero(value: /* "0x0000000000000000000000000000000000000000000000000000000000000000" */ String): Self = this.set("HashZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUint256(value: BigNumber): Self = this.set("MaxUint256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeOne(value: BigNumber): Self = this.set("NegativeOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOne(value: BigNumber): Self = this.set("One", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo(value: BigNumber): Self = this.set("Two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeiPerEther(value: BigNumber): Self = this.set("WeiPerEther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZero(value: BigNumber): Self = this.set("Zero", value.asInstanceOf[js.Any])
  }
}
