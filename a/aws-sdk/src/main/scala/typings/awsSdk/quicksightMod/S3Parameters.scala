package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Parameters extends StObject {
  
  /**
    * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded in the console.
    */
  var ManifestFileLocation: typings.awsSdk.quicksightMod.ManifestFileLocation
}
object S3Parameters {
  
  @scala.inline
  def apply(ManifestFileLocation: ManifestFileLocation): S3Parameters = {
    val __obj = js.Dynamic.literal(ManifestFileLocation = ManifestFileLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Parameters]
  }
  
  @scala.inline
  implicit class S3ParametersMutableBuilder[Self <: S3Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifestFileLocation(value: ManifestFileLocation): Self = StObject.set(x, "ManifestFileLocation", value.asInstanceOf[js.Any])
  }
}
