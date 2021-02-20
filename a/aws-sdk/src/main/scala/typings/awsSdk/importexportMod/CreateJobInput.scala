package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  
  var JobType: typings.awsSdk.importexportMod.JobType = js.native
  
  var Manifest: typings.awsSdk.importexportMod.Manifest = js.native
  
  var ManifestAddendum: js.UndefOr[typings.awsSdk.importexportMod.ManifestAddendum] = js.native
  
  var ValidateOnly: typings.awsSdk.importexportMod.ValidateOnly = js.native
}
object CreateJobInput {
  
  @scala.inline
  def apply(JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): CreateJobInput = {
    val __obj = js.Dynamic.literal(JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobInput]
  }
  
  @scala.inline
  implicit class CreateJobInputMutableBuilder[Self <: CreateJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: Manifest): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestAddendum(value: ManifestAddendum): Self = StObject.set(x, "ManifestAddendum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestAddendumUndefined: Self = StObject.set(x, "ManifestAddendum", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: ValidateOnly): Self = StObject.set(x, "ValidateOnly", value.asInstanceOf[js.Any])
  }
}
