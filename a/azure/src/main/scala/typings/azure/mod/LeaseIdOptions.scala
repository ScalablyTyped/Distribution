package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaseIdOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var leaseId: js.UndefOr[String] = js.undefined
}
object LeaseIdOptions {
  
  @scala.inline
  def apply(): LeaseIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseIdOptions]
  }
  
  @scala.inline
  implicit class LeaseIdOptionsMutableBuilder[Self <: LeaseIdOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaseId(value: String): Self = StObject.set(x, "leaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseIdUndefined: Self = StObject.set(x, "leaseId", js.undefined)
  }
}
