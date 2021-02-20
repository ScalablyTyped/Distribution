package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexFieldStatus extends StObject {
  
  var Options: IndexField = js.native
  
  var Status: OptionStatus = js.native
}
object IndexFieldStatus {
  
  @scala.inline
  def apply(Options: IndexField, Status: OptionStatus): IndexFieldStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexFieldStatus]
  }
  
  @scala.inline
  implicit class IndexFieldStatusMutableBuilder[Self <: IndexFieldStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: IndexField): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
