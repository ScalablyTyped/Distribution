package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryLabelDetails extends StObject {
  
  /**
    * An optional string which is rendered less prominently after
    * {@link CompletionEntryLabelDetails.detail}. Should be used for fully qualified
    * names or file path.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An optional string which is rendered less prominently directly after
    * {@link CompletionEntry.name name}, without any spacing. Should be
    * used for function signatures or type annotations.
    */
  var detail: js.UndefOr[String] = js.undefined
}
object CompletionEntryLabelDetails {
  
  inline def apply(): CompletionEntryLabelDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionEntryLabelDetails]
  }
  
  extension [Self <: CompletionEntryLabelDetails](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
