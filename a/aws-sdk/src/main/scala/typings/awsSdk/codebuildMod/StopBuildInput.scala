package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBuildInput extends StObject {
  
  /**
    * The ID of the build.
    */
  var id: NonEmptyString
}
object StopBuildInput {
  
  @scala.inline
  def apply(id: NonEmptyString): StopBuildInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBuildInput]
  }
  
  @scala.inline
  implicit class StopBuildInputMutableBuilder[Self <: StopBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
