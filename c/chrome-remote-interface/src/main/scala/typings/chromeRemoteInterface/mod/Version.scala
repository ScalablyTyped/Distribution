package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  var major: String
  
  var minor: String
}
object Version {
  
  @JSImport("chrome-remote-interface", "Version")
  @js.native
  def apply(): js.Promise[VersionResult] = js.native
  @JSImport("chrome-remote-interface", "Version")
  @js.native
  def apply(callback: js.Function2[/* err */ js.Error | Null, /* info */ VersionResult, Unit]): Unit = js.native
  @JSImport("chrome-remote-interface", "Version")
  @js.native
  def apply(options: BaseOptions): js.Promise[VersionResult] = js.native
  @JSImport("chrome-remote-interface", "Version")
  @js.native
  def apply(
    options: BaseOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ VersionResult, Unit]
  ): Unit = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
