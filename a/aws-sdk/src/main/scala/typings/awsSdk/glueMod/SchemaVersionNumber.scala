package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVersionNumber extends js.Object {
  
  var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.native
  
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.native
}
object SchemaVersionNumber {
  
  @scala.inline
  def apply(): SchemaVersionNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionNumber]
  }
  
  @scala.inline
  implicit class SchemaVersionNumberOps[Self <: SchemaVersionNumber] (val x: Self) extends AnyVal {
    
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
    def setLatestVersion(value: LatestSchemaVersionBoolean): Self = this.set("LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersion: Self = this.set("LatestVersion", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionLongNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
