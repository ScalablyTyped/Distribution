package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionGroupOptionsMessage extends StObject {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined
}
object OptionGroupOptionsMessage {
  
  @scala.inline
  def apply(): OptionGroupOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOptionsMessage]
  }
  
  @scala.inline
  implicit class OptionGroupOptionsMessageMutableBuilder[Self <: OptionGroupOptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOptionGroupOptions(value: OptionGroupOptionsList): Self = StObject.set(x, "OptionGroupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupOptionsUndefined: Self = StObject.set(x, "OptionGroupOptions", js.undefined)
    
    @scala.inline
    def setOptionGroupOptionsVarargs(value: OptionGroupOption*): Self = StObject.set(x, "OptionGroupOptions", js.Array(value :_*))
  }
}
