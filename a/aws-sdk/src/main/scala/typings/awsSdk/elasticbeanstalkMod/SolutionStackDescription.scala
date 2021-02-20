package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionStackDescription extends StObject {
  
  /**
    * The permitted file types allowed for a solution stack.
    */
  var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.native
  
  /**
    * The name of the solution stack.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
}
object SolutionStackDescription {
  
  @scala.inline
  def apply(): SolutionStackDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionStackDescription]
  }
  
  @scala.inline
  implicit class SolutionStackDescriptionMutableBuilder[Self <: SolutionStackDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermittedFileTypes(value: SolutionStackFileTypeList): Self = StObject.set(x, "PermittedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermittedFileTypesUndefined: Self = StObject.set(x, "PermittedFileTypes", js.undefined)
    
    @scala.inline
    def setPermittedFileTypesVarargs(value: FileTypeExtension*): Self = StObject.set(x, "PermittedFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
  }
}
