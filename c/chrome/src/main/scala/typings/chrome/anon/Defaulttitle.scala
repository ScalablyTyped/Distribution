package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaulttitle extends StObject {
  
  var default_title: js.UndefOr[String] = js.native
  
  var file_filters: js.UndefOr[js.Array[String]] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object Defaulttitle {
  
  @scala.inline
  def apply(): Defaulttitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaulttitle]
  }
  
  @scala.inline
  implicit class DefaulttitleMutableBuilder[Self <: Defaulttitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    @scala.inline
    def setFile_filters(value: js.Array[String]): Self = StObject.set(x, "file_filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_filtersUndefined: Self = StObject.set(x, "file_filters", js.undefined)
    
    @scala.inline
    def setFile_filtersVarargs(value: String*): Self = StObject.set(x, "file_filters", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
