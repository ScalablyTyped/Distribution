package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceSets extends StObject {
  
  /**
    * The list of IP set references.
    */
  var IPSetReferences: js.UndefOr[IPSetReferenceMap] = js.undefined
}
object ReferenceSets {
  
  inline def apply(): ReferenceSets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceSets]
  }
  
  extension [Self <: ReferenceSets](x: Self) {
    
    inline def setIPSetReferences(value: IPSetReferenceMap): Self = StObject.set(x, "IPSetReferences", value.asInstanceOf[js.Any])
    
    inline def setIPSetReferencesUndefined: Self = StObject.set(x, "IPSetReferences", js.undefined)
  }
}
