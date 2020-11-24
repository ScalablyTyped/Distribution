package typings.codependency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyInfo extends js.Object {
  
  var installedVersion: String | Null = js.native
  
  var isInstalled: Boolean | Null = js.native
  
  var isValid: Boolean | Null = js.native
  
  var pkgPath: String = js.native
  
  var supportedRange: String | Null = js.native
}
object DependencyInfo {
  
  @scala.inline
  def apply(pkgPath: String): DependencyInfo = {
    val __obj = js.Dynamic.literal(pkgPath = pkgPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyInfo]
  }
  
  @scala.inline
  implicit class DependencyInfoOps[Self <: DependencyInfo] (val x: Self) extends AnyVal {
    
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
    def setPkgPath(value: String): Self = this.set("pkgPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledVersion(value: String): Self = this.set("installedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledVersionNull: Self = this.set("installedVersion", null)
    
    @scala.inline
    def setIsInstalled(value: Boolean): Self = this.set("isInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInstalledNull: Self = this.set("isInstalled", null)
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidNull: Self = this.set("isValid", null)
    
    @scala.inline
    def setSupportedRange(value: String): Self = this.set("supportedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRangeNull: Self = this.set("supportedRange", null)
  }
}
