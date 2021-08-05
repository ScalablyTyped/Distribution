package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Target extends StObject {
  
  /**
    * The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon Virtual Private Cloud environment (Amazon VPC).
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.glueMod.ConnectionName] = js.undefined
  
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.undefined
  
  /**
    * The path to the Amazon S3 target.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.undefined
}
object S3Target {
  
  inline def apply(): S3Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Target]
  }
  
  extension [Self <: S3Target](x: Self) {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setExclusions(value: PathList): Self = StObject.set(x, "Exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "Exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: Path*): Self = StObject.set(x, "Exclusions", js.Array(value :_*))
    
    inline def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
