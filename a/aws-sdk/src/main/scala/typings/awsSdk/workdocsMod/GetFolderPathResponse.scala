package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFolderPathResponse extends StObject {
  
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.undefined
}
object GetFolderPathResponse {
  
  @scala.inline
  def apply(): GetFolderPathResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFolderPathResponse]
  }
  
  @scala.inline
  implicit class GetFolderPathResponseMutableBuilder[Self <: GetFolderPathResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: ResourcePath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
