package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostPath extends StObject {
  
  /**
    * Path of the file or directory on the host that the volume maps to.
    */
  var Path: js.UndefOr[String] = js.undefined
}
object HostPath {
  
  inline def apply(): HostPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostPath]
  }
  
  extension [Self <: HostPath](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
