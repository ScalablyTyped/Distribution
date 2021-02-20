package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildNotDeleted extends StObject {
  
  /**
    * The ID of the build that could not be successfully deleted.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Additional information about the build that could not be successfully deleted.
    */
  var statusCode: js.UndefOr[String] = js.native
}
object BuildNotDeleted {
  
  @scala.inline
  def apply(): BuildNotDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildNotDeleted]
  }
  
  @scala.inline
  implicit class BuildNotDeletedMutableBuilder[Self <: BuildNotDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
