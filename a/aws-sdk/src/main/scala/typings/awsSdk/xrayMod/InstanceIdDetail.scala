package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceIdDetail extends StObject {
  
  /**
    * The ID of a corresponding EC2 instance.
    */
  var Id: js.UndefOr[String] = js.native
}
object InstanceIdDetail {
  
  @scala.inline
  def apply(): InstanceIdDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIdDetail]
  }
  
  @scala.inline
  implicit class InstanceIdDetailMutableBuilder[Self <: InstanceIdDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
