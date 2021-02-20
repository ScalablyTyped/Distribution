package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOutpostInput extends StObject {
  
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId = js.native
}
object GetOutpostInput {
  
  @scala.inline
  def apply(OutpostId: OutpostId): GetOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInput]
  }
  
  @scala.inline
  implicit class GetOutpostInputMutableBuilder[Self <: GetOutpostInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
