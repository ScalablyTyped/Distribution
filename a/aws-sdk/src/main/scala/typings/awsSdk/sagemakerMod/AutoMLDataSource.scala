package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLDataSource extends StObject {
  
  /**
    * The Amazon S3 location of the input data.  The input data must be in CSV format and contain at least 500 rows. 
    */
  var S3DataSource: AutoMLS3DataSource = js.native
}
object AutoMLDataSource {
  
  @scala.inline
  def apply(S3DataSource: AutoMLS3DataSource): AutoMLDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLDataSource]
  }
  
  @scala.inline
  implicit class AutoMLDataSourceMutableBuilder[Self <: AutoMLDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3DataSource(value: AutoMLS3DataSource): Self = StObject.set(x, "S3DataSource", value.asInstanceOf[js.Any])
  }
}
