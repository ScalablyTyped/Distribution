package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainTransferability extends StObject {
  
  var Transferable: js.UndefOr[typings.awsSdk.route53domainsMod.Transferable] = js.undefined
}
object DomainTransferability {
  
  @scala.inline
  def apply(): DomainTransferability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainTransferability]
  }
  
  @scala.inline
  implicit class DomainTransferabilityMutableBuilder[Self <: DomainTransferability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransferable(value: Transferable): Self = StObject.set(x, "Transferable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferableUndefined: Self = StObject.set(x, "Transferable", js.undefined)
  }
}
