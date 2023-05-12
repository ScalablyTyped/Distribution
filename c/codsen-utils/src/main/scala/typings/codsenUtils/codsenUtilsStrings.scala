package typings.codsenUtils

import typings.codsenUtils.mod.EolChar
import typings.codsenUtils.mod.EolSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codsenUtilsStrings {
  
  @js.native
  sealed trait Carriagereturn
    extends StObject
       with EolChar
  inline def Carriagereturn: Carriagereturn = "\r".asInstanceOf[Carriagereturn]
  
  @js.native
  sealed trait CarriagereturnLinefeed
    extends StObject
       with EolChar
  inline def CarriagereturnLinefeed: CarriagereturnLinefeed = "\r\n".asInstanceOf[CarriagereturnLinefeed]
  
  @js.native
  sealed trait Linefeed
    extends StObject
       with EolChar
  inline def Linefeed: Linefeed = "\n".asInstanceOf[Linefeed]
  
  @js.native
  sealed trait cr
    extends StObject
       with EolSetting
  inline def cr: cr = "cr".asInstanceOf[cr]
  
  @js.native
  sealed trait crlf
    extends StObject
       with EolSetting
  inline def crlf: crlf = "crlf".asInstanceOf[crlf]
  
  @js.native
  sealed trait lf
    extends StObject
       with EolSetting
  inline def lf: lf = "lf".asInstanceOf[lf]
}
