package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityAction
  extends StObject
     with IEnum {
  
  var AcceptChanges: EntityActionSymbol
  
  var Attach: EntityActionSymbol
  
  var AttachOnImport: EntityActionSymbol
  
  var AttachOnQuery: EntityActionSymbol
  
  var Clear: EntityActionSymbol
  
  var Detach: EntityActionSymbol
  
  var EntityStateChange: EntityActionSymbol
  
  var MergeOnImport: EntityActionSymbol
  
  var MergeOnQuery: EntityActionSymbol
  
  var MergeOnSave: EntityActionSymbol
  
  var PropertyChange: EntityActionSymbol
  
  var RejectChanges: EntityActionSymbol
}
object EntityAction {
  
  inline def apply(
    AcceptChanges: EntityActionSymbol,
    Attach: EntityActionSymbol,
    AttachOnImport: EntityActionSymbol,
    AttachOnQuery: EntityActionSymbol,
    Clear: EntityActionSymbol,
    Detach: EntityActionSymbol,
    EntityStateChange: EntityActionSymbol,
    MergeOnImport: EntityActionSymbol,
    MergeOnQuery: EntityActionSymbol,
    MergeOnSave: EntityActionSymbol,
    PropertyChange: EntityActionSymbol,
    RejectChanges: EntityActionSymbol,
    contains: Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): EntityAction = {
    val __obj = js.Dynamic.literal(AcceptChanges = AcceptChanges.asInstanceOf[js.Any], Attach = Attach.asInstanceOf[js.Any], AttachOnImport = AttachOnImport.asInstanceOf[js.Any], AttachOnQuery = AttachOnQuery.asInstanceOf[js.Any], Clear = Clear.asInstanceOf[js.Any], Detach = Detach.asInstanceOf[js.Any], EntityStateChange = EntityStateChange.asInstanceOf[js.Any], MergeOnImport = MergeOnImport.asInstanceOf[js.Any], MergeOnQuery = MergeOnQuery.asInstanceOf[js.Any], MergeOnSave = MergeOnSave.asInstanceOf[js.Any], PropertyChange = PropertyChange.asInstanceOf[js.Any], RejectChanges = RejectChanges.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[EntityAction]
  }
  
  extension [Self <: EntityAction](x: Self) {
    
    inline def setAcceptChanges(value: EntityActionSymbol): Self = StObject.set(x, "AcceptChanges", value.asInstanceOf[js.Any])
    
    inline def setAttach(value: EntityActionSymbol): Self = StObject.set(x, "Attach", value.asInstanceOf[js.Any])
    
    inline def setAttachOnImport(value: EntityActionSymbol): Self = StObject.set(x, "AttachOnImport", value.asInstanceOf[js.Any])
    
    inline def setAttachOnQuery(value: EntityActionSymbol): Self = StObject.set(x, "AttachOnQuery", value.asInstanceOf[js.Any])
    
    inline def setClear(value: EntityActionSymbol): Self = StObject.set(x, "Clear", value.asInstanceOf[js.Any])
    
    inline def setDetach(value: EntityActionSymbol): Self = StObject.set(x, "Detach", value.asInstanceOf[js.Any])
    
    inline def setEntityStateChange(value: EntityActionSymbol): Self = StObject.set(x, "EntityStateChange", value.asInstanceOf[js.Any])
    
    inline def setMergeOnImport(value: EntityActionSymbol): Self = StObject.set(x, "MergeOnImport", value.asInstanceOf[js.Any])
    
    inline def setMergeOnQuery(value: EntityActionSymbol): Self = StObject.set(x, "MergeOnQuery", value.asInstanceOf[js.Any])
    
    inline def setMergeOnSave(value: EntityActionSymbol): Self = StObject.set(x, "MergeOnSave", value.asInstanceOf[js.Any])
    
    inline def setPropertyChange(value: EntityActionSymbol): Self = StObject.set(x, "PropertyChange", value.asInstanceOf[js.Any])
    
    inline def setRejectChanges(value: EntityActionSymbol): Self = StObject.set(x, "RejectChanges", value.asInstanceOf[js.Any])
  }
}
