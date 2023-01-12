package typings.chance.anon

import typings.chance.chanceBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var region: `true`
}
object Region {
  
  inline def apply(): Region = {
    val __obj = js.Dynamic.literal(region = true)
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setRegion(value: `true`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
