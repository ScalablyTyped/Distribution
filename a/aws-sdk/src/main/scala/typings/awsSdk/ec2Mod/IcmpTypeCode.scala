package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IcmpTypeCode extends StObject {
  
  /**
    * The ICMP code. A value of -1 means all codes for the specified ICMP type.
    */
  var Code: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ICMP type. A value of -1 means all types.
    */
  var Type: js.UndefOr[Integer] = js.undefined
}
object IcmpTypeCode {
  
  @scala.inline
  def apply(): IcmpTypeCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IcmpTypeCode]
  }
  
  @scala.inline
  implicit class IcmpTypeCodeMutableBuilder[Self <: IcmpTypeCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Integer): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setType(value: Integer): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
