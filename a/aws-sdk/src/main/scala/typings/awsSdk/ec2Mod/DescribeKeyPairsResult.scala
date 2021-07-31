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
  
  @scala.inline
  def apply(): DescribeKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPairsResult]
  }
  
  @scala.inline
  implicit class DescribeKeyPairsResultMutableBuilder[Self <: DescribeKeyPairsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPairs(value: KeyPairList): Self = StObject.set(x, "KeyPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairsUndefined: Self = StObject.set(x, "KeyPairs", js.undefined)
    
    @scala.inline
    def setKeyPairsVarargs(value: KeyPairInfo*): Self = StObject.set(x, "KeyPairs", js.Array(value :_*))
  }
}
