package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSummary extends StObject {
  
  /**
    * An individual label specification.
    */
  var Name: js.UndefOr[LabelName] = js.undefined
}
object LabelSummary {
  
  inline def apply(): LabelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelSummary] (val x: Self) extends AnyVal {
    
    inline def setName(value: LabelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
