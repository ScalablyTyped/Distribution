package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JdbcTarget extends StObject {
  
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.glueMod.ConnectionName] = js.native
  
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.native
  
  /**
    * The path of the JDBC target.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.native
}
object JdbcTarget {
  
  @scala.inline
  def apply(): JdbcTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JdbcTarget]
  }
  
  @scala.inline
  implicit class JdbcTargetMutableBuilder[Self <: JdbcTarget] (val x: Self) extends AnyVal {
    
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
