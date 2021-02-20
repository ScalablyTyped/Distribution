package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetBuildsOutput extends StObject {
  
  /**
    * Information about the requested builds.
    */
  var builds: js.UndefOr[Builds] = js.native
  
  /**
    * The IDs of builds for which information could not be found.
    */
  var buildsNotFound: js.UndefOr[BuildIds] = js.native
}
object BatchGetBuildsOutput {
  
  @scala.inline
  def apply(): BatchGetBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBuildsOutput]
  }
  
  @scala.inline
  implicit class BatchGetBuildsOutputMutableBuilder[Self <: BatchGetBuildsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuilds(value: Builds): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsNotFound(value: BuildIds): Self = StObject.set(x, "buildsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsNotFoundUndefined: Self = StObject.set(x, "buildsNotFound", js.undefined)
    
    @scala.inline
    def setBuildsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "buildsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setBuildsUndefined: Self = StObject.set(x, "builds", js.undefined)
    
    @scala.inline
    def setBuildsVarargs(value: Build*): Self = StObject.set(x, "builds", js.Array(value :_*))
  }
}
