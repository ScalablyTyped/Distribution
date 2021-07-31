package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutpostInput extends StObject {
  
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId
}
object DeleteOutpostInput {
  
  @scala.inline
  def apply(OutpostId: OutpostId): DeleteOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutpostInput]
  }
  
  @scala.inline
  implicit class DeleteOutpostInputMutableBuilder[Self <: DeleteOutpostInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
