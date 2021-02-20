package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateParam extends StObject {
  
  /**
    * The keys associated with an update request.
    */
  var `type`: js.UndefOr[UpdateParamType] = js.native
  
  /**
    * The value of the keys submitted as part of an update request.
    */
  var value: js.UndefOr[String] = js.native
}
object UpdateParam {
  
  @scala.inline
  def apply(): UpdateParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParam]
  }
  
  @scala.inline
  implicit class UpdateParamMutableBuilder[Self <: UpdateParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UpdateParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
