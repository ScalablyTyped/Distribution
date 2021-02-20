package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueHolder extends StObject {
  
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure.
    */
  var IonText: js.UndefOr[typings.awsSdk.qldbMod.IonText] = js.native
}
object ValueHolder {
  
  @scala.inline
  def apply(): ValueHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueHolder]
  }
  
  @scala.inline
  implicit class ValueHolderMutableBuilder[Self <: ValueHolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIonText(value: IonText): Self = StObject.set(x, "IonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonTextUndefined: Self = StObject.set(x, "IonText", js.undefined)
  }
}
