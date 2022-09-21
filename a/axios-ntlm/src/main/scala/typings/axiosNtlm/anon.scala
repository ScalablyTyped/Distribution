package typings.axiosNtlm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Challenge extends StObject {
    
    var challenge: Any
    
    var encoding: String
    
    var flags: Any
    
    var targetName: Any
    
    var version: Double
  }
  object Challenge {
    
    inline def apply(challenge: Any, encoding: String, flags: Any, targetName: Any, version: Double): Challenge = {
      val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Challenge]
    }
    
    extension [Self <: Challenge](x: Self) {
      
      inline def setChallenge(value: Any): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: Any): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
