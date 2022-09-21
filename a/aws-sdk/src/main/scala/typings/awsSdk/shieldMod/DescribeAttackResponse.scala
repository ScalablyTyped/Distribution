package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAttackResponse extends StObject {
  
  /**
    * The attack that you requested. 
    */
  var Attack: js.UndefOr[AttackDetail] = js.undefined
}
object DescribeAttackResponse {
  
  inline def apply(): DescribeAttackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAttackResponse]
  }
  
  extension [Self <: DescribeAttackResponse](x: Self) {
    
    inline def setAttack(value: AttackDetail): Self = StObject.set(x, "Attack", value.asInstanceOf[js.Any])
    
    inline def setAttackUndefined: Self = StObject.set(x, "Attack", js.undefined)
  }
}
