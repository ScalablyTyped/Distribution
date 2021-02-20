package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyGroupSummary extends StObject {
  
  /**
    * A key group.
    */
  var KeyGroup: typings.awsSdk.cloudfrontMod.KeyGroup = js.native
}
object KeyGroupSummary {
  
  @scala.inline
  def apply(KeyGroup: KeyGroup): KeyGroupSummary = {
    val __obj = js.Dynamic.literal(KeyGroup = KeyGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroupSummary]
  }
  
  @scala.inline
  implicit class KeyGroupSummaryMutableBuilder[Self <: KeyGroupSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyGroup(value: KeyGroup): Self = StObject.set(x, "KeyGroup", value.asInstanceOf[js.Any])
  }
}
