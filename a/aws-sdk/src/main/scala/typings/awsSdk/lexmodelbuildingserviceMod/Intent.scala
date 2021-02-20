package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Intent extends StObject {
  
  /**
    * The name of the intent.
    */
  var intentName: IntentName = js.native
  
  /**
    * The version of the intent.
    */
  var intentVersion: Version = js.native
}
object Intent {
  
  @scala.inline
  def apply(intentName: IntentName, intentVersion: Version): Intent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], intentVersion = intentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
  
  @scala.inline
  implicit class IntentMutableBuilder[Self <: Intent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntentName(value: IntentName): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentVersion(value: Version): Self = StObject.set(x, "intentVersion", value.asInstanceOf[js.Any])
  }
}
