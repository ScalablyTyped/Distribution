package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportedEnvironmentVariable extends StObject {
  
  /**
    *  The name of this exported environment variable. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The value assigned to this exported environment variable.    During a build, the value of a variable is available starting with the install phase. It can be updated between the start of the install phase and the end of the post_build phase. After the post_build phase ends, the value of exported variables cannot change. 
    */
  var value: js.UndefOr[String] = js.native
}
object ExportedEnvironmentVariable {
  
  @scala.inline
  def apply(): ExportedEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportedEnvironmentVariable]
  }
  
  @scala.inline
  implicit class ExportedEnvironmentVariableMutableBuilder[Self <: ExportedEnvironmentVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
