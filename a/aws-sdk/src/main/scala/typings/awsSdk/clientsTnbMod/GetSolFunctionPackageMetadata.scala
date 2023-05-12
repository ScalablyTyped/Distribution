package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionPackageMetadata extends StObject {
  
  /**
    * The date that the resource was created.
    */
  var createdAt: js.Date
  
  /**
    * The date that the resource was last modified.
    */
  var lastModified: js.Date
  
  /**
    * Metadata related to the function package descriptor of the function package.
    */
  var vnfd: js.UndefOr[FunctionArtifactMeta] = js.undefined
}
object GetSolFunctionPackageMetadata {
  
  inline def apply(createdAt: js.Date, lastModified: js.Date): GetSolFunctionPackageMetadata = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolFunctionPackageMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionPackageMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setVnfd(value: FunctionArtifactMeta): Self = StObject.set(x, "vnfd", value.asInstanceOf[js.Any])
    
    inline def setVnfdUndefined: Self = StObject.set(x, "vnfd", js.undefined)
  }
}
