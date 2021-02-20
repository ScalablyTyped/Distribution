package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends StObject {
  
  val BuildVersion: Double = js.native
  
  val MajorVersion: Double = js.native
  
  val MinorVersion: Double = js.native
  
  val toStringDefault: String = js.native
}
object Version {
  
  @scala.inline
  def apply(BuildVersion: Double, MajorVersion: Double, MinorVersion: Double, toStringDefault: String): Version = {
    val __obj = js.Dynamic.literal(BuildVersion = BuildVersion.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], toStringDefault = toStringDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildVersion(value: Double): Self = StObject.set(x, "BuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: Double): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: Double): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStringDefault(value: String): Self = StObject.set(x, "toStringDefault", value.asInstanceOf[js.Any])
  }
}
