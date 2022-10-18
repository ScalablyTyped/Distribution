package typings.baseui.anon

import typings.baseui.baseuiStrings.NF
import typings.baseui.baseuiStrings.Plussign672
import typings.baseui.baseuiStrings.`Norfolk Island`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  val dialCode: Plussign672
  
  val id: NF
  
  val label: `Norfolk Island`
}
object `168` {
  
  inline def apply(): `168` = {
    val __obj = js.Dynamic.literal(dialCode = "+672", id = "NF", label = "Norfolk Island")
    __obj.asInstanceOf[`168`]
  }
  
  extension [Self <: `168`](x: Self) {
    
    inline def setDialCode(value: Plussign672): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Norfolk Island`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
