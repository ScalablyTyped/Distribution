package typings.bip174.srcLibInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PsbtGlobalUpdate extends StObject {
  
  var globalXpub: js.UndefOr[js.Array[GlobalXpub]] = js.undefined
}
object PsbtGlobalUpdate {
  
  inline def apply(): PsbtGlobalUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtGlobalUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PsbtGlobalUpdate] (val x: Self) extends AnyVal {
    
    inline def setGlobalXpub(value: js.Array[GlobalXpub]): Self = StObject.set(x, "globalXpub", value.asInstanceOf[js.Any])
    
    inline def setGlobalXpubUndefined: Self = StObject.set(x, "globalXpub", js.undefined)
    
    inline def setGlobalXpubVarargs(value: GlobalXpub*): Self = StObject.set(x, "globalXpub", js.Array(value*))
  }
}
