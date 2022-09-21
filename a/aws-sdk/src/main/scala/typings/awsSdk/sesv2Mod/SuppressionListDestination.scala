package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressionListDestination extends StObject {
  
  /**
    * The type of action to perform on the address. The following are possible values:   PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new value.   DELETE: remove the addresses from the suppression list.  
    */
  var SuppressionListImportAction: typings.awsSdk.sesv2Mod.SuppressionListImportAction
}
object SuppressionListDestination {
  
  inline def apply(SuppressionListImportAction: SuppressionListImportAction): SuppressionListDestination = {
    val __obj = js.Dynamic.literal(SuppressionListImportAction = SuppressionListImportAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionListDestination]
  }
  
  extension [Self <: SuppressionListDestination](x: Self) {
    
    inline def setSuppressionListImportAction(value: SuppressionListImportAction): Self = StObject.set(x, "SuppressionListImportAction", value.asInstanceOf[js.Any])
  }
}
