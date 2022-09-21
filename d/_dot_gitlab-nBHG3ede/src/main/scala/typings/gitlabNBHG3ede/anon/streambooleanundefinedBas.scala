package typings.gitlabNBHG3ede.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  stream :boolean | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.BaseRequestOptions */
trait streambooleanundefinedBas
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var stream: js.UndefOr[Boolean] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object streambooleanundefinedBas {
  
  inline def apply(): streambooleanundefinedBas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[streambooleanundefinedBas]
  }
  
  extension [Self <: streambooleanundefinedBas](x: Self) {
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
