package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  val BuildVersion: Double
  
  val MajorVersion: Double
  
  val MinorVersion: Double
  
  val toStringDefault: String
}
object Version {
  
  inline def apply(BuildVersion: Double, MajorVersion: Double, MinorVersion: Double, toStringDefault: String): Version = {
    val __obj = js.Dynamic.literal(BuildVersion = BuildVersion.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], toStringDefault = toStringDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    inline def setBuildVersion(value: Double): Self = StObject.set(x, "BuildVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    inline def setToStringDefault(value: String): Self = StObject.set(x, "toStringDefault", value.asInstanceOf[js.Any])
  }
}
