package typings.chance.anon

import typings.chance.chanceInts.`4`
import typings.chance.chanceInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  var version: `4` | `5`
}
object Version {
  
  inline def apply(version: `4` | `5`): Version = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: `4` | `5`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
