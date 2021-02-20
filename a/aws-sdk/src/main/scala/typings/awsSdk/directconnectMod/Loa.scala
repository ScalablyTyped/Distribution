package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loa extends StObject {
  
  /**
    * The binary contents of the LOA-CFA document.
    */
  var loaContent: js.UndefOr[LoaContent] = js.native
  
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
}
object Loa {
  
  @scala.inline
  def apply(): Loa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loa]
  }
  
  @scala.inline
  implicit class LoaMutableBuilder[Self <: Loa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoaContent(value: LoaContent): Self = StObject.set(x, "loaContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaContentType(value: LoaContentType): Self = StObject.set(x, "loaContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaContentTypeUndefined: Self = StObject.set(x, "loaContentType", js.undefined)
    
    @scala.inline
    def setLoaContentUndefined: Self = StObject.set(x, "loaContent", js.undefined)
  }
}
