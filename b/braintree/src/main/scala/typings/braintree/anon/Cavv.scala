package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cavv extends StObject {
  
  var cavv: js.UndefOr[String] = js.native
  
  var eciFlag: String = js.native
  
  var threeDSecureVision: js.UndefOr[String] = js.native
  
  var xid: js.UndefOr[String] = js.native
}
object Cavv {
  
  @scala.inline
  def apply(eciFlag: String): Cavv = {
    val __obj = js.Dynamic.literal(eciFlag = eciFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cavv]
  }
  
  @scala.inline
  implicit class CavvMutableBuilder[Self <: Cavv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCavv(value: String): Self = StObject.set(x, "cavv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCavvUndefined: Self = StObject.set(x, "cavv", js.undefined)
    
    @scala.inline
    def setEciFlag(value: String): Self = StObject.set(x, "eciFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureVision(value: String): Self = StObject.set(x, "threeDSecureVision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureVisionUndefined: Self = StObject.set(x, "threeDSecureVision", js.undefined)
    
    @scala.inline
    def setXid(value: String): Self = StObject.set(x, "xid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXidUndefined: Self = StObject.set(x, "xid", js.undefined)
  }
}
