package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LendingSummary extends StObject {
  
  /**
    * Contains an array of all DocumentGroup objects.
    */
  var DocumentGroups: js.UndefOr[DocumentGroupList] = js.undefined
  
  /**
    * UndetectedDocumentTypes.
    */
  var UndetectedDocumentTypes: js.UndefOr[UndetectedDocumentTypeList] = js.undefined
}
object LendingSummary {
  
  inline def apply(): LendingSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LendingSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LendingSummary] (val x: Self) extends AnyVal {
    
    inline def setDocumentGroups(value: DocumentGroupList): Self = StObject.set(x, "DocumentGroups", value.asInstanceOf[js.Any])
    
    inline def setDocumentGroupsUndefined: Self = StObject.set(x, "DocumentGroups", js.undefined)
    
    inline def setDocumentGroupsVarargs(value: DocumentGroup*): Self = StObject.set(x, "DocumentGroups", js.Array(value*))
    
    inline def setUndetectedDocumentTypes(value: UndetectedDocumentTypeList): Self = StObject.set(x, "UndetectedDocumentTypes", value.asInstanceOf[js.Any])
    
    inline def setUndetectedDocumentTypesUndefined: Self = StObject.set(x, "UndetectedDocumentTypes", js.undefined)
    
    inline def setUndetectedDocumentTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "UndetectedDocumentTypes", js.Array(value*))
  }
}
