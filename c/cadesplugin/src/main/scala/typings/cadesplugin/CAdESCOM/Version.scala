package typings.cadesplugin.CAdESCOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends js.Object {
  
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
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildVersion(value: Double): Self = this.set("BuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("MajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStringDefault(value: String): Self = this.set("toStringDefault", value.asInstanceOf[js.Any])
  }
}
