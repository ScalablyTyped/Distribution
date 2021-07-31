package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobManifest extends StObject {
  
  /**
    * Contains the information required to locate the specified job's manifest.
    */
  var Location: JobManifestLocation
  
  /**
    * Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.
    */
  var Spec: JobManifestSpec
}
object JobManifest {
  
  @scala.inline
  def apply(Location: JobManifestLocation, Spec: JobManifestSpec): JobManifest = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], Spec = Spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifest]
  }
  
  @scala.inline
  implicit class JobManifestMutableBuilder[Self <: JobManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: JobManifestLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: JobManifestSpec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
  }
}
