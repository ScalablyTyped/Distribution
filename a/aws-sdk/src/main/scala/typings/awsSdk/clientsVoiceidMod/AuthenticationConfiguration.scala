package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationConfiguration extends StObject {
  
  /**
    * The minimum threshold needed to successfully authenticate a speaker.
    */
  var AcceptanceThreshold: Score
}
object AuthenticationConfiguration {
  
  inline def apply(AcceptanceThreshold: Score): AuthenticationConfiguration = {
    val __obj = js.Dynamic.literal(AcceptanceThreshold = AcceptanceThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationConfiguration]
  }
  
  extension [Self <: AuthenticationConfiguration](x: Self) {
    
    inline def setAcceptanceThreshold(value: Score): Self = StObject.set(x, "AcceptanceThreshold", value.asInstanceOf[js.Any])
  }
}
