package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerEventSource extends StObject {
  
  /**
    * The ARN of the partner event source.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the partner event source.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object PartnerEventSource {
  
  inline def apply(): PartnerEventSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerEventSource]
  }
  
  extension [Self <: PartnerEventSource](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
