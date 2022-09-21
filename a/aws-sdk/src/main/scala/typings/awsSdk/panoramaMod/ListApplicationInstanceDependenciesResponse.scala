package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationInstanceDependenciesResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.panoramaMod.NextToken] = js.undefined
  
  /**
    * A list of package objects.
    */
  var PackageObjects: js.UndefOr[typings.awsSdk.panoramaMod.PackageObjects] = js.undefined
}
object ListApplicationInstanceDependenciesResponse {
  
  inline def apply(): ListApplicationInstanceDependenciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationInstanceDependenciesResponse]
  }
  
  extension [Self <: ListApplicationInstanceDependenciesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageObjects(value: PackageObjects): Self = StObject.set(x, "PackageObjects", value.asInstanceOf[js.Any])
    
    inline def setPackageObjectsUndefined: Self = StObject.set(x, "PackageObjects", js.undefined)
    
    inline def setPackageObjectsVarargs(value: PackageObject*): Self = StObject.set(x, "PackageObjects", js.Array(value*))
  }
}
