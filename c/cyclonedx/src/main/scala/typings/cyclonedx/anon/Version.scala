package typings.cyclonedx.anon

import typings.cyclonedx.mod.VersionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version
  extends StObject
     with VersionRange {
  
  var range: String
  
  var version: js.UndefOr[String] = js.undefined
}
object Version {
  
  inline def apply(range: String): Version = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
