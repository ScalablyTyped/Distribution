package typings.baseui.anon

import typings.baseui.baseuiStrings.MQ
import typings.baseui.baseuiStrings.Martinique
import typings.baseui.baseuiStrings.Plussign596
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  val dialCode: Plussign596
  
  val id: MQ
  
  val label: Martinique
}
object `144` {
  
  inline def apply(): `144` = {
    val __obj = js.Dynamic.literal(dialCode = "+596", id = "MQ", label = "Martinique")
    __obj.asInstanceOf[`144`]
  }
  
  extension [Self <: `144`](x: Self) {
    
    inline def setDialCode(value: Plussign596): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MQ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Martinique): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
