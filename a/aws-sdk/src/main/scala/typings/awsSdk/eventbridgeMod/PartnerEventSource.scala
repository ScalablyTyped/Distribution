package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerEventSource extends StObject {
  
  /**
    * The ARN of the partner event source.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The name of the partner event source.
    */
  var Name: js.UndefOr[String] = js.native
}
object PartnerEventSource {
  
  @scala.inline
  def apply(): PartnerEventSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerEventSource]
  }
  
  @scala.inline
  implicit class PartnerEventSourceMutableBuilder[Self <: PartnerEventSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
