package typings.awsSdk.mediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObjectRequest extends StObject {
  
  /**
    * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
    */
  var Path: PathNaming
}
object DescribeObjectRequest {
  
  inline def apply(Path: PathNaming): DescribeObjectRequest = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectRequest]
  }
  
  extension [Self <: DescribeObjectRequest](x: Self) {
    
    inline def setPath(value: PathNaming): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
