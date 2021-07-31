package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoggerLevel extends StObject
@JSGlobal("cast.framework.LoggerLevel")
@js.native
object LoggerLevel extends StObject {
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LoggerLevel
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LoggerLevel
  
  @js.native
  sealed trait INFO
    extends StObject
       with LoggerLevel
  
  @js.native
  sealed trait NONE
    extends StObject
       with LoggerLevel
  
  @js.native
  sealed trait WARNING
    extends StObject
       with LoggerLevel
}
