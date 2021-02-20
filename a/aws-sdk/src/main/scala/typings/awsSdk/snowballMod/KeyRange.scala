package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyRange extends StObject {
  
  /**
    * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var BeginMarker: js.UndefOr[String] = js.native
  
  /**
    * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var EndMarker: js.UndefOr[String] = js.native
}
object KeyRange {
  
  @scala.inline
  def apply(): KeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRange]
  }
  
  @scala.inline
  implicit class KeyRangeMutableBuilder[Self <: KeyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginMarker(value: String): Self = StObject.set(x, "BeginMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginMarkerUndefined: Self = StObject.set(x, "BeginMarker", js.undefined)
    
    @scala.inline
    def setEndMarker(value: String): Self = StObject.set(x, "EndMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMarkerUndefined: Self = StObject.set(x, "EndMarker", js.undefined)
  }
}
