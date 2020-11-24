package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Parameters extends js.Object {
  
  /**
    * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded in the console.
    */
  var ManifestFileLocation: typings.awsSdk.quicksightMod.ManifestFileLocation = js.native
}
object S3Parameters {
  
  @scala.inline
  def apply(ManifestFileLocation: ManifestFileLocation): S3Parameters = {
    val __obj = js.Dynamic.literal(ManifestFileLocation = ManifestFileLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Parameters]
  }
  
  @scala.inline
  implicit class S3ParametersOps[Self <: S3Parameters] (val x: Self) extends AnyVal {
    
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
    def setManifestFileLocation(value: ManifestFileLocation): Self = this.set("ManifestFileLocation", value.asInstanceOf[js.Any])
  }
}
