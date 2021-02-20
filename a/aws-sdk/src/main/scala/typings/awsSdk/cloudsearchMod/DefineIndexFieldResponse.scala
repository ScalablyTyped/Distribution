package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineIndexFieldResponse extends StObject {
  
  var IndexField: IndexFieldStatus = js.native
}
object DefineIndexFieldResponse {
  
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DefineIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexFieldResponse]
  }
  
  @scala.inline
  implicit class DefineIndexFieldResponseMutableBuilder[Self <: DefineIndexFieldResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexField(value: IndexFieldStatus): Self = StObject.set(x, "IndexField", value.asInstanceOf[js.Any])
  }
}
