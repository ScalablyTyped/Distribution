package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectInput extends StObject {
  
  /**
    * The name of the build project.
    */
  var name: NonEmptyString
}
object DeleteProjectInput {
  
  @scala.inline
  def apply(name: NonEmptyString): DeleteProjectInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectInput]
  }
  
  @scala.inline
  implicit class DeleteProjectInputMutableBuilder[Self <: DeleteProjectInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
