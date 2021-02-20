package typings.bip174.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtGlobalUpdate extends StObject {
  
  var globalXpub: js.UndefOr[js.Array[GlobalXpub]] = js.native
}
object PsbtGlobalUpdate {
  
  @scala.inline
  def apply(): PsbtGlobalUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtGlobalUpdate]
  }
  
  @scala.inline
  implicit class PsbtGlobalUpdateMutableBuilder[Self <: PsbtGlobalUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalXpub(value: js.Array[GlobalXpub]): Self = StObject.set(x, "globalXpub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalXpubUndefined: Self = StObject.set(x, "globalXpub", js.undefined)
    
    @scala.inline
    def setGlobalXpubVarargs(value: GlobalXpub*): Self = StObject.set(x, "globalXpub", js.Array(value :_*))
  }
}
