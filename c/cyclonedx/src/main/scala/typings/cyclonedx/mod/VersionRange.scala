package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cyclonedx.anon.Range
  - typings.cyclonedx.anon.Version
*/
trait VersionRange extends StObject
object VersionRange {
  
  inline def Range(version: String): typings.cyclonedx.anon.Range = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.anon.Range]
  }
  
  inline def Version(range: String): typings.cyclonedx.anon.Version = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.anon.Version]
  }
}
