package typings.contractProxyKit.anon

import typings.ethersprojectBignumber.mod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofconstants extends StObject {
  
  val AddressZero: /* "0x0000000000000000000000000000000000000000" */ String
  
  val EtherSymbol: /* "\\u039E" */ String
  
  val HashZero: /* "0x0000000000000000000000000000000000000000000000000000000000000000" */ String
  
  val MaxInt256: BigNumber
  
  val MaxUint256: BigNumber
  
  val MinInt256: BigNumber
  
  val NegativeOne: BigNumber
  
  val One: BigNumber
  
  val Two: BigNumber
  
  val WeiPerEther: BigNumber
  
  val Zero: BigNumber
}
object Typeofconstants {
  
  inline def apply(
    AddressZero: /* "0x0000000000000000000000000000000000000000" */ String,
    EtherSymbol: /* "\\u039E" */ String,
    HashZero: /* "0x0000000000000000000000000000000000000000000000000000000000000000" */ String,
    MaxInt256: BigNumber,
    MaxUint256: BigNumber,
    MinInt256: BigNumber,
    NegativeOne: BigNumber,
    One: BigNumber,
    Two: BigNumber,
    WeiPerEther: BigNumber,
    Zero: BigNumber
  ): Typeofconstants = {
    val __obj = js.Dynamic.literal(AddressZero = AddressZero.asInstanceOf[js.Any], EtherSymbol = EtherSymbol.asInstanceOf[js.Any], HashZero = HashZero.asInstanceOf[js.Any], MaxInt256 = MaxInt256.asInstanceOf[js.Any], MaxUint256 = MaxUint256.asInstanceOf[js.Any], MinInt256 = MinInt256.asInstanceOf[js.Any], NegativeOne = NegativeOne.asInstanceOf[js.Any], One = One.asInstanceOf[js.Any], Two = Two.asInstanceOf[js.Any], WeiPerEther = WeiPerEther.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofconstants]
  }
  
  extension [Self <: Typeofconstants](x: Self) {
    
    inline def setAddressZero(value: /* "0x0000000000000000000000000000000000000000" */ String): Self = StObject.set(x, "AddressZero", value.asInstanceOf[js.Any])
    
    inline def setEtherSymbol(value: /* "\\u039E" */ String): Self = StObject.set(x, "EtherSymbol", value.asInstanceOf[js.Any])
    
    inline def setHashZero(value: /* "0x0000000000000000000000000000000000000000000000000000000000000000" */ String): Self = StObject.set(x, "HashZero", value.asInstanceOf[js.Any])
    
    inline def setMaxInt256(value: BigNumber): Self = StObject.set(x, "MaxInt256", value.asInstanceOf[js.Any])
    
    inline def setMaxUint256(value: BigNumber): Self = StObject.set(x, "MaxUint256", value.asInstanceOf[js.Any])
    
    inline def setMinInt256(value: BigNumber): Self = StObject.set(x, "MinInt256", value.asInstanceOf[js.Any])
    
    inline def setNegativeOne(value: BigNumber): Self = StObject.set(x, "NegativeOne", value.asInstanceOf[js.Any])
    
    inline def setOne(value: BigNumber): Self = StObject.set(x, "One", value.asInstanceOf[js.Any])
    
    inline def setTwo(value: BigNumber): Self = StObject.set(x, "Two", value.asInstanceOf[js.Any])
    
    inline def setWeiPerEther(value: BigNumber): Self = StObject.set(x, "WeiPerEther", value.asInstanceOf[js.Any])
    
    inline def setZero(value: BigNumber): Self = StObject.set(x, "Zero", value.asInstanceOf[js.Any])
  }
}
