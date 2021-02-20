package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionCodeLocation extends StObject {
  
  /**
    * A presigned URL that you can use to download the deployment package.
    */
  var Location: js.UndefOr[String] = js.native
  
  /**
    * The service that's hosting the file.
    */
  var RepositoryType: js.UndefOr[String] = js.native
}
object FunctionCodeLocation {
  
  @scala.inline
  def apply(): FunctionCodeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionCodeLocation]
  }
  
  @scala.inline
  implicit class FunctionCodeLocationMutableBuilder[Self <: FunctionCodeLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setRepositoryType(value: String): Self = StObject.set(x, "RepositoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryTypeUndefined: Self = StObject.set(x, "RepositoryType", js.undefined)
  }
}
