package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryBuildOutput extends StObject {
  
  var build: js.UndefOr[Build] = js.native
}
object RetryBuildOutput {
  
  @scala.inline
  def apply(): RetryBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildOutput]
  }
  
  @scala.inline
  implicit class RetryBuildOutputMutableBuilder[Self <: RetryBuildOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
