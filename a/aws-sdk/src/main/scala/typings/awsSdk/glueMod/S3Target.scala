package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Target extends StObject {
  
  /**
    * The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon Virtual Private Cloud environment (Amazon VPC).
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.glueMod.ConnectionName] = js.native
  
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.native
  
  /**
    * The path to the Amazon S3 target.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.native
}
object S3Target {
  
  @scala.inline
  def apply(): S3Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Target]
  }
  
  @scala.inline
  implicit class S3TargetMutableBuilder[Self <: S3Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    @scala.inline
    def setExclusions(value: PathList): Self = StObject.set(x, "Exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "Exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: Path*): Self = StObject.set(x, "Exclusions", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
