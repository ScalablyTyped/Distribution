package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildNotDeleted extends StObject {
  
  /**
    * The ID of the build that could not be successfully deleted.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Additional information about the build that could not be successfully deleted.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}
object BuildNotDeleted {
  
  inline def apply(): BuildNotDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildNotDeleted]
  }
  
  extension [Self <: BuildNotDeleted](x: Self) {
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
