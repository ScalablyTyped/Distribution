package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBlobsOptions extends ListContainersOptions {
  
  var delimiter: js.UndefOr[String] = js.native
}
object ListBlobsOptions {
  
  @scala.inline
  def apply(marker: String): ListBlobsOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBlobsOptions]
  }
  
  @scala.inline
  implicit class ListBlobsOptionsMutableBuilder[Self <: ListBlobsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
  }
}
