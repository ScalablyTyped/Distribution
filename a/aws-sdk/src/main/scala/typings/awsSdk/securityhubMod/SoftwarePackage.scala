package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftwarePackage extends StObject {
  
  /**
    * The architecture used for the software package.
    */
  var Architecture: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The epoch of the software package.
    */
  var Epoch: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the software package.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The release of the software package.
    */
  var Release: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version of the software package.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
}
object SoftwarePackage {
  
  @scala.inline
  def apply(): SoftwarePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwarePackage]
  }
  
  @scala.inline
  implicit class SoftwarePackageMutableBuilder[Self <: SoftwarePackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: NonEmptyString): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    @scala.inline
    def setEpoch(value: NonEmptyString): Self = StObject.set(x, "Epoch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpochUndefined: Self = StObject.set(x, "Epoch", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRelease(value: NonEmptyString): Self = StObject.set(x, "Release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "Release", js.undefined)
    
    @scala.inline
    def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
