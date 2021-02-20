package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKEVersionsListValue extends StObject {
  
  /**
    * The IKE version.
    */
  var Value: js.UndefOr[String] = js.native
}
object IKEVersionsListValue {
  
  @scala.inline
  def apply(): IKEVersionsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKEVersionsListValue]
  }
  
  @scala.inline
  implicit class IKEVersionsListValueMutableBuilder[Self <: IKEVersionsListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
