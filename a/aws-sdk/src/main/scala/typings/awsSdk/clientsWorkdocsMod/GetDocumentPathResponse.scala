package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentPathResponse extends StObject {
  
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.undefined
}
object GetDocumentPathResponse {
  
  inline def apply(): GetDocumentPathResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentPathResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDocumentPathResponse] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ResourcePath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
