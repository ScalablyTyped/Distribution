package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeVersion extends StObject {
  
  /**
    * If this runtime version is deprecated, this value is the date of deprecation.
    */
  var DeprecationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the runtime version, created by Amazon.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The date that the runtime version was released.
    */
  var ReleaseDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the runtime version. For a list of valid runtime versions, see  Canary Runtime Versions.
    */
  var VersionName: js.UndefOr[String] = js.undefined
}
object RuntimeVersion {
  
  inline def apply(): RuntimeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeVersion] (val x: Self) extends AnyVal {
    
    inline def setDeprecationDate(value: js.Date): Self = StObject.set(x, "DeprecationDate", value.asInstanceOf[js.Any])
    
    inline def setDeprecationDateUndefined: Self = StObject.set(x, "DeprecationDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setReleaseDate(value: js.Date): Self = StObject.set(x, "ReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "ReleaseDate", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
