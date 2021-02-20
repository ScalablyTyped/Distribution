package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeVersion extends StObject {
  
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
  implicit class RuntimeVersionMutableBuilder[Self <: RuntimeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecationDate(value: Timestamp): Self = StObject.set(x, "DeprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDateUndefined: Self = StObject.set(x, "DeprecationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: Timestamp): Self = StObject.set(x, "ReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDateUndefined: Self = StObject.set(x, "ReleaseDate", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
