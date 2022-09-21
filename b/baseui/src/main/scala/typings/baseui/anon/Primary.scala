package typings.baseui.anon

import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.tertiary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Primary extends StObject {
  
  val primary: typings.baseui.baseuiStrings.primary
  
  val secondary: typings.baseui.baseuiStrings.secondary
  
  val tertiary: typings.baseui.baseuiStrings.tertiary
}
object Primary {
  
  inline def apply(): Primary = {
    val __obj = js.Dynamic.literal(primary = "primary", secondary = "secondary", tertiary = "tertiary")
    __obj.asInstanceOf[Primary]
  }
  
  extension [Self <: Primary](x: Self) {
    
    inline def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: secondary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setTertiary(value: tertiary): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
  }
}
