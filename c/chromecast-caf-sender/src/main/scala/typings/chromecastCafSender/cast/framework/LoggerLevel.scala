package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggerLevel extends js.Object

@JSGlobal("cast.framework.LoggerLevel")
@js.native
object LoggerLevel extends js.Object {
  @js.native
  sealed trait DEBUG extends LoggerLevel
  
  @js.native
  sealed trait ERROR extends LoggerLevel
  
  @js.native
  sealed trait INFO extends LoggerLevel
  
  @js.native
  sealed trait NONE extends LoggerLevel
  
  @js.native
  sealed trait WARNING extends LoggerLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggerLevel with Double] = js.native
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 3 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 1 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  /* 4 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object WARNING extends TopLevel[WARNING with Double]
  
}

