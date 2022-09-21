package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyPairsResult extends StObject {
  
  /**
    * Information about the key pairs.
    */
  var KeyPairs: js.UndefOr[KeyPairList] = js.undefined
}
object DescribeKeyPairsResult {
  
  inline def apply(): DescribeKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPairsResult]
  }
  
  extension [Self <: DescribeKeyPairsResult](x: Self) {
    
    inline def setKeyPairs(value: KeyPairList): Self = StObject.set(x, "KeyPairs", value.asInstanceOf[js.Any])
    
    inline def setKeyPairsUndefined: Self = StObject.set(x, "KeyPairs", js.undefined)
    
    inline def setKeyPairsVarargs(value: KeyPairInfo*): Self = StObject.set(x, "KeyPairs", js.Array(value*))
  }
}
