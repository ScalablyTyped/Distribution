package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeVersion extends js.Object {
  
  /**
    * If this runtime version is deprecated, this value is the date of deprecation.
    */
  var DeprecationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the runtime version, created by Amazon.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The date that the runtime version was released.
    */
  var ReleaseDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the runtime version. For a list of valid runtime versions, see  Canary Runtime Versions.
    */
  var VersionName: js.UndefOr[String] = js.native
}
object RuntimeVersion {
  
  @scala.inline
  def apply(): RuntimeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeVersion]
  }
  
  @scala.inline
  implicit class RuntimeVersionOps[Self <: RuntimeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeprecationDate(value: Timestamp): Self = this.set("DeprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationDate: Self = this.set("DeprecationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: Timestamp): Self = this.set("ReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseDate: Self = this.set("ReleaseDate", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = this.set("VersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionName: Self = this.set("VersionName", js.undefined)
  }
}
