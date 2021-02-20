package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interconnects extends StObject {
  
  /**
    * The interconnects.
    */
  var interconnects: js.UndefOr[InterconnectList] = js.native
}
object Interconnects {
  
  @scala.inline
  def apply(): Interconnects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnects]
  }
  
  @scala.inline
  implicit class InterconnectsMutableBuilder[Self <: Interconnects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterconnects(value: InterconnectList): Self = StObject.set(x, "interconnects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectsUndefined: Self = StObject.set(x, "interconnects", js.undefined)
    
    @scala.inline
    def setInterconnectsVarargs(value: Interconnect*): Self = StObject.set(x, "interconnects", js.Array(value :_*))
  }
}
