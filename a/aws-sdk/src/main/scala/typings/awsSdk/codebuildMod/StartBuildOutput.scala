package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBuildOutput extends StObject {
  
  /**
    * Information about the build to be run.
    */
  var build: js.UndefOr[Build] = js.undefined
}
object StartBuildOutput {
  
  @scala.inline
  def apply(): StartBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBuildOutput]
  }
  
  @scala.inline
  implicit class StartBuildOutputMutableBuilder[Self <: StartBuildOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
